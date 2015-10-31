package pset3;

import java.util.Random;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 10/29/15
 */
public class Craps {


    public static void main(String [] args){

        diceRoll();
    }


    public static int diceRoll(){
        final int COUNTER = 1;
        Random r = new Random();
        int sum;
        do {
//            roll the dice once
            int roll1 = r.nextInt(6)+1;
            int roll2 = r.nextInt(6)+1;
            sum = roll1 + roll2;
//            sum = 7;
            System.out.println("Computer rolls a " + roll1 + " and a " + roll2 + ", for a " +
                    "total of " + sum + ".");
        } while (sum >= 3 && sum <= 11 && sum == 7);
        int point = sum;
        System.out.println(point + " is now the established POINT.");
        int newSUM;
        do {
            int roll3 = r.nextInt(6)+1;
            int roll4 = r.nextInt(6)+1;
            sum = roll3 + roll4;
//            sum = 7;
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