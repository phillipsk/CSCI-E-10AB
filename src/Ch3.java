import java.lang.String;
import java.util.Scanner;

/**
 * Created by Kevin Phillips on 9/1/15.
 * Following Reges, Stuart, and Martin Stepp. Building Java Programs: A Back to Basics Approach. 3rd Edition.
 * Chapter 3
 * Notes:
 *  Strings are immutable OBJECTS
 *  toUpperCase & toLowerCase methods are helpful when we need to compare value of 2+ strings
 *  OBJECT = a programming entity that contains state (data) and behavior (methods)
 *  CLASS = a category or type of object
 *
 */
public class Ch3 {
    public static void main(String[] args) {
/*       double answer = sum(10);
        System.out.println("The sum is " + answer);

        System.out.println("The hypotenuse is " + hypotenuses(20, 40));*/

//        strings();
        scannerTesting();
    }

    public static double sum(double n){
        return (n + 1) * n / 2;
    }

    public static double hypotenuses(double a, double b){
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;
    }

    public static void  strings(){
        String s1 = "Hello";
        String s2 = "How are you?";
//        s2.substring(0,3);
        System.out.println(s2.substring(0,3));
        System.out.println(s2.toUpperCase());

    }

    public static void scannerTesting(){
        Scanner console = new Scanner(System.in);
//        int n = console.nextInt();
//        System.out.println(n);
/*        System.out.println("Please enter text:");
//              Accept user input
        String userInput = console.nextLine();
//              Print user input to console
        System.out.println(userInput);*/
        Scanner hamburger = new Scanner(System.in);
        System.out.println("Can we initialize objects or classes with whatever expressions we like?");
//              Accept user input
        String userInput = console.nextLine();
        //              Print user input to console
        System.out.println(userInput);
    }


}
