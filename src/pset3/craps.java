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

//        diceRoll();
    }

    /*public static int rInt(int a, int b){

    }*/




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
        } while (sum > 3 && sum < 11 && sum == 7);
        if (COUNTER < 1){
            System.out.println(sum + " is now the established POINT.");;
        }
        int point = sum;
        while (diceRoll() == point){
            System.out.println("YOU WIN");
        }

        return sum;
    }
}