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
        System.out.println("Please enter your age: ");
        int user_AGE = console.nextInt();
        System.out.println("Please enter your weight: ");
        double user_WEIGHT = console.nextDouble();
        System.out.println("Please enter your height: ");
        double user_HEIGHT = console.nextDouble();
        System.out.println("Thank you. Please wait while we calculate your Body Mass Index (BMI)..");
        System.out.print("Your BMI is: ");
        System.out.printf("Your BMI is: %10.2f\n", calcBMI(user_AGE,user_WEIGHT,user_HEIGHT));
        System.out.printf("Your BMI is: %10.2f ", calcBMI(user_AGE,user_WEIGHT,user_HEIGHT));
    }

    public static double calcBMI(int age, double weight, double height){
//        Calculate BMI by dividing weight in pounds (lbs) by height in inches (in)
//          squared and multiplying by a conversion factor of 703.
//        BMI formula: weight (lb) / [height (in)]2 x 703

//        preconditions: ****
        double BMI = weight / Math.pow( height,2)*703;
        return BMI;
    }

    public static void give_IntroBMI(){
        System.out.print("This program reads data for (2) two \n" +
                "people and computes their body \n" +
                "mass index and weight status.");
    }
}
