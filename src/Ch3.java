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
//        scannerTesting();
        ch3_Case_study();
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

public static final double ACCELERATION = -9.81;
    public static void ch3_Case_study(){
//        This program computes the trajectory of a projectile.
        System.out.print("This program computes the trajectory \n" +
                "of a projectile given its inital velocity \n" +
                "and its angle relative to the horizontal.\n\n");

        System.out.println("Please enter the inital velocity: (format m/s)");
            Scanner console = new Scanner(System.in);
        double userVelocity = console.nextDouble();
        System.out.println("Please enter the degrees of the angles:");
//            Scanner console = new Scanner(System.in);
        double userDegreees = Math.toRadians(console.nextDouble());
//        double userRadians = Math.toRadians(userDegreees);
        System.out.println("How many steps?");
            int userSteps = console.nextInt();

//        System.out.println(userVelocity+" "+userDegreees+" "+userSteps);

        double xVelocity = userVelocity * Math.cos(userDegreees);
        double yVelocity = userVelocity * Math.sin(userDegreees);
        double totalTime = -2.0 * yVelocity / ACCELERATION;
        double timeIncrement = totalTime / userSteps;
        double xIncrement = xVelocity * timeIncrement;

        double x = 0.0,y = 0.0,t = 0.0;
//          illegal
//      double x,y,t =0.0;
        System.out.println("Step\tx\ty\ttime");
        System.out.println("0\t0.0\t0.00\t0.0");
        for (int i = 1; i <= userSteps; i++){
//            t =+ timeIncrement;
            t += timeIncrement;
//            x =+ xIncrement;
            x += xIncrement;
            y = yVelocity*t+0.5*ACCELERATION*t*t;
            System.out.println(i + "\t" + round2(x) + "\t" +
                    round2(y) + "\t" + round2(t));
        }
    }

    public static double round2(double n){
        return Math.round(n * 100.0) / 100.0;
    }

}
