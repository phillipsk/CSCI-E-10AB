import java.util.Scanner;

/**
 * Created by Kevin Phillips on 9/5/15.
 * Following Reges, Stuart, and Martin Stepp. Building Java Programs: A Back to Basics Approach. 3rd Edition.
 * Chapter 4
 */
public class Ch4 {
    public static void main(String[] args) {
//        hailstone_Sequence();
        printFactorial();
    }

    public static void hailstone_Sequence(){
        giveIntro();
        Scanner user_console = new Scanner(System.in);
        System.out.println("Please provide a starting integer: ");
        int BEGINVALUE = user_console.nextInt();
//        System.out.println("Please provide an ending integer: ");
//        int ENDVALUE = user_console.nextInt();
        System.out.println("Thank you. How long would you liked the sequence to be?");
        int STEPS = user_console.nextInt();
        System.out.println("Calculating..");
        compute_Hailstone_Sequence(BEGINVALUE, STEPS);
    }

    public static int compute_Hailstone_Sequence(int begin_num, int steps) {
//          expected output = 7 22 11 34 17 52 26 13 40 20 10
        System.out.print(begin_num + " ");
        int x = 0;
//        int min, max;
//        Cannot initialize to 0
        int min = begin_num;
        int max =  begin_num;
//        x = begin_num;

        for (int i = 1; i <= steps; i++) {
            if ((begin_num & 1) == 0) {
//                even
//                int x = 0;
                x = (begin_num / 2);
                System.out.print(x + " ");
                begin_num = x;
            } else {
//                int x = 0;
                x = (3 * begin_num + 1);
                System.out.print(x + " ");
                begin_num = x;
            }
            if (begin_num >= max){
                max = begin_num;
            } else if( begin_num <= min) {
                min = begin_num;
            }
        }
        System.out.println();
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        return x;
/*        return min;
        return max;*/
    }
    public static void giveIntro(){
        System.out.println("In mathematics, there is an open problem that involves\n " +
                "what are known as hailstone sequences.\n" +
                "These sequences of numbers often rise and\n " +
                "fall in unpredictable pattern, which is somewhat\n" +
                " analogous to the process that forms hailstones.\n");
        System.out.println("This method outputs hailstone sequences:");
    }
// return math needed to calculate factorial, but not yet included in main method
    public static int factorial(int n){
        int product = 1;
        for (int i = 2; i <= n; i++){
            product = product * i;
        }
        return product;
    }

    public static void printFactorial(){
        for (int i = 0; i <= 10; i++){
            System.out.println(i + "! = " + factorial(i));
        }
    }
}


