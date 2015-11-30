package Pset32;

import java.util.Scanner;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/11/15
 */
public class ReverseTest {
    /**
     * This programs calls upon the printReverse methods with a series of String values and empty Strings.
     * Several test method calls are predefined and tested within the main method.
     */
    public static void main(String[] args) {
        System.out.println("printReverse(\"Uncle Foobar\");");
        printReverse("Uncle Foobar");
        System.out.println("printReverse(\" \");");
        printReverse(" ");
        System.out.println("printReverse(\"   \");");
        printReverse("   ");
        System.out.println("printReverse(\"A man, a plan, a canal, Panama!\");");
        printReverse("A man, a plan, a canal, Panama!");
        System.out.println("printReverse(\"race car\");");
        printReverse("race car");
        System.out.println("printReverse(\"\");");
        printReverse("");
        System.out.println("printReverse(\"U\");");
        printReverse("U");
        System.out.println("printReverse(\"Un\");");
        printReverse("Un");
    }

    /**
     * This method evaluates each character of the passed String argument and prints a new String value which
     * represents the reversed series of characters as originally present in the originally passed String.
     * Simply put, and as the method header suggests, this method prints the passed String value in reverse.
     * Empty Strings call upon no print method. String values with spaces are printed in reverse order.
     *
     * @param s represents the String value passed through the main method.
     */
    public static void printReverse(String s){
        if (s.isEmpty()){

        }else {

            int left = 0;                // start at the beginning of the input String
            int right = s.length() -1;   // start at the end of the input String

            char lc = s.charAt (left);
            char rc = s.charAt (right);
            int a = s.length();
            for (int i = right; i != -1; i--){
                System.out.print(s.charAt(i));
            }
        }System.out.println();
    }
}