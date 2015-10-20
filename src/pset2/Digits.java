package pset2;

import java.util.Map;
import java.util.Scanner;

/**
 * Created by Kevin Phillips on 10/12/2015
 * Following Reges, Stuart, and Martin Stepp. Building Java Programs: A Back to Basics Approach. 3rd Edition.
 */
public class Digits {
    public static void main(String[] args) {
        /*System.out.println("Please enter a five digit number to be reversed: ");
        Scanner console = new Scanner(System.in);
        int origin_INPUT =  console.nextInt() * 4;
        String origin_INPUT_REVERSED = reverseNumber(origin_INPUT);
        String origin_STRING = Integer.toString(origin_INPUT);
//        System.out.println(origin_STRING); // debuging
        String another_debug = Integer.toString(2178);
        System.out.println(origin_INPUT + " " + origin_STRING + " " + origin_INPUT_REVERSED + " " + another_debug);

//        if (another_debug == origin_INPUT_REVERSED){
        if (another_debug.equals(origin_INPUT_REVERSED)){
            System.out.println("success");
        }*/

//        When debugging, set to four digits**
        for (int i = 1000; i <= 9999; i++){ // SET TO FOUR
            String for_loop_STRING = Integer.toString(i);
            int for_loop_I_BY_FOUR = i * 4;
            String for_loop_STRING_BY_FOUR = reverseNumber(for_loop_I_BY_FOUR);
            if (for_loop_STRING.equals(for_loop_STRING_BY_FOUR)){
                System.out.println(i);
            }

//            System.out.println("No match");

        }

    }
//    What does this do, @param @return ???
        public static String reverseNumber(int inputNumber){
            int u = inputNumber % 10;
            int t = (inputNumber % 100) / 10;
            int h = (inputNumber % 1000) / 100;
            int th = (inputNumber % 10000) / 1000;
//            int t_th = inputNumber / 10000;
//            debug number = 51273

/*            System.out.println("units = "+ u);
            System.out.println("tens = "+ t);
            System.out.println("hundreds = "+ h);
            System.out.println("thousands = "+ th);
            System.out.println("ten thousands = "+ t_th);*/

//            int result = u+""+ t + th + t_th + h
//            System.out.println(u+""+ t + th + t_th + h);
//            String inputReversed = Integer.toString(u+ t + th + t_th + h);
            String inputReversed = u+""+ t + h + th; // + t_th;
//            System.out.println(inputReversed);
            return inputReversed;
        }

}
