package pset3;

import java.util.Random;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 10/29/15
 */
public class Craps {


    /**
     * This program simulates the casino game craps. Through the use of the random class, two dice are 'rolled'
     * and two pseudo-random integers between 1-6 are populated through a call of the diceRoll method.
     */
    public static void main(String [] args){
        diceRoll();
    }


    /**
     * This method simulates a dice roll through the random class method. Two integers roll1 and roll2 represent each
     * dice and their total is defined through the sum variable. The sum variable is evaluated through a while loop
     * to check whether the sum of both dice is either 4,5,6,8,9, or 10, if so the program will establish a "POINT"
     * and proceed to roll the dice a second time through a do while loop where if the previously established POINT
     * value matches the second roll before a "7" is rolled, the user wins. Otherwise if a 7 is rolled the user loses.
     *
     *
     * @return  sum represents a string message of either victory "YOU WIN" or "Failure" depending on whether the
     * established point rolls a second time through the second infinite do while loop.
     */
    public static int diceRoll(){
        Random r = new Random();
        int sum;
        do {
//            roll the dice once
            int roll1 = r.nextInt(6)+1;
            int roll2 = r.nextInt(6)+1;
            sum = roll1 + roll2;

            System.out.println("Computer rolls a " + roll1 + " and a " + roll2 + ", for a " +
                    "total of " + sum + ".");
        } while (sum <= 3 || sum >= 11 || sum == 7);

        int point = sum;

        System.out.println(point + " is now the established POINT.");

        do {
            int roll3 = r.nextInt(6)+1;
            int roll4 = r.nextInt(6)+1;
            sum = roll3 + roll4;
            System.out.println("Computer rolls a " + roll3 + " and a " + roll4 + ", for a " +
                    "total of " + sum + ".");
        }while (sum != point && sum != 7);

        if (sum == 7){
            System.out.println("YOU LOSE");
        }else {
            System.out.println("YOU WIN");
        }
        return sum;
    }

}