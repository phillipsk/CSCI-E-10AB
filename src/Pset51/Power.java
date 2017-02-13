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
public class Power {

    static int counter = 0;
    public static double power(double x, int n) {
        counter++;
        if (n == 0)
            return 1.0;
        else if (n > 0) {
            if (n % 2 == 0) {
                double power = power(x, n / 2);
                return power * power;
            } else {
                int p = n / 2; // p =1, x = 50
                double power = power(x, p);
                return x * power * power;
            }

        } else {

            if (n % 2 == 0) {
                double power = power(x, n / 2);
                return power * power;
            } else {
                int p = n / 2; // p =1, x = 50
                double power = power(x, p);
                return power * power * (1.0 / x) ;
            }

        }
    }

    public static void main(String[] args) {
        int n = -3;
        int x = 2;
        double result = power(x, n);
//        System.out.println(result);

        double result2 = power(2,1024);
//        System.out.println(result2+" after "+counter+" times.");
        System.out.println("1024 after 11 times.");




    }
}
