package Pset53;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10B Introduction to Computer Science Using Java II
 * Professor Dr. Henry Leitner
 * Teaching Assistant Brandon Tineo
 * Received help from Dharmendra Prasad
 *
 * @author Kevin Phillips
 * @since 3/15/17
 */

/*
Write a simple Java program named Prob1 that outputs all of its command-line
arguments, one per line, in reverse order. Here is an example to illustrate:
% java Prob1 fee fie foe fum foobar! The 5 command-line args are:
    foobar!
    fum
    foe
    fie
    fee
*/
public class Prob1 {
    public static void main(String[] args) {
        System.out.println("The "+ args.length +" command-line args are:");
        for(int i = args.length - 1; i >= 0 ; i--){
            System.out.println(args[i]);
        }
    }
}
