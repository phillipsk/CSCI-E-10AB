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
        reverseNumber(console.nextInt());
//        firstDigit(console.nextInt());
    }
//    What does this do, @param @return ???
        public static void reverseNumber(int inputNumber){
            int u = inputNumber % 10;
            int h = inputNumber / 100;
            int t = (inputNumber % 100) / 10;
            int th = (inputNumber % 1000) / 100;
            int t_th = (inputNumber %10000) / 1000;
//            debug number = 51273
            System.out.println("units = "+ u);
            System.out.println("tens = "+ t);
            System.out.println("hundreds = "+ h);
            System.out.println("thousands = "+ th);
            System.out.println("ten thousands = "+ t_th);

        }

}
