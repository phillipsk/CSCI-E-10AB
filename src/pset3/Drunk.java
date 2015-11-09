package pset3;

import java.util.Random;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 10/30/2015
 */
public class Drunk {
    public final static int CONSTANT = 5;

    /**
     * This program simulates a late night drunk walk of a student after a Thanksgiving party. S/he begins at
     * corner '5' and depending on a 50% chance as defined by the random Math class, the student either walks
     * the length of 1 corner to the left or right. The students movement is captured through the drunkWalk method
     * which returns a positive or negative returned variable 'totalSteps' count indicating the total steps which is later evaluated
     * in main. Depending on positive or negative sign of the returned value, Main either prints a "LANDED Home" or "LANDED in
     * Jail" statement and further calculates the average total steps as a sum variable increments the total steps over the
     * IF statement iterations according to the CONSTANT value. Please note a printf statement is used to print
     * the average value, defined as sum/CONSTANT and further casted to type double, to truncate any valued past one decimal place.
     */
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= CONSTANT; i++){

            int result = drunkWalk();
            if (result < 0){
                result = result * -1;
                System.out.println("Here we go again... time for a walk! \n" +
                        "Took " + result + " steps, and\nLanded in JAIL.");
            } else {
                System.out.println("Here we go again... time for a walk! \n" +
                        "Took " + result + " steps, and\n Landed at HOME.");
            }
            sum += result;
            System.out.println();
        }
        System.out.printf("Average # of steps equals " + "%.1f\n", (double) sum/CONSTANT);
    }

    /**
     * @return  totalSteps  Indicates the total steps takes by the student after each 50% iteration through the a
     * preceding if statement A value is only returned if the starting location, which initially initialized at 5,
     * either increments to 10, jail, or to 0, home. If initialized to jail, the totalSteps value is converted to
     * a negative amount to indicate to Main, through not only the total steps returned but also depending on the
     * sign, the ending location of the student.
     */
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
