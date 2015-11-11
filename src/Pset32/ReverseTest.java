package Pset32;

import java.util.Scanner;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/11/15
 */
public class ReverseTest {
    public static void main(String[] args) {
        printReverse("Uncle Foobar");
        printReverse(" ");
        printReverse("   ");
        printReverse("A man, a plan, a canal, Panama!");
        System.out.println("");
        printReverse("race car");
    }

    public static void printReverse(String s){
        if (s.charAt(0) == ' '){
            System.out.println(" ");
        }else {

            int left = 0;                // start at the beginning of the input String
            int right = s.length() -1;   // start at the end of the input String

            char lc = s.charAt (left);
            char rc = s.charAt (right);
            int a = s.length();
            for (int i = right; i != -1; i--){
                System.out.print(s.charAt(i));
            }
        }
    }
}