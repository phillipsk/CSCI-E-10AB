package Pset53;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10B Introduction to Computer Science Using Java II
 * Professor Dr. Henry Leitner
 * Teaching Assistant Brandon Tineo
 * Received help from Dharmendra Prasad
 *
 * @author Kevin Phillips
 * @since 3/17/17
 */

/*
A poorly-written, but working Java program got scrambled up on the fridge with
each statement on a separate kitchen magnet. When the code was in the correct order,
here’s what happened at execution time:

java ExcExample Obama
thaws

java ExcExample Foobar
throws

Note that the program was run two different times with a different command-line argument in each case.

Reconstruct the Java code by placing the code magnets in the correct order. Note that some of the curly braces
fell on the floor, and are too small to pick up — so feel free to add as many of those as you need!
*/

public class ExcExample {

        public static void main(String[] args) {
            String test = args[0];
            System.out.print("t");
            try{
                doRisky(test);
            }catch(MyException e){
                System.out.print("r");
                System.out.print("o");
            }finally{
                System.out.print("w");
                System.out.print("s");
            }
        }

        static void doRisky(String arg) throws MyException {
            System.out.print("h");
            if ("Obama".equals(arg)) {
                System.out.print("a");
            }else{
                throw new MyException();
            }
        }
}

class MyException extends Exception {
}
