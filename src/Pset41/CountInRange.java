package Pset41;

import java.util.Arrays;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10A Introduction to Computer Science Using Java I
 * Professor Dr. Henry Leitner
 * Teaching Assistant Mr. David Habermehl
 *
 * @author Kevin Phillips
 * @since 12/7/2015
 */
public class CountInRange {
    public static int countInRange(int[] list, int min, int max){
        int count = 0;
        for (int n : list){
            if (n >= min && n <= max){
                count++;
            }
        }
        return count;
    }

    //        Difference between static and non-static??
public final static int EXAMPLES = 10;

    public static void main(String[] args) {
//        int[] array_list = {14, 1, 7, 22, 17, 36, 7, -43, 5};
//        System.out.println(countInRange(array_list, 4, 17));
        int[] array_list = new int[EXAMPLES];
        for (int i = 0; i <= EXAMPLES; i++){
/*            for (int j = (int) (Math.random() * 100); ; j++){

            }*/

            array_list[i] = int num = (int) (Math.random() * 100);

/*            do {
                int num = (int) (Math.random() * 100);
                array_lis
            }while (array_list.length <= EXAMPLES)*/

        }
        int num = (int) (Math.random() * 100);
        System.out.println(num);
        int[] array_list2 = {(int) (Math.random() * 100)};
        System.out.println(Arrays.toString(array_list2));
    }
}
