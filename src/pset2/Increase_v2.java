package pset2;

import java.util.Scanner;


/**
 * @author Kevin Phillips
 * @since 10/13/15
 * csci-e-10ab
 */
public class Increase_v2 {

    public static final int DAYS = 4;;

    public static void main(String args[]){


    int day_num_max = 0;
    int day_num_min = 0;
    int range = 0;
    int stock = 0;
    int min = 1000000;
    int max = 0;

    System.out.println("");

        // what does this do??
        // 48 54 49 47 62 64 59 70 75 82
/*
        10 20 40 15
        Day 2 to 3 with a jump of 20
*/
        Scanner console = new Scanner(System.in);

        System.out.println("Please enter "+ DAYS +" stock prices: ");
        for (int i = 1; i <= DAYS; i = i+2) {
            System.out.println("Stock Price = ");
            stock = console.nextInt();

            if (stock >= max){
                max = stock;
                day_num_max = i;
            }
            if (stock <= min){
                min = stock;
                day_num_min = i;
            }

            for (int j = 1; j <= 2; j++){
                System.out.println("Stock Price = ");
                stock = console.nextInt();


                if (stock >= max){
                    max = stock;
                    day_num_max = i;
                }
                if (stock <= min){
                    min = stock;
                    day_num_min = i;
                }

            }




    //            calculates the range from max stock price to minimun stock price
            range = max - min;
            }
            System.out.println("The largest increase of " + range);
            System.out.println("from " + min + " to " + max);
            System.out.println("occurred between day #" + day_num_min + " and " +
            "day #" + day_num_max);
    }
}