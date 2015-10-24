package pset2;

import java.util.Scanner;

/**
 * csci-e-10ab
 * @author Kevin Phillips
 * @since 10/21/15
 *
 */
public class Abs {
    public static void main(String[] args){
        System.out.println("Please enter two integers to determine " +
        "which holds the greatest absolute value: ");
        Scanner console = new Scanner(System.in);
        System.out.println("First integer please: ");
        int a = 11; //console.nextInt();
        System.out.println("Second integer please: ");
        int b = 2*3-5; //console.nextInt();
        System.out.println("The largest absolute value among that pair is " + largerAbsValue(a,b));
    }


    /**
     * The largerAbsValue method accepts two integer inputs as parameters
     * which are then evaluated to identify the largest absolute value among the two
     * @param a one of two integer's to be evaluate for largest abs
     * @param b two of two integer's to be evaluate for largest abs
     * @return      the largest absolute value
     */
    public static int largerAbsValue(int a, int b){

//        evaluate positive or negative; if negative, multiplies by -1 to obtain positive value
        if (a < 0 || b < 0){
            a = a*-1;
            b = b*-1;
        }

        if(a > b){
            return a;
        } else {
            return b;
        }
        /*else if (){} ??
        * are we accepting user input??
        * throw illegal argument exception??
        * */

    }
}