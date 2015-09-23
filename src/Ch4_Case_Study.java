import javax.sound.midi.SysexMessage;
import java.security.PublicKey;
import java.util.Scanner;

/**
 * Created by Kevin Phillips on 9/23/15.
 * Following Reges, Stuart, and Martin Stepp. Building Java Programs: A Back to Basics Approach. 3rd Edition.
 * Chapter
 */
public class Ch4_Case_Study {
    public static void main(String[] args) {
        give_IntroBMI();

//        prompt user for their height and weight
        Scanner console = new Scanner(System.in);

        System.out.println("How many individuals will be receiving a BMI calculation?");
        int users_TOTAL = console.nextInt();
        if (users_TOTAL <= 0) {
            throw new IllegalArgumentException("Please provide a logical entry.");
        } else if(users_TOTAL >= 10){
            throw new IllegalArgumentException("The maximum number of participants for this program is 2.");
        } else{
            for (int i = 0; i < 2; i++){


                System.out.println("Please enter your age: ");
                int user_AGE = console.nextInt();
                System.out.println("Please enter your weight: ");
                double user_WEIGHT = console.nextDouble();
                System.out.println("Please enter your height: ");
                double user_HEIGHT = console.nextDouble();
                System.out.println("\nThank you. Please wait while we calculate your Body Mass Index (BMI)..");
//                System.out.print("Your BMI is: ");
                System.out.printf("\nYour BMI is: %10.2f\n", calcBMI(user_AGE, user_WEIGHT, user_HEIGHT));
                if(i < 1) {
                    System.out.println("\nNext individual please.");
                    System.out.println();
                }
            }
//        System.out.println("Your BMI is: "+ calcBMI(user_AGE,user_WEIGHT,user_HEIGHT));
        }
    }

    public static double calcBMI(int age, double weight, double height){
//        Calculate BMI by dividing weight in pounds (lbs) by height in inches (in)
//          squared and multiplying by a conversion factor of 703.
//        BMI formula: weight (lb) / [height (in)]2 x 703

//        preconditions: ****
        double BMI = weight / Math.pow( height,2)*703;
        return BMI;
    }

    public static String respone_BMI(){
        double results = calcBMI(user_AGE, user_WEIGHT, user_HEIGHT);
    }

    public static void give_IntroBMI(){
        System.out.print("This program reads data for (2) two \n" +
                "people and computes their body \n" +
                "mass index and weight status.\n\n");
    }
}
