package Pset51;

import java.util.Scanner;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10B Introduction to Computer Science Using Java II
 * Professor Dr. Henry Leitner
 * Teaching Assistant Brandon Tineo
 * Received help from Codementor.io Dharmendra Prasad
 *
 * @author Kevin Phillips
 * @since 2/12/17
 */

/* A fun problem that can be solved recursively involves the technique
of determining whether or not a sentence is a palindrome — a String that
is equal to itself when you reverse all the characters.

An iterative solution for determining whether a sentence is a
palindrome was written in CSCI E-10a last semester. Now we want you
to write a recursive solution.

*/
public class Pallindrome {

	public static void main(String[] args) {


		String inputString = new String();
		inputString = "\"My gym tasks are too lonely?\" a Jay Leno looter asks at my gym.";
		inputString = inputString.toLowerCase();
		System.out.println("Is: \n"+ inputString + "\n a Pallindrome?");
		System.out.println(isPalindrome(inputString));

		inputString = "Cigar? Toss it in a can, it is so tragic!";
		inputString = inputString.toLowerCase();
		System.out.println("\nIs: \n"+ inputString + "\n a Pallindrome?");
		System.out.println(isPalindrome(inputString));

		inputString = "Ed, I saw Harpo Marx ram Oprah W. aside.";
		inputString = inputString.toLowerCase();
		System.out.println("\nIs: \n"+ inputString + "\n a Pallindrome?");
		System.out.println(isPalindrome(inputString));

		inputString = "Marge let a moody baby doom a telegram.";
		inputString = inputString.toLowerCase();
		System.out.println("\nIs: \n"+ inputString + "\n a Pallindrome?");
		System.out.println(isPalindrome(inputString));

		inputString = "\"My chores are too lonely?\\\" a Jay Leno looter asks at my gym.\"";
		inputString = inputString.toLowerCase();
		System.out.println("\nIs: \n"+ inputString + "\n a Pallindrome?");
		System.out.println(isPalindrome(inputString));

		System.out.println();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a sentence to test whether the sentence is a Pallindrome: \n");
		inputString = scanner.nextLine();
		inputString = inputString.toLowerCase();
		System.out.println(isPalindrome(inputString));
		scanner.close();
	}

	public static boolean isPalindrome(String s) {

		if (s.length() <= 1)
			return true;

		int indexOfFirstChar = 0;
		char firstCharacter = s.charAt(indexOfFirstChar);
		while (!Character.isLetter(firstCharacter))
			firstCharacter = s.charAt(++indexOfFirstChar);

		int indexOfLastChar = s.length() - 1;
		char lastCharacter = s.charAt(indexOfLastChar);
		while (!Character.isLetter(lastCharacter))
			lastCharacter = s.charAt(--indexOfLastChar);

		boolean charactersMatch = (firstCharacter == lastCharacter);
		if(indexOfFirstChar == indexOfLastChar){
			return charactersMatch;
		}
		return charactersMatch && isPalindrome(s.substring(indexOfFirstChar + 1, indexOfLastChar));
	}
}
