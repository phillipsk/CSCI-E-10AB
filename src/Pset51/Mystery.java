package Pset51;

import java.util.Arrays;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10B Introduction to Computer Science Using Java II
 * Professor Dr. Henry Leitner
 * Teaching Assistant Brandon Tineo
 *
 * @author Kevin Phillips
 * @since 2/8/17
 */
public class Mystery {

    public static void mystery (int [] a, int [] b){
        for (int i = 0; i < a.length; i++){
            a[i] += b[b.length - 1 - i];
        }
    }

    public static void main(String[] args){
        int [] a1 = {1, 3, 5, 7, 9};
        int [] a2 = {1, 4, 9, 16, 25};
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        mystery (a1, a2);

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        System.out.println("The contents of array a1 update to: " + Arrays.toString(a1));
    }
}
