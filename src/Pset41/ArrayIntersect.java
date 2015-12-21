package Pset41;

import java.util.Arrays;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10A Introduction to Computer Science Using Java I
 * Professor Dr. Henry Leitner
 * Teaching Assistant Mr. David Habermehl
 *
 * @author Kevin Phillips
 * @since 12/16/15
 */
public class ArrayIntersect {

    public static boolean intersection(int[] list1, int[] list2){
        for (int ii = 0; ii < list1.length; ii++){
            for (int kk = 0; kk < list2.length; kk++){
                if (list1[ii] == list2[kk]){
                 // list1[ii] == list2[kk])
//                    Arrays.equals(list1[ii], list2[kk]
                            System.out.println("Correct");
                    return true;
                }
                System.out.println(list1[ii]);
                System.out.println(list2[kk]);
            }
        }
        return false;
    }

    public static void main(String[] args) {


        int[] array_list1 = new int[10];
        int[] array_list2 = new int[10];
        for (int i = 0; i < 1; i++){
            for (int j = 0; j < array_list1.length; j++){
                array_list1[j] = (int) (Math.random() * 10);
            }
            for (int k = 0; k < array_list2.length; k++){
                array_list2[k] = (int) (Math.random() * 10);
            }
            System.out.println(Arrays.toString(array_list1));
            System.out.println(Arrays.toString(array_list2));

            intersection(array_list1,array_list2);

        }
    }
}