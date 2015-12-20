package Pset41;
//  Pset41.Recurse.java

/**
 * This program will take a number from the user to calculate factorial.
 * As it does so, it will print a message each time the method is 
 * called, as well as each time the method returns a value, so you can
 * follow the stack calls.  Pauses are built in using calls to read lines
 * - you should hit ENTER to continue to the next method iteration.
 *
 * @author    Jan Jackson
 * @version    1.3
 */

import java.util.*;

public class Recurse
{
    /*  The Scanner is used to slow things down - calls will be made to nextLine()
	to insert pauses in the recursive method calls.  
    */
    static java.util.Scanner in = new java.util.Scanner( System.in );

    /**
     * This method will make recursive calls until its parameter is
     * decreased to 0, when it simply returns the number 1.  Each time
     * the method calls itself (the hallmark of recursion), the problem
     * it is attempting to solve becomes smaller, until a BASE CASE is
     * reached - which, as above, is the call with 0.
     *
     * @param   num    The number currently being calculated
     * @return         The sum of the numbers to this point
     **/
    public static int factorIt(int num)
    {
        int temp = 0;   // this variable will hold the result of the
        // recursive call

        if (num == 0){  // our base case: 0! = 1
            System.out.println( "We hit the base case!!!  Returning 1... \n" );

	    /*  Hit ENTER to continue...  this just slows things down  */
            in.nextLine();
            return 1;
        }

        else{
            // Remember that we'd normally write this part as:
            // "return num * factorIt ( num - 1);" - however, 
            // because I want to include the print statements 
            // that will show you the calls and returns, I'm
            // using temp for the method call result.

            System.out.println("Holding " + num + "; calling factorIt with " +
                    (num - 1) + "\n");

	    /*  Hit ENTER to continue...  */
            in.nextLine();
            temp = factorIt(num - 1);

            System.out.println("Returned from recursive call: this frame holds " + num +
                    " and temp is " + temp + "\n" +
                    "Multiplying " + num + " times " + temp +
                    " to return the result: " + ( num * temp ) + "\n");
	    /*  Hit ENTER to continue...  */
            in.nextLine();
            return (num * temp);
        }
    }

    public static void main (String [] args)
    {
        int times = 0;
        int result = 0;
        Scanner in = new Scanner( System.in );

        System.out.print(
                "\n\nThis program will demonstrate the process of recursion. " +
                        "\nYou may input a number, and as the method is called " +
                        "\neach time, a statement will print to the screen. " +
                        "\n\n This means that that copy of the method is placed on hold, and " +
                        "\nanother copy is started.  Eventually when the parameter decreases " +
                        "\nto 1, the calls will begin to return through the stack.\n\n");

        System.out.print( "  In order to slow things down between method calls, I'm using \n" +
                "  a Scanner that calls nextline(); \n  when the program pauses, you " +
                "should hit ENTER \n  to go on to the next method call or return.\n\n" );
        System.out.print("Please enter your number:  ");
        times = in.nextInt();

        System.out.println("Here we go... calling factorIt with " +
                times + "...\n");
        result = factorIt(times);
        System.out.print("The final result is: " + result + "!\n\n");
    }
}

