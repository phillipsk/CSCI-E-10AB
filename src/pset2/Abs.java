package pset2;

import java.util.Scanner;

/**
 * @author Kevin Phillips
 * @since 10/21/15
 * csci-e-10ab
 */
public class Abs {
    public static void main(String[] args){
        System.out.println("Please enter two integers to determine " +
                "which holds the greatest absolute value: ");
        Scanner console = new Scanner(System.in);
        System.out.println("First integer please: ");
        int a = console.nextInt();
        System.out.println("Second integer please: ");
        int b = console.nextInt();
        System.out.println("The largest absolute value among that pair is " + largerAbsValue(a,b));
    }

//    what does this method do?
    public static int largerAbsValue(int a, int b){
//        what is this if statement doing?
        if (a < 0 || b < 0){
            a = a*-1;
            b = b*-1;
        }

        if(a > b){
            return a;
        } else {
            return b;
        }

    }
}