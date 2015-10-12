package pset2;

import java.util.Scanner;

/**
 * Unit 22, Part B Problem Set, Increase.java
 * @author Kevin Phillips on 10/7/2015
 */
public class Increase {

    // Number of days of stock prices
    public static final int DAYS = 4;

    public static void main(String[] args) {
        System.out.println("Please enter "+ DAYS +" stock prices: ");
        Scanner console = new Scanner(System.in);
        int day_num_max = 0;
        int day_num_min = 0;
        int range = 0;
        int stock = 0;
        int stockA = 0;
        int stockB = 0;
        int min = 0;
        int max = 0;
        int newMax = 0;

        System.out.println("Stock Price    #1 = ");
        stockA = console.nextInt();
        System.out.println("Stock Price    #2 = ");
        stockB = console.nextInt();
        max = Integer.min(stockA,stockB);

        // what does this do??
        // 48 54 49 47 62 64 59 70 75 82
/*
        10 20 40 15
        Day 2 to 3 with a jump of 20
*/

        for (int i = 3; i <= DAYS; i = i+2) {
            for (int j =1; j <= 2; j++){
                int aabb = j+1;
                System.out.println("Stock Price    #" + aabb + " = ");
                stockA = console.nextInt();
//                System.out.println("Stock Price    #" + i+ + " = ");
//                stockB = console.nextInt();

            }
            stock = console.nextInt();
            if (stock > max){
                newMax = stock;
                day_num_max = i;
            } else {
                min = stock;
                day_num_min = i;
            }

            range = newMax - max;

        }
        System.out.println("The largest increase of " + range);
        System.out.println("from " + min + " to " + newMax);
        System.out.println("occurred between day #" + day_num_min + " and " +
                "day #" + day_num_max);
    }
}
/*
int day_num_max = 0;
int day_num_min = 0;
int range = 0;
int stock = 0;
int min = 1000000;
int max = 0;

System.out.println("Please enter "+ DAYS +" stock prices: ");
        for (int i = 1; i <= DAYS; i++) {
        Scanner console = new Scanner(System.in);
        System.out.println("Stock Price    #" + i + " = ");

        stock = console.nextInt();

        if (stock >= max){
        max = stock;
        day_num_max = i;
        }
        if (stock <= min){
        min = stock;
        day_num_min = i;
        }
//            calculates the range from max stock price to minimun stock price
        range = max - min;
        }
        System.out.println("The largest increase of " + range);
        System.out.println("from " + min + " to " + max);
        System.out.println("occurred between day #" + day_num_min + " and " +
        "day #" + day_num_max);
        }*/


/*

    System.out.print(begin_num + " ");
    int x = 0;
    //        int min, max;
//        Cannot initialize to 0
    int min = begin_num;
    int max =  begin_num;
//        x = begin_num;

    for (int i = 1; i <= steps; i++) {
        if ((begin_num & 1) == 0) {
//                even
//                int x = 0;
            x = (begin_num / 2);
            System.out.print(x + " ");
            begin_num = x;
        } else {
//                int x = 0;
            x = (3 * begin_num + 1);
            System.out.print(x + " ");
            begin_num = x;
        }
        if (begin_num >= max){
            max = begin_num;
        } else if( begin_num <= min) {
            min = begin_num;
        }
    }
    System.out.println();
    System.out.println("max = " + max);
    System.out.println("min = " + min);
    return x;
}
*/
