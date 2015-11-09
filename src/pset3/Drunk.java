package pset3;

import java.util.Random;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 10/30/2015
 */
public class Drunk {
    public final static int CONSTANT = 9;

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= CONSTANT; i++){

            int result = drunkWalk();
            if (result < 0){
                result = result * -1;
//                sum += result;
                System.out.println("Here we go again... time for a walk! \n" +
                        "Took " + result + " steps, and\nLanded in JAIL.");
            } else {
                System.out.println("Here we go again... time for a walk! \n" +
                        "Took " + result + " steps, and\n Landed at HOME.");
            }
            sum += result;
            System.out.println();
        }
        System.out.printf("Average # of steps equals " + "%.2f\n", (double) sum/CONSTANT);
    }

    public static int drunkWalk(){

        int home = 0; // Main Street
        int jail = 10; // Jail @ corner 10 on Main st.
        int starting_location = 5;
        int totalSteps = 0;

        do {
            double r  = Math.random();
            if (r <= 0.5){
                starting_location++;
            }else {
                starting_location--;
            }
            totalSteps++;
        }while (starting_location != jail && starting_location != home);

        if (starting_location == jail){
            totalSteps = totalSteps * -1;
        }

        return totalSteps;
    }
}
