package Pset52.barcode;

import java.util.Objects;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10B Introduction to Computer Science Using Java II
 * Professor Dr. Henry Leitner
 * Teaching Assistant Brandon Tineo
 * Received help from Dharmendra Prasad
 *
 * @author Kevin Phillips
 * @since 3/3/17
 */

class BarCode {
	private String zipCode;
	private String barCode;



    BarCode(String arg) {

		if (arg != null) {
			// if the length of the argument is 5, its a zip code.
			if (arg.length() == 5) {
				zipCode = arg;
				// encode the zip code into bar code
				this.barCode = encode(zipCode);
				// if the resultant bar code is empty, throw an exception.
				// Possibly the supplied zip code is not valid.
				if (Objects.equals(this.barCode, ""))
					throw new IllegalArgumentException("Illegal zip code values: " + arg);
			} // if the argument is 32 characters long, its a bar code.
			else if (arg.length() == 32) {
				barCode = arg;
				// decode the bar code to get the zip code.
				this.zipCode = decode(barCode);
				// if the resultant zip code is empty, throw an exception.
				// Possibly the supplied bar code is not valid.
				if (Objects.equals(this.zipCode, ""))
					throw new IllegalArgumentException("Illegal bar code values: " + arg);
			}
		}
	}

	public String getZipCode() {
		return zipCode;
	}

	public String getBarCode() {
		return barCode;
	}

	// helper method, returns the coded pattern for digits through 0-9, returns
	// an empty string for any invalid digit
	private String digitToCode(int digit) {
		if (digit <= 9 && digit >= 0) {
			switch (digit) {
			case 0:
				return "||:::";
			case 1:
				return ":::||";
			case 2:
				return "::|:|";
			case 3:
				return "::||:";
			case 4:
				return ":|::|";
			case 5:
				return ":|:|:";
			case 6:
				return ":||::";
			case 7:
				return "|:::|";
			case 8:
				return "|::|:";
			case 9:
				return "|:|::";
			default:
				return "";
			}
		}
		return "";
	}

	// returns the digit between 0 - 9 for a five character code
	private int codeToDigit(String code) {
		int[] digitCode = new int[] { 7, 4, 2, 1, 0 };
		int sum = 0;
		// sum up the digits for each character in the code string.
		for (int i = 0; i < code.length(); i++) {
			if (code.charAt(i) == '|') {
				sum += digitCode[i];
			}
		}

		// if the sum is 11, the digit is 0. Hence return 0
		if (sum == 11)
			return 0;

		// otherwise return the sum
		return sum;
	}

	// the method tests if the bar code is valid.
	private boolean isValidBarCode(String barCode) {
		// return false if the bar code is null or invalid length. valid length
		// is 32
		if (barCode == null || barCode.length() != 32)
			return false;

		// return false if the bar code does not start and ends with |
		if (barCode.charAt(0) != '|' || barCode.charAt(barCode.length() - 1) != '|')
			return false;

		int sum = 0;
		// for the valid codes in the bar code, sum the digits, if any of the
		// digit is beyond 0-9 return false
		for (int i = 1; i < barCode.length() - 6; i += 5) {
			int digit = codeToDigit(barCode.substring(i, i + 5));
			if (digit >= 0 && digit <= 9)
				sum += digit;
			else
				return false;
		}

		// find the check digit for the sum
		int checkDigit = getCheckDigit(sum);
		// find the code for the check digit
		String checkDigitCode = digitToCode(checkDigit);
		String checkDigitInBarCode = barCode.substring(26, 31);

		// check if the check code in the bar code is equal to the check code
		// obtained from the sum. If not, then return false
		if (!checkDigitInBarCode.equals(checkDigitCode)) {
			return false;
		}

		// else return true
		return true;
	}

	// return true if the zip code is valid, false otherwise
	private boolean isValidZipCode(String zipCode) {
		// return false if the length is not 5. A valid zip has length 5
		if (zipCode.length() != 5)
			return false;

		// check for each digit in the zip code, they must be between 0-9 both
		// inclusive
		for (int i = 0; i < zipCode.length(); i++) {
			if (zipCode.charAt(i) > '9' || zipCode.charAt(i) < '0') {
				// return false if the digits don't lie within 0-9
				return false;
			}
		}

		// otherwise return true
		return true;
	}

	// returns the check digit for the given sum
	private int getCheckDigit(int sum) {
		int lastDigit = sum % 10;
        return 10 - lastDigit;
	}

	// encodes a zip code
	private String encode(String zip) {

		// check if the zip code is valid, return an empty string if it is not.
		if (!isValidZipCode(zip))
			return "";

		// build the bar code, add the start bar
		StringBuilder sb = new StringBuilder("|");

		int sum = 0;
		// meanwhile also calculate the sum, it will be helpful in calculating
		// the check digit
		for (int i = 0; i < zip.length(); i++) {
			sum += zip.charAt(i) - '0';
			// keep building the bar code for each digit in the zip
			sb.append(digitToCode(zip.charAt(i) - '0'));
		}

		// find the check digit
		int checkDigit = getCheckDigit(sum);
		// find the code for check digit and append it to the barcode
		sb.append(digitToCode((char) checkDigit));
		// add the ending bar to the barcode string
		sb.append("|");
		// return the barcode string
		return sb.toString();
	}

	// decodes a barcode to a zip code
	private String decode(String barCode) {
		// check if the barcode is valid, return an empty string if it's not.
		if (!isValidBarCode(barCode))
			return "";

		// for each consecutive 5 characters in the barcode, excluding the first
		// character and the characters responsible for the check digit, find a
		// digit of the zip code.
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < barCode.length() - 6; i += 5) {
			// add on the digits to form the complete zip code
			sb.append(codeToDigit(barCode.substring(i, i + 5)));
		}

		// return the zip code string.
		return sb.toString();
	}

}
