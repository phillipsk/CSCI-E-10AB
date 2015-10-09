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
        int day_num_max = 0;
        int day_num_min = 0;
        int range = 0;
        int stock = 0;
        int min = 0;
        int max = 0;

        System.out.println("Please enter "+ DAYS +" stock prices: ");
        for (int i = 1; i <= DAYS; i++) {
            Scanner console = new Scanner(System.in);
            System.out.println("Stock Price    #" + i + " = ");

            stock = console.nextInt();
            if (stock > max){
                max = stock;
                day_num_max = i;
            } /*else {
                min = stock;
                day_num_min = i;
            }
*/
            range = max - stock;

        }
        System.out.println("The largest increase of " + range);
        System.out.println("from " + min + " to " + max);
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
