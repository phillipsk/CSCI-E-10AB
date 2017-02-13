package Pset51;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10B Introduction to Computer Science Using Java II
 * Professor Dr. Henry Leitner
 * Teaching Assistant Brandon Tineo
 * Received help from Codementor.io Dharmendra Prasad
 *
 * @author Kevin Phillips
 * @since 2/12/17
 */
public class Powerv2 {

    public static double power (double x, int n)
    {
        if (n == 0) return 1.0;
        else if (n > 0) return x * power(x, n-1);
        else return 1.0 / power(x, -n);
    }

    public static void main(String[] args){
        System.out.println(power(10,5));
    }
}
