package FinalExamReview10a;

import java.util.Arrays;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10A Introduction to Computer Science Using Java I
 * Professor Dr. Henry Leitner
 * Teaching Assistant Mr. David Habermehl
 *
 * @author Kevin Phillips
 * @since 12/21/15
 */
public class FinalExam_Prob16 {

    public static int [] [] indent(int n){
        int [][] temp = new int[n][n];

        for (int row = 0; row < temp.length;row++){
            for (int col = 0; col < temp[row].length; col++){
                if (row == col){
                    temp[row][col] = 1;
                }else {
                    temp[row][col] = 0;
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(indent(4)));
    }
}