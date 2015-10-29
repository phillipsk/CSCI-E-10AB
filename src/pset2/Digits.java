package pset2;

import java.util.Map;
import java.util.Scanner;

/**
 * csci-e-10ab
 * @author Kevin Phillips
 * @since 10/21/15
 */

public class Digits {
    /** This program searches and identifies the sole five digit number whom has a property of: multiplied by
     * four and reversed will equal the number prior to multiplication
     */
    public static void main(String[] args) {
        for (int i = 10000; i <= 99999; i++){

            String for_loop_STRING = Integer.toString(i);
            int for_loop_INT_BY_FOUR = i * 4;
            String for_loop_STRING_METHOD_CALL = reverseNumber(for_loop_INT_BY_FOUR);

            if (for_loop_STRING.equals(for_loop_STRING_METHOD_CALL)){
                System.out.println("Success, the five digit number = " + i);
            }
        }

    }

    /**This method evaluates the five-digit inputNumber integer variable passed from main. The  method
     * singles out each digit from the units to ten thousandths place and then proceeds to reverse
     * the passed variable while finally casting the int resulting reversed integer into a String
     * for comparison purposes within the main method.
     *
     * An IF statement checks whether the passed variable contains 6 digits, usually resulting from
     * the earlier multiplication in main, and subsequently assigns a value of 0 to the returned variable so
     * the main method can continue the for loop without producing erroneous five-digit integers claiming
     * to represent the property described above.
     *
     * @param inputNumber   passed from main, represents each incremented integer within the for
     *                      loop range and subsequently evaluated within the reverseNumber method
     * @return  reversed five digit variable as a String data type
     */
        public static String reverseNumber(int inputNumber){
            int u = inputNumber % 10;
            int t = (inputNumber % 100) / 10;
            int h = (inputNumber % 1000) / 100;
            int th = (inputNumber % 10000) / 1000;
            int t_th = (inputNumber % 100000) / 10000;
            int h_th = inputNumber % 1000000 / 100000;

            String inputReversed = u+""+ t + h + th + t_th;

            if ( h_th >= 1){
                inputReversed = "0";
            }
            return inputReversed;
        }

}
