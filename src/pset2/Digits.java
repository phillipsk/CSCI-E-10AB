package pset2;

import java.util.Map;
import java.util.Scanner;

/**
 * Created by Kevin Phillips on 10/12/2015
 * Following Reges, Stuart, and Martin Stepp. Building Java Programs: A Back to Basics Approach. 3rd Edition.
 */
public class Digits {
    public static void main(String[] args) {
        System.out.println("Please enter a five digit number to be reversed: ");
        Scanner console = new Scanner(System.in);
//        int number = console.nextInt();
        int origin_INPUT = console.nextInt();
//        reverseNumber(origin_INPUT);
//        firstDigit(console.nextInt());
        String origin_STRING = Integer.toString(origin_INPUT);

        for (int i = 10000; i <= 99999; i++){
            if (origin_STRING == reverseNumber(origin_INPUT)){
//            debug number = 51273
            }

        }

    }
//    What does this do, @param @return ???
        public static String reverseNumber(int inputNumber){
            int u = inputNumber % 10;
            int t = (inputNumber % 100) / 10;
            int h = (inputNumber % 1000) / 100;
            int th = (inputNumber % 10000) / 1000;
            int t_th = inputNumber / 10000;
//            debug number = 51273
            System.out.println("units = "+ u);
            System.out.println("tens = "+ t);
            System.out.println("hundreds = "+ h);
            System.out.println("thousands = "+ th);
            System.out.println("ten thousands = "+ t_th);

//            int result = u+""+ t + th + t_th + h
//            System.out.println(u+""+ t + th + t_th + h);
//            String inputReversed = Integer.toString(u+ t + th + t_th + h);
            String inputReversed = u+""+ t + h + th + t_th;
//            System.out.println(inputReversed);
            return inputReversed;
        }

}
