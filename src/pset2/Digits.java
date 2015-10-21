package pset2;

import java.util.Map;
import java.util.Scanner;

/**
 * @author Kevin Phillips
 * @since 10/19/2015
 * csci-e-10ab
 */

public class Digits {
    public static void main(String[] args) {
//        When debugging, set to four digits to find 2178 and five digits to find 21978
        for (int i = 10000; i <= 99999; i++){

            String for_loop_STRING = Integer.toString(i);
            int for_loop_INT_BY_FOUR = i * 4;
            String for_loop_STRING_METHOD_CALL = reverseNumber(for_loop_INT_BY_FOUR);

            if (for_loop_STRING.equals(for_loop_STRING_METHOD_CALL)){
                System.out.println("Success, the five digit number = " + i);
            }
        }

    }
//    What does this do, @param @return ???
        public static String reverseNumber(int inputNumber){
            int u = inputNumber % 10;
            int t = (inputNumber % 100) / 10;
            int h = (inputNumber % 1000) / 100;
            int th = (inputNumber % 10000) / 1000;
            int t_th = (inputNumber % 100000) / 10000;
            int h_th = inputNumber % 1000000 / 100000;

/*          System.out.println("units = "+ u);
            System.out.println("tens = "+ t);
            System.out.println("hundreds = "+ h);
            System.out.println("thousands = "+ th);
            System.out.println("ten thousands = "+ t_th);
            System.out.println("hundred thousands = "+ h_th);
*/
            String inputReversed = u+""+ t + h + th + t_th;
//            System.out.println(inputReversed);
            if ( h_th >= 1){
                inputReversed = "0";
            }
            return inputReversed;
        }

}
