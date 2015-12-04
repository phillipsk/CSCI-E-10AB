package Pset41;

import java.util.Arrays;
import java.util.Random;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10A Introduction to Computer Science Using Java I
 * Professor Dr. Henry Leitner
 * Teaching Assistant Mr. David Habermehl
 *
 * @author Kevin Phillips
 * @since 12/4/15
 */
class Foobar
{
    public static void main (String [] args)
    {
//        1 properly define array
        int r[] = new int[20];
//        5 The Question asks for an array of INTEGER values, changed Math.Random() class to new Random object,
//        previously tried to type cast the Math.Random() class into an integer but found allow resulting values
//        rounded down
        Random rand_num = new Random();

//        2 Not a method call, differences among object and array methods
//        3 Modified for loop continuation parameter to be less than array length, which keeps array index in bound
        for (int i = 0; i < r.length; i++)
//            4 appropriately call the random() method of the Math class

//            5 The Question asks for an array of INTEGER values
            r[i] = rand_num.nextInt();
    }
}