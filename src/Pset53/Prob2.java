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


// Provide a simple, but concrete example of how a method might throw a nullPointerException.
// Give a simple explanation of why the nullPointerException is NOT a “checked” exception.

/*
* The below demonstration shows that the testMethod can throw a runtime exception based on the argument passed.
* When the string "hello world" is passed to the testMethod then it correctly prints the length of the string.
* In the second case, if a null is passed to the testMethod, the method throws a null pointer exception.
*
* Checked exceptions are the ones which the compiler is certain that a method can possibly throw.
* For e.g. FileNotFOundException, it is a possibility that the resource is not there.
*
* Where as unchecked exceptions are the one, which can occur due to bad programming practices and may not be an
* obvious failure. Now, the NullPointer exception is clearly something, which should not be a obvious failure and can
* be avoided. Hence, it is not a checked exception.
*/
public class Prob2 {
        public static void main(String[] args) {
            testMethod("hello world");
            testMethod(null);
        }

        public static void testMethod(String s){
            System.out.println("The length of the string is "+ s.length());

        }

}
