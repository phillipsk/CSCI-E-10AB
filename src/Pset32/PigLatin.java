package Pset32;

import java.util.Scanner;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/24/2015
 */
public class PigLatin {
    /**
     * This program translates English words into their Pig latin equivalents. Pig Latin is English, but with
     * the initial consonant sound moved to the end of the word, followed by “ay.” However, words that begin
     * with vowels simply have “way” appended to the end of the word.
     *
     * For example:
     * deepest gets translated into eepest-day
     * shade gets translated to ade-shay
     * Obama gets translated to Obama-way
     * you gets translated to ou-yay
     * queen gets translated to een-quay (note the 'u' stays with 'q')
     * by gets translated to y-bay (note that 'y' is a vowel)
     */
    public static void main(String[] args) {
        System.out.println("System.out.println(piggie(\"deepest\"))");
        System.out.println(piggie("deepest"));  //  deepest gets translated into eepest-day
        System.out.println("System.out.println(piggie(\"shade\"))");
        System.out.println(piggie("shade"));    //  shade gets translated to ade-shay
        System.out.println("System.out.println(piggie(\"Obama\"))");
        System.out.println(piggie("Obama"));    //  Obama gets translated to Obama-way
        System.out.println("System.out.println(piggie(\"you\"))");
        System.out.println(piggie("you"));      //  you gets translated to ou-yay
        System.out.println("System.out.println(piggie(\"queen\"))");
        System.out.println(piggie("queen"));    //  queen gets translated to een-quay (note the 'u' stays with 'q')
        System.out.println("System.out.println(piggie(\"by\"))");
        System.out.println(piggie("by"));       //  by gets translated to y-bay (note that 'y' is a vowel)

        /*
        * I was unable to configure the program to accept user input due to a lack of time vs. complexity. I resorted
        * to following the example words outlined in the Question.
        *
        * Scanner console = new Scanner(System.in);
        * console.hasNext("");
        */
    }

    /**
     * This is the method which translates the passed English word into Pig Latin. The method initially begins by
     * evaluating whether the first character of the parameter is a vowel. If a vowel the method will merely append
     * "way" onto the end of the 's' and return the Pig Latin equivalent following the condition of words beginning with
     * vowels as outlined in main. If the parameter 's' begins with a consonant the method evaluates to the second if
     * statement and determines whether another consonant is followed by the first consonant. If a second consonant is
     * not present, "ay" is appended to the String 's' and returned. If a second consonant is present, the returned
     * string is pushed out two character positions whereby "ay" is then appended to the String s and returned.
     *
     * Again due to a lack of time vs. complexity, this method assumes no English words begin with three consonants.
     *
     * @param s represents the English Word passed through a method call in main
     * @return  represent the Pig Latin equivalent to the previously passed English word as defined through String s
     */
    public static String piggie(String s) {
        int k = 0;
        if (s.charAt(k) == 'a' || s.charAt(k) == 'A' || s.charAt(k) == 'e' || s.charAt(k) == 'E'
                || s.charAt(k) == 'i' || s.charAt(k) == 'I' || s.charAt(k) == 'o' || s.charAt(k) == 'O'
                || s.charAt(k) == 'u' || s.charAt(k) == 'U') {
            return s.substring(0, s.length()) + "-" + "way ";
        } else {
            k++;
            if ((s.charAt(k) == 'a' || s.charAt(k) == 'A' || s.charAt(k) == 'e' || s.charAt(k) == 'E'
                    || s.charAt(k) == 'i' || s.charAt(k) == 'I' || s.charAt(k) == 'o' || s.charAt(k) == 'O'
                    || s.charAt(k) == 'y' || s.charAt(k) == 'Y')) {
                return s.substring(1, s.length()) + "-" + s.substring(0, 1) + "ay ";
            } else {
                return s.substring(2, s.length()) + "-" + s.substring(0, 2) + "ay ";
            }
        }
    }
}
