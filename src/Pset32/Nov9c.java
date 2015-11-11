package Pset32;

import java.util.Scanner;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/11/15
 */
public class Nov9c {
    // we will input a String value typed at the keyboard
    // and determine whether it is a palindrome

    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print ("Please type a string:  ");

        String s = keyboard.nextLine();

        s = s.toUpperCase();

        int left = 0;                // start at the beginning of the input String
        int right = s.length() -1;   // start at the end of the input String

        while (left < right)
        {
            char lc = s.charAt (left);
            char rc = s.charAt (right);

            if ( lc < 'A' || lc > 'Z')
            {
                left++;
                continue;
            }
            // I know that lc contains an uppercase alphabetic character

            if ( ! (rc >= 'A' && rc <= 'Z') )
            {
                right--;
                continue;
            }
            // I know that both lc and rc contain an uppercase alphabetic char

            if  (lc  !=  rc)
            {
                System.out.println ("Sorry, **NOT** a palindrome!");
                return;
            }
            left++;
            right--;
        }
        System.out.println ("Congratulations, we have a PALINDROME!");
    }
}