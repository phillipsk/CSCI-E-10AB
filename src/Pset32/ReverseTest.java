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
//        System.out.println(firstWord("the couch potato"));
        Scanner console = new Scanner(System.in);
        System.out.print("Please type a string:  ");
//        System.out.println(printReverse(console.nextLine()));
//        printReverse(console.nextLine());
        printReverse("Uncle Foobar");
    }

    public static void printReverse(String s){
        if (s.charAt(0) == ' '){    // This error checking does not work I need better
            System.out.println("");
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

    public static String firstWord(String s){
        int start = 0;
        while (start < s.length() && s.charAt(start) == ' '){
            start++;
        }

        int stop = start;
        while (stop < s.length() && s.charAt(stop) != ' '){
            stop++;
        }
        return s.substring(start,stop);
    }
}