package pset2;

import java.util.Scanner;

/**
 * Unit 22, Part B Problem Set, Increase.java
 * @author Kevin Phillips on 10/7/2015
 */
public class Increase {

    // Number of days of stock prices
    public static final int DAYS = 6;

    public static void main(String[] args) {
        System.out.println("Please enter "+ DAYS +" stock prices: ");
        Scanner console = new Scanner(System.in);
        int day_num_max = 0;
        int day_num_min = 0;
        int range = 0;
        int stock = 0;
        int stockA = 0;
        int stockB = 0;
        int stockC = 0;
        int stockD = 0;
        int largest_increase = 0;

        System.out.println("Stock Price    #1 = ");
        stockA = console.nextInt();
        day_num_min = 1;
        System.out.println("Stock Price    #2 = ");
        stockB = console.nextInt();
        day_num_max = 2;

        largest_increase = stockB - stockA;

//        max = Integer.min(stock,stockB);

        // what does this do??
        // 48 54 49 47 62 64 59 70 75 82
/*
        10 20 40 15     50 10
        Day 2 to 3 with a jump of 20
*/

//        What does this do ???
        for (int i = 3; i <= DAYS; i++) {

            System.out.println("Stock Price    #" + i + " = ");
            stock = console.nextInt();
            range = stock-stockB;

            if (range > largest_increase){
                largest_increase = range;
                day_num_max = i;
                day_num_min = day_num_max-1;
                stockA = stockB; // a = 20
                stockB = stock; // b = 40
                stockC = stockA;
                stockD = stock;
            } else {
                stockB = stock; // 15
//                day_num_min = i;
//                day_num_max = i;
            }



        }
        System.out.println("The largest increase of " + largest_increase);
        System.out.println("from " + stockC + " to " + stockD);
        System.out.println("occurred between day #" + day_num_min + " and " +
                "day #" + day_num_max);
    }
}