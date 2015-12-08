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

    /**
     * This final constant represents the total examples demonstrated.
     */
    public final static int EXAMPLES = 4;
    /**
     * This final constant represents the size or variable array_list
     */
    public final static int SIZE = 10;

    /**
     * This method takes an argument of one integer array, a minimum integer value,and a maximum integer value.
     * The array's length is defined through the constant value SIZE.This method returns an integer count variable
     * which represents the number of integers which exist in the passed array between the minimum and maximum passed
     * values.
     *
     * @param list  represents the passed array from main
     * @param min   represents the minimum value which defines the beginning of the counting range
     * @param max   represents the maximum value which defines the ending of the counting range
     * @return  an integer count variable which represents the number of integers which exist between the minimum
     *          and maximum parameters.
     */
    public static int countInRange(int[] list, int min, int max){
        int count = 0;
        for (int n : list){
            if (n >= min && n <= max){
                count++;
            }
        }
        return count;
    }

    /**
     * This main method demonstrates the functionality of the countInRange method through several examples defined
     * through the constant value EXAMPLES. This program randomizes every integer value. Every integer in the array
     * is randomized, Every Minimum and Maximum value is randomized. All three of the parameters passed into
     * countInRange are randomized. Negative values are included.Pseudo-random numbers are assumed as
     * randomized integers.
     */
    public static void main(String[] args) {
        int passed_min = 0;
        int passed_max = 0;
        int[] array_list = new int[SIZE];

        System.out.println("Demonstrating " + EXAMPLES + " example(s) with an array size of " + SIZE + "\n");
        for (int i = 1; i <= EXAMPLES; i++){
            for (int j = 0; j < array_list.length; j++){
                if (Math.random() > 0.5){
                    array_list[j] = (int) (Math.random() * -100); // (int) (Math.random() * -100);
                }else {
                    array_list[j] = (int) (Math.random() * 100);
                }
                do {
                    if (Math.random() > 0.5){
                        passed_min = (int) (Math.random() * -100);
                        passed_max = (int) (Math.random() * 100);
                    }else {
                        passed_min = (int) (Math.random() * 100);
                        passed_max = (int) (Math.random() * 100);
                    }
                }while (passed_min > passed_max);
            }
            System.out.println("Arrary #" + i + " " + Arrays.toString(array_list) + "\n" +
                            "Min value = " + passed_min + "\nMax value = " + passed_max + "\n" +
                    "CountIn Range = " + countInRange(array_list,passed_min,passed_max) + "\n");
        }
    }
}
