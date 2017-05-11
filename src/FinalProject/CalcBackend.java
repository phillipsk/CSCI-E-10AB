package com.prob7;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalcBackend {

	private StringBuilder num1 = new StringBuilder();
	private StringBuilder num2 = new StringBuilder();
	int lastNumber = -1;
	private char operation = ' ';
	private boolean isDate = false;
	private double result = -99999.0;
	private String resultStr = "";

	public void feedChar(char c) {
		// unary negative
		if (c == 'N') {
			result = 0 - result;
			// clear
		} else if (c == 'c') {
			num1 = new StringBuilder();
			num2 = new StringBuilder();
			operation = ' ';
			result = 0.0;
			lastNumber = -1;

			// handle arithmetic
		} else if (c == '+' || c == '-' || c == '*' || c == '/') {
			if (num1.length() > 0 && num2.length() > 0) {
				try {
					float n1 = Float.parseFloat(num1.toString());
					float n2 = Float.parseFloat(num2.toString());
					switch (operation) {
					case '+':
						result = n1 + n2;
						break;
					case '-':
						result = n1 - n2;
						break;
					case '*':
						result = n1 * n2;
						break;
					case '/':
						if (n2 == 0)
							result = -0.99999111;
						else
							result = n1 / n2;
						break;
					}
				} catch (Exception e) {

				}
				num1 = new StringBuilder(result + "");
				num2 = new StringBuilder();
			}
			operation = c;
			// handle digit press and decimals
		} else if ((c >= '0' && c <= '9') || c == '.') {
			if (operation == ' ') {
				if (num1.length() == 0) {
					num1.append("0");
				}
				num1.append(c);
				lastNumber = 1;
				try {
					result = Float.parseFloat(num1.toString());
				} catch (Exception e) {
				}
			} else {
				if (num2.length() == 0) {
					num2.append("0");
				}
				num2.append(c);
				lastNumber = 2;
				result = Float.parseFloat(num2.toString());
			}
			// handle square root
		} else if (c == 'q') {
			if (lastNumber == 1) {
				try {
					float parseFloat = Float.parseFloat(num1.toString());
					if (result < 0)
						result = -0.99999111;
					else {
						result = Math.sqrt(parseFloat);
					}
				} catch (Exception e) {

				}
			} else if (lastNumber == 2) {
				try {
					float parseFloat = Float.parseFloat(num2.toString());
					if (parseFloat < 0)
						result = -0.99999111;
					else {
						result = Math.sqrt(parseFloat);
						if (operation != ' ') {
							num2 = new StringBuilder(result + "");
						}
					}
				} catch (Exception e) {

				}
			} else if (lastNumber == 3) {
				if (result < 0)
					result = -0.99999111;
				else
					result = Math.sqrt(result);
			}
		}
		// handle equals
		if (c == '=') {

			if (isDate) {
				String num = null;
				if (lastNumber == 2)
					num = num2.toString();
				else
					num = num1.toString();
				long parseLong = Long.parseLong(num);
				System.out.println(parseLong);
				SimpleDateFormat sdf = new SimpleDateFormat("MMddyyyy");
				try {
					Date parsedDate = sdf.parse(parseLong + "");
					System.out.println(parsedDate);
					SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
					resultStr = sdf2.format(parsedDate);
					result = -0.99999112;
					num1 = new StringBuilder();
					num2 = new StringBuilder();
					isDate = false;
				} catch (ParseException e) {
					result = -99999.0;
					num1 = new StringBuilder();
					num2 = new StringBuilder();
				}
			} else if (num1.length() > 0 && num2.length() > 0 && operation != ' ') {
				try {
					float n1 = Float.parseFloat(num1.toString());
					float n2 = Float.parseFloat(num2.toString());
					switch (operation) {
					case '+':
						result = n1 + n2;
						break;
					case '-':
						result = n1 - n2;
						break;
					case '*':
						result = n1 * n2;
						break;
					case '/':
						if (n2 == 0)
							result = -0.99999111;
						else
							result = n1 / n2;
						break;
					}
				} catch (Exception e) {

				}
				num1 = new StringBuilder(result + "");
				num2 = new StringBuilder();
			}
			lastNumber = 3;
		}

		// handle 2's complement
		if (c == '!') {
			String num = null;
			if (lastNumber == 2)
				num = num2.toString();
			else
				num = num1.toString();
			int doubelToInt = (int) Double.parseDouble(num);
			String twosCompliment = twosCompliment(Integer.toBinaryString(doubelToInt));
			resultStr = twosCompliment;
		}

		// handle 2's complement
		if (c == 'D') {
			isDate = true;
		}

	}

	private String twosCompliment(String bin) {
		StringBuilder ones = new StringBuilder();

		for (int i = 0; i < bin.length(); i++) {
			ones.append(flip(bin.charAt(i)));
		}

		int parseInt = Integer.parseInt(ones.toString(), 2);
		String binaryString = Integer.toBinaryString(parseInt + 1);

		return binaryString;
	}

	// Returns '0' for '1' and '1' for '0'
	private char flip(char c) {
		return (c == '0') ? '1' : '0';
	}

	public double getDisplayVal() {

		BigDecimal bd = new BigDecimal(String.format("%.2f", result));
		if (result == -0.99999112) {
			return result;
		}
		if (num1.length() == 0 && num2.length() == 0 && result == -99999.0) {
			return 0.0;
		}
		return bd.doubleValue();
	}

	public String getDisplay() {
		if (!resultStr.isEmpty()) {
			String s = resultStr;
			resultStr = "";
			return s;
		}
		return resultStr;
	}
}
