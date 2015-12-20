package Pset41;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10A Introduction to Computer Science Using Java I
 * Professor Dr. Henry Leitner
 * Teaching Assistant Mr. David Habermehl
 *
 * @author Kevin Phillips
 * @since 12/16/15
 */
public class MindtheGap {

    /**
     * This method analyzes an integer array passed as a parameter and returns the smallest gap among each sequential
     * integerpair within the array. A Pair is defined as two integers. For example, the array {1, 3, 6, 7, 12} would
     * return 1 and the array {3, 5, 11, 4, 8} would return -7. If an array has less than 2 elements zero is returned.
     *
     * @param list  accepts an integer array
     * @return  returns the smallest among each sequential pair of integers and 0 is returned if the array argument is
     * less than two integer elements
     */
    public static int miniGAP(int[] list){
        int gap = 0;
        int firstGap = 0;
        int smallestGap = 0;

        if (list.length <= 1){
            return 0;
        }else {

            for (int i = 0; i < 1; i++){
                int one_postion = list[i];
                int two_position = list[i+1];
                firstGap = two_position - one_postion;
                smallestGap = firstGap;
            }
            for (int i = 0; i < list.length-1; i++){
                int one_postion = list[i];
                int two_position = list[i+1];
                gap = two_position - one_postion;
                if (gap < firstGap){
                    smallestGap = gap;
                }
            }
            return smallestGap;
        }
    }


    /**
     * Through the miniGap method, this program analyzes an integer array passed as a parameter and returns the smallest
     * gap among each sequential integer pair within the array.
     */
    public static void main(String[] args) {

        int array_list[] = {1, 3, 6, 7, 12};
        System.out.println("int array_list[] = {1, 3, 6, 7, 12};");
        System.out.println("The smallest gap is: " + miniGAP(array_list) + "\n");

        int array_list2[] = {3, 5, 11, 4, 8};
        System.out.println("int array_list2[] = {3, 5, 11, 4, 8};");
        System.out.println("The smallest gap is: " + miniGAP(array_list2) + "\n");

        int array_list3[] = {3};
        System.out.println("int array_list3[] = {3};");
        System.out.println("The smallest gap is: " + miniGAP(array_list3) + "\n");

        int array_list4[] = {37, 2};
        System.out.println("int array_list3[] = {37, 2};");
        System.out.println("The smallest gap is: " + miniGAP(array_list4) + "\n");

    }
}