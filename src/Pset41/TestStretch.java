package Pset41;

import java.util.Arrays;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10A Introduction to Computer Science Using Java I
 * Professor Dr. Henry Leitner
 * Teaching Assistant Mr. David Habermehl
 *
 * @author Kevin Phillips
 * @since 12/8/15
 */
public class TestStretch {
    /**
     * This program converts a one dimensional array into another single dimension array, twice the size of the first,
     * with the contents of the second array representing a pair of numbers that sum to the each of the integers in the
     * first array, sequentially. For example, if a variable named list refers to an array storing the values {18,
     * 7, 4, 24, 11}, the call of stretch (list) should return a new array containing
     * {9, 9, 4, 3, 2, 2, 12, 12, 6, 5}. (The number 18 is stretched into the
     * pair 9, 9, the number 7 is stretched into 4, 3, the number 4 is stretched into 2, 2, the
     * number 24 is stretched into 12, 12 and the number 11 is stretched into 6, 5.)
     *
     * @param list any single dimension integer array
     * @return  a single dimension array double the length of the array passed in the method header argument
     */
    public static int[] stretch(int[] list){
        int[] stretched_array = new int[list.length * 2];
        for (int i = 0; i < stretched_array.length; i+=2){
            for (int j = 0; j < list.length; j++){
                if (list[j] % 2 == 0){
                    stretched_array[i] = list[j] / 2;
                    stretched_array[i+1] = list[j] / 2;
                    i+=2;
                }else {
                    stretched_array[i] = (list[j] / 2) +1;
                    stretched_array[i+1] = list[j] / 2;
                    i+=2;
                }
            }
        }
        return stretched_array;
    }

    /**
     * The main method first prints the array {18, 7, 4, 24, 11} and then passes that array to the method TestStretch
     * and continues to demonstrate the example outlined in the comments of the TestStretch method.
     */
    public static void main(String[] args)
    {
        int[] list = {18, 7, 4, 24, 11};
        int[] list2 = stretch(list);
        System.out.println (Arrays.toString(list));
            // the above prints [18, 7, 4, 24, 11]
        System.out.println (Arrays.toString(list2));
            // the above prints [9, 9, 4, 3, 2, 2, 7, 7, 6, 5]
    }
}