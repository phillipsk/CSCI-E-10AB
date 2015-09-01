/**
 * Created by Kevin Phillips on 9/1/15.
 * Following Reges, Stuart, and Martin Stepp. Building Java Programs: A Back to Basics Approach. 3rd Edition.
 * Chapter
 */
public class Ch3 {
    public static void main(String[] args) {
       double answer = sum(10);
        System.out.println("The sum is " + answer);

        System.out.println("The hypotenuse is " + hypotenuses(20, 40));
    }

    public static double sum(double n){
        return (n + 1) * n / 2;
    }

    public static double hypotenuses(double a, double b){
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;
    }

}
