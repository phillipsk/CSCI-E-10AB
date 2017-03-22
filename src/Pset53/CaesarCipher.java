package Pset53;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10B Introduction to Computer Science Using Java II
 * Professor Dr. Henry Leitner
 * Teaching Assistant Brandon Tineo
 * Received help from Dharmendra Prasad
 *
 * @author Kevin Phillips
 * @since 3/20/17
 */

/*
A Caesar Cipher is one of the earliest forms of an alphabetic cipher for creating “secret messages.”
A Caesar Cipher works by substituting for each letter in the original “plaintext” a letter obtained by shifting
the alphabet by a constant number.

For example, a Caesar Cipher with a shift of 1 would produce the following substitution table:
Plaintext alphabet: ABCDEFGHIJKLMNOPQRSTUVWXYZ Ciphertext alphabet: BCDEFGHIJKLMNOPQRSTUVWXYZA

This means the message “HELLO” would be enciphered as “IFMMP”. A Caesar Cipher with a shift of 2 would produce the substitution table
Plaintext alphabet: ABCDEFGHIJKLMNOPQRSTUVWXYZ Ciphertext alphabet: CDEFGHIJKLMNOPQRSTUVWXYZAB

So “HELLO” would be enciphered as “JGNNQ”
For this problem you are asked to implement a Caesar Cipher in the file CaesarCipher.java. In order to do this we
recommend (but don’t insist) you write two methods that have the following “signature”:
public static String caesarEncipher (String input, int shift)
public static String caesarDecipher (String input, int shift)

These methods will allow you to process the input file on a line by line basis. In addition to these methods you must
write an appropriate main program that will adequately demonstrate your cipher. An example run of your program
should look like this:

Welcome to CaesarCipher
Enter 1 to encipher, or 2 to decipher (-1 to exit): 1 What shift should I use? 2
What is the input file name? hello.txt
What is the output file name? encodedHello.txt DONE!
Enter 1 to encipher, or 2 to decipher (-1 to exit): 2 What shift should I use? 2
What is the input file name? encodedHello.txt
What is the output file name? originalHello.txt
DONE!
Enter 1 to encipher, or 2 to decipher (-1 to exit): -1

Presumably, the file originalHello.txt now will contain precisely the original text that is still in the file hello.txt.
 While you are debugging this program, it is probably a good idea to have the content of the input file get “echoed”
 on to the screen, and also to have the content of the output file also get “echoed.” Your methods should ignore any
 character that is not an uppercase alphabetic; in other words, your method should simply copy over unchanged any
 character that is not upper-case.

You may wish to consider using a StringBuilder object for ease in encoding/ decoding the characters.
*/

public class CaesarCipher {

    private static char[] leftShift(int shift) {
        char[] ALPHABET = new char[26];
        for (int i = 0; i < 26; i++) {
            ALPHABET[i] = (char) ('A' + ((i + shift) % 26));
        }
        return ALPHABET;
    }

    private static char[] rightShift(int shift) {
        char[] ALPHABET = new char[26];
        for (int i = 0; i < 26; i++) {
            ALPHABET[(i+shift)%26] = (char) ('A' + i);
        }
        return ALPHABET;
    }

    public static String caesarEncipher(String input, int shift) {
        char[] cipher = leftShift(shift);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isUpperCase(input.charAt(i))) {
                sb.append(input.charAt(i));
            } else {
                char c = cipher[input.charAt(i) - 65];
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String caesarDecipher(String input, int shift) {
        char[] cipher = rightShift(shift);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isUpperCase(input.charAt(i))) {
                sb.append(input.charAt(i));
            } else {
                char c = cipher[input.charAt(i) - 65];
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Caesar Cipher");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 1 to encipher, or 2 to decipher (-1 to exit):");
        int userInput = keyboard.nextInt();
        while (userInput != -1) {
            System.out.println("What shift should I use?");
            int shift = keyboard.nextInt();
            System.out.println("What is the input file name?");
            keyboard.nextLine();
            String inputFile = keyboard.nextLine();
            System.out.println("What is the output file name?");
            String outputFile = keyboard.nextLine();

            FileOutputStream fos = new FileOutputStream(outputFile);
            Scanner fileReader = new Scanner(new File(inputFile));
            while (fileReader.hasNextLine()) {
                String nextLine = fileReader.nextLine();
                String result = null;
                if (userInput == 1) {
                    result = caesarEncipher(nextLine, shift);
                } else if (userInput == 2) {
                    result = caesarDecipher(nextLine, shift);
                }
                System.out.println("INPUT : [" + nextLine + "] and OUTPUT : [" + result + "]");
                fos.write(result.getBytes());
                fos.write("\n".getBytes());
            }
            System.out.println("DONE!");

            System.out.println("Enter 1 to encipher, or 2 to decipher (-1 to exit):");
            userInput = keyboard.nextInt();
        }
        System.exit(0);

    }
}


