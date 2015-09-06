import java.util.Scanner;

/**
 * Created by Kevin Phillips on 9/5/15.
 * Following Reges, Stuart, and Martin Stepp. Building Java Programs: A Back to Basics Approach. 3rd Edition.
 * Chapter 4
 */
public class Ch4 {
    public static void main(String[] args) {
        hailstone_Sequence();
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
        for (int i = 1; i <= steps; i++) {
            if ((begin_num & 1) == 0) {
//                even
//                int x = 0;
                x = (begin_num / 2);
                System.out.print(x + " ");
//                return x;
                begin_num = x;
            } else {
//                int x = 0;
                x = (3 * begin_num + 1);
                System.out.print(x + " ");
//                return x;
                begin_num = x;
            }
        }
        return x;
    }
    public static void giveIntro(){
        System.out.println("In mathematics, there is an open problem that invlolves\n " +
                "what are known as hailstone sequances.\n" +
                "These sequences of numbers often rise and\n " +
                "fall in upredictable patterna, which is somewhat\n" +
                " analgous to the process that forms hailstones.\n");
        System.out.println("This method ouputs hailstone sequences:");
    }
}
