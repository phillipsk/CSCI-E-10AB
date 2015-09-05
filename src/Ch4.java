import java.util.Scanner;

/**
 * Created by Kevin Phillips on 9/5/15.
 * Following Reges, Stuart, and Martin Stepp. Building Java Programs: A Back to Basics Approach. 3rd Edition.
 * Chapter
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

    public static int compute_Hailstone_Sequence(int begin_num, int steps){
        System.out.print(begin_num + " ");
        for (int i = 1; i <= steps; i++ ){
            int x;
            if ((begin_num & 1) == 0 ){
//                even
//                int x = 0;
                x = (begin_num / 2);
                System.out.print(x + " ");
//                return x;
            }
            else {
//                int x = 0;
                x = (3 * begin_num + 1);
                System.out.print(x + " ");
//                return x;
            }
            return x;
        }
        return begin_num;
    }

/*    public static int odd_or_Even(int input_num){
        if ((input_num & 1) == 0 ){

        }

    }*/

    public static void giveIntro(){
        System.out.println("In mathematics, there is an open problem that invlolves\n " +
                "what are known as hailstone sequances.\n" +
                "These sequences of numbers often rise and\n " +
                "fall in upredictable patterna, which is somewhat\n" +
                " analgous to the process that forms hailstones.\n");
        System.out.println("This method ouputs hailstone sequences:");
    }
}
