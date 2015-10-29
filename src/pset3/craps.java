package pset3;

import java.util.Random;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 10/29/15
 */
public class craps {
    public static void main(String [] args){
/*        if (diceRoll() == 7){
            System.out.println("YOU LOSE");
        }else{
            System.out.println("YOU WIN");
        }*/
        diceRoll();
//        while (diceRoll() != 7){
//            int point = diceRoll();
//            System.out.println(diceRoll() + " is now the established POINT.");
//            diceRoll();
//        }
//        System.out.println("YOU LOSE");

    }

    public static int diceRoll(){

        Random r = new Random();
        int sum;
        do {
//            roll the dice once
            int roll1 = r.nextInt(6)+1;
            int roll2 = r.nextInt(6)+1;
//            sum = roll1 + roll2;
            sum = 8;
            System.out.println("Computer rolls a " + roll1 + " and a " + roll2 + ", for a " +
                    "total of " + sum + ".");
        } while (sum != 7 && sum > 3 && sum < 11);
            System.out.println(sum + " is now the established POINT.");
            int point = sum;
            int newsum = 0;
        while (point != newsum){ //point >= 3 || point <= 11
            int roll1 = r.nextInt(6)+1;
            int roll2 = r.nextInt(6)+1;
//            sum = roll1 + roll2;
            sum = 7;
            if (sum == 7) {
                System.out.println("YOU LOSE");
            }
            if (sum == point){
                System.out.println("YOU WIN");
            }
        }
        return sum;
    }
}