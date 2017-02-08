package Pset51;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10B Introduction to Computer Science Using Java II
 * Professor Dr. Henry Leitner
 * Teaching Assistant Brandon Tineo
 *
 * @author Kevin Phillips
 * @since 2/8/17
 *
 * Received help from CodeMentor Dharmendra Prasad
 */
public class RecTriangle {

    public static void printTriangle(int s){
        if (s < 1) return;
//        printTriangle (s-1);
        for (int i = 0; i < s; i++)
        {
            System.out.print( "[]");
}
        System.out.println ();
        printTriangle (s-1); // moved here
    }

    public static void main(String[] args){
        printTriangle(4);
    }
}
