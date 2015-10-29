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
        }else {
            int point = diceRoll();
            System.out.println(diceRoll() + " is now the established POINT.");
            if (diceRoll() == point);{
                System.out.println("YOU WIN");
            }
        }*/
        while (diceRoll() != 7){
            diceRoll();
            int point = diceRoll();
            System.out.println(diceRoll() + " is now the established POINT.");
        }
        System.out.println("YOU LOSE");
//        System.out.println(rInt(2, 6));
    }

/*    public static int rInt(int a, int b){
        return a + (int) ( (b-a+1) * Math.random() );
    }*/

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
        } while (sum <= 3 && sum != 7 && sum >= 11);
        return sum;
    }
}