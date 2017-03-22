package Pset53;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10B Introduction to Computer Science Using Java II
 * Professor Dr. Henry Leitner
 * Teaching Assistant Brandon Tineo
 * Received help from Dharmendra Prasad
 *
 * @author Kevin Phillips
 * @since 3/16/17
 */

/*
Consider the following snippet of code that asks the user to input 2 integers and
then divides them:
     Scanner keyboard = new Scanner (System.in);
     int n1, n2;
     System.out.print(“Type an int: “);
     n1 = keyboard.nextInt();
     System.out.print(“Now type another int: “);
     n2 = keyboard.nextInt();
     double r = (double) n1 / n2;

Now place the code beginning with the first System.out into a try-catch block with multiple catches so that different
error messages are printed if:
1. we attempt to divide by 0; or
2. the user enters textual data instead of integers (java.util.InputMismatchException)

If either of these conditions should occur, the program should print a polite error message, and then loop back to
allow the user to enter new data. Do NOT completely rewrite the code; just add the requested elements, please.
*/
public class Prob4 {

    public static void main(String[] args) {
        divide();
    }

    public static void divide() {
        boolean isException = false;
        do {
            isException = inputAndDivide();
        } while (isException);
    }

    private static boolean inputAndDivide(){
        int n1;
        int n2;
        Scanner keyboard = new Scanner(System.in);
        try {
            System.out.print("Type an int: ");
            n1 = keyboard.nextInt();
            System.out.print("Now type another int: ");
            n2 = keyboard.nextInt();
            double r = (double) n1 / n2;
            System.out.println("result of division " + r);
        } catch (ArithmeticException ae) {
            System.err.println("You just tried to divide by zero. Please reenter the values ");
            return true;
        } catch (InputMismatchException ime) {
            System.err.println("The program expects integers only. Please reenter the values ");
            return true;
        }
        return false;
    }

}
