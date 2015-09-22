import java.util.Scanner;

/**
 * Created by Kevin Phillips on 9/21/15.
 * Following Reges, Stuart, and Martin Stepp. Building Java Programs: A Back to Basics Approach. 3rd Edition.
 * Chapter
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter two staring values to begin the sequence");
        int f1 = console.nextInt();
        int f2 = console.nextInt();

        calcFib(f1, f2);

    }

    public static double calcFib(int f1,int f2) {
        int n;
        System.out.print(f1+" "+f2+" ");
        n = f1 + f2;



        if (f1 == 0) {


/*        } else if (f2 == 0) {
            System.exit(0);*/
        } else {
            System.exit(0);
        }
        return n;
    }
}
