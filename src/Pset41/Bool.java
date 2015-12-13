package Pset41;

import java.util.Arrays;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10A Introduction to Computer Science Using Java I
 * Professor Dr. Henry Leitner
 * Teaching Assistant Mr. David Habermehl
 *
 * @author Kevin Phillips
 * @since 12/7/15
 */
public class Bool {
    /**
     * This method analyzes a boolean array passed as an argument and prints out the index location of the first and
     * last true values along with a count of the number of consecutive true values. This method handles empty arrays
     * but does not handle arrays without no true values.
     *
     * @param list a boolean array passed from main
     */
    public static void fullOfBool(boolean[] list){
        boolean [] listEmpty = {};
        if (Arrays.equals(list,listEmpty)){
            System.out.println("The array is empty.");
        }else {

            for (int i = 0; i < list.length; i++){
                if (list[i]){
                    System.out.println("The first 'true' value is found at location " + i);
                    break;
                }/*else {
                    System.out.println("There are no 'true' values.");
                }*/
            }
            for (int i = list.length - 1; i >= 0; i--){
                if (list[i]){
                    System.out.println("The last 'true' value is found at location " + i);
                    break;
                }/*else {
                    System.out.println("There are no 'true' values.");
                }*/
            }
            int counter = 0;
            for (int i = 0; i < list.length; i++){
                if (list[i]){
                    counter++;
                }
            }
            System.out.println("The most consecutive 'true' value(s) are " + counter);
        }
    }

    /**
     * The main method tests out the fullOfBool method with several sample arrays defined and printed out to the
     * console prior to the test evaluations.
     */
    public static void main(String[] args) {
        boolean [] test1 = {false, true, true, true};
        boolean [] test2 = {true};
        boolean [] test3 = {true, true, true, true, false};
        boolean [] test4 = {};
        System.out.println("boolean [] test1 = {false, true, true, true};");
        System.out.println("fullOfBool(test1);");
        fullOfBool(test1);
        System.out.println();
        System.out.println("boolean [] test2 = {true};");
        System.out.println("fullOfBool(test2);");
        fullOfBool(test2);
        System.out.println();
        System.out.println("boolean [] test3 = {true, true, true, true, false};");
        System.out.println("fullOfBool(test3);");
        fullOfBool(test3);
        System.out.println();
        System.out.println("boolean [] test4 = {};");
        System.out.println("fullOfBool(test4)");
        fullOfBool(test4);
    }
}