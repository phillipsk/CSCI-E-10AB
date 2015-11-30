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
     * @param args
     */
    public static void main(String[] args) {
/*        piggie("deepest");  //  deepest gets translated into eepest-day
        piggie("shade");    //  shade gets translated to ade-shay
        piggie("Obama");    //  Obama gets translated to Obama-way
        piggie("you");      //  you gets translated to ou-yay
        piggie("queen");    //  queen gets translated to een-quay (note the 'u' stays with 'q')
        piggie("by");       //  by gets translated to y-bay (note that 'y' is a vowel)*/

        System.out.println(piggie("deepest"));  //  deepest gets translated into eepest-day
        System.out.println(piggie("shade"));    //  shade gets translated to ade-shay
        System.out.println(piggie("Obama"));    //  Obama gets translated to Obama-way
        System.out.println(piggie("you"));      //  you gets translated to ou-yay
        System.out.println(piggie("queen"));    //  queen gets translated to een-quay (note the 'u' stays with 'q')
        System.out.println(piggie("by"));       //  by gets translated to y-bay (note that 'y' is a vowel)

        Scanner console = new Scanner(System.in);
        console.hasNext(""); // console.hasNext() >>String Pattern
    }

    /**
     * @param s
     * @return
     */
    public static String piggie(String s) {
//        String
        int k = 0;
//        for (int k = 0; k < s.length(); k++){
        if (s.charAt(k) == 'a' || s.charAt(k) == 'A' || s.charAt(k) == 'e' || s.charAt(k) == 'E'
                || s.charAt(k) == 'i' || s.charAt(k) == 'I' || s.charAt(k) == 'o' || s.charAt(k) == 'O'
                || s.charAt(k) == 'u' || s.charAt(k) == 'U') {
//                System.out.print(k);
//                System.out.print(s.substring(0,s.length())+ "-" + "way ");
//                break;
            return s.substring(0, s.length()) + "-" + "way ";
        } else {

            k++;
            if ((s.charAt(k) == 'a' || s.charAt(k) == 'A' || s.charAt(k) == 'e' || s.charAt(k) == 'E'
                    || s.charAt(k) == 'i' || s.charAt(k) == 'I' || s.charAt(k) == 'o' || s.charAt(k) == 'O'
                    || s.charAt(k) == 'y' || s.charAt(k) == 'Y')) {
//                    System.out.print(s.substring(1,s.length())+ "-" + s.substring(0,1) + "ay ");
//                    break;
                return s.substring(1, s.length()) + "-" + s.substring(0, 1) + "ay ";
            } else {
//                    System.out.print(s.substring(2,s.length())+ "-" + s.substring(0,2) + "ay ");
//                    break;
                return s.substring(2, s.length()) + "-" + s.substring(0, 2) + "ay ";
            }
        }
    }

    /**
     * @param console
     * @param prompt
     * @return
     */
    public static int getString(Scanner console, String prompt){
        System.out.print(prompt);
        while (!console.hasNextInt()){ //&& (console.nextInt() < 0)){
            console.next(); // discard non-integer values as we are looking for integers only
            System.out.println("Not an integer, Please try again.");
            System.out.print(prompt);
        }
        return console.nextInt();
    }
//        }
//        System.out.println();

//        return s;
}
