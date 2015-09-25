import java.util.Random;

/**
 * Created by Kevin Phillips on 9/24/2015
 * Following Reges, Stuart, and Martin Stepp. Building Java Programs: A Back to Basics Approach. 3rd Edition.
 */
public class Ch5 {
    public static void main(String[] args) {
        whilePractice();
    }

    public static void whilePractice(){
        int divisor = 2;
//        illegal
//        int number = Math.random();
        Random r = new Random();
        int number = r.nextInt(100);
        System.out.println("Random number: " + number);
        while (number % divisor != 0){
            System.out.println(number % divisor);
            divisor++;
        }

    }
}
