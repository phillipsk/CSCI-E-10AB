package Pset41;

import java.util.Arrays;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10A Introduction to Computer Science Using Java I
 * Professor Dr. Henry Leitner
 * Teaching Assistant Mr. David Habermehl
 *
 * @author Kevin Phillips
 * @since 12/19/15
 */
public class Pencil_and_Paper_6 {
    static int digitSum(int n) {
        if (n < 10) {
            return n;
        } // base case
//            else return ???;
        return n;
    }

    public static void main(String[] args) {
        char ticTacToe [][] = { {'o',' ',' '},
                                {' ','x','o'},
                                {'x','o','x'} };
        int[][] twodim = {{1, 2}, {3, 4, 5}, {5, 6, 7, 8}};
//        System.out.println(Arrays.toString(ticTacToe));
//        System.out.println(Arrays.toString(twodim));

        String [][] foobar = {
                {"Matthew","Mark","Luke","John"},
                {"four","two","three","five","six"}
        };
        double sum = 0;
        double num = 0;
        int string_number = 0;
            for (int i = 0; i < foobar [i].length; i++)
        {
//            System.out.println(Arrays.toString(foobar[i]));
//            sum = foobar[0] [1].length; //here
            System.out.println(sum);
//            num = foobar [2] [i];
//            sum += foobar [2] [i];
        }
        System.out.println ("Average pay for type 2 programmer = " +
                sum / foobar [2].length);

    }
}
