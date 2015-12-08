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
    public static int[] stretch(int[] list){
        int[] stretched_array = new int[list.length * 2];
        for (int i = 0; i < stretched_array.length; i+=2){
            for (int j = 0; j < list.length; j++){
                if (list[j] % 2 == 0){
                    stretched_array[i] = list[j] / 2;
                    stretched_array[i+1] = list[j] / 2;
                }else {
                    stretched_array[i] = list[j+1] / 2;
                    stretched_array[i+1] = list[j] / 2;
                }
                i++;
            }
        }
        return stretched_array;
    }

    public static void main(String[] args)
    {
        int[] list = {18, 7, 4, 14, 11};
        int[] list2 = stretch(list);
        System.out.println (Arrays.toString(list));
            // the above prints [18, 7, 4, 24, 11]
        System.out.println (Arrays.toString(list2));
            // the above prints [9, 9, 4, 3, 2, 2, 7, 7, 6, 5]
    }
}