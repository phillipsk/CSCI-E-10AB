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
    public static void main(String[] args) {
        drunkWalk();
    }

    public static int drunkWalk(){

        int home = 0; // Main Street
        int jail = 10; // Jail @ corner 10 on Main st.
        int starting_location = 5;
        int totalSteps = 0;

        do {
            Random r = new Random();
            int steps = (r.nextInt(21) - 10);
            starting_location += steps;
//            System.out.println(starting_location);
            totalSteps++;
        }while (starting_location != jail && starting_location != home);

        String ending_location;
        if (starting_location == jail){
            ending_location = ("Landed in JAIL");
        }else {
            ending_location = ("Landed at HOME");
        }
        System.out.print("Here we go again... time for a walk! \n" +
                "Took " + totalSteps + " steps, and \nLanded at " + ending_location);

        return totalSteps;
    }
}
