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
//        reverseNumber(console.nextInt());
        firstDigit(console.nextInt());
    }

    //    What does this method do?
    /*public static int reverseNumber(int inputNumber){
//        illegal
//        String s = inputNumber;
        for (int i = 5; i <= 1; i--){
//            System.out.print(charat);
        }
        return (i);
    }*/

    public static int firstDigit(int n) {
        while (n < -99999 || 99999 < n){
            n /= 100000;
        }
        System.out.print(Math.abs(n));
        while (n < -9999 || 9999 < n){
            n /= 10000;
        }
        System.out.print(Math.abs(n));
        while (n < -999 || 999 < n){
            n /= 1000;
        }
        System.out.print(Math.abs(n));
        while (n < -99 || 99 < n){
            n /= 100;
        }
        System.out.print(Math.abs(n));
        while (n < -9 || 9 < n){
            n /= 10;
        }
//        return  System.out.println(Math.abs(n));
        System.out.print(Math.abs(n));
        return Math.abs(n);
    }
}
