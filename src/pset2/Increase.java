package pset2;

import java.util.Scanner;

/**
 * csci-e-10ab
 * @author Kevin Phillips
 * @since 10/21/15
 */
public class Increase {

    public static final int DAYS = 10;

    /** This program computes the largest increase that occurred in the price
     *  of a stock during a 10-day period. A constant value declared as 'DAYS' represents the 10 day period.
     * @throws IllegalArgumentException for negative stock valuations
     */
    public static void main(String[] args) {
        System.out.println("Please enter "+ DAYS +" stock prices: ");
        Scanner console = new Scanner(System.in);
        int range, stock, stockA, stockB, day_num_max, day_num_min, largest_increase;
        int stockC = 0;
        int stockD = 0;

        System.out.println("Stock Price    #1 = ");
        stockA = console.nextInt();
        day_num_min = 1;
        System.out.println("Stock Price    #2 = ");
        stockB = console.nextInt();
        day_num_max = 2;
        largest_increase = stockB - stockA;

        for (int i = 3; i <= DAYS; i++) {

            System.out.println("Stock Price    #" + i + " = ");
            stock = console.nextInt();
            range = stock-stockB;

            if (range > largest_increase){
                largest_increase = range;
                day_num_max = i;
                day_num_min = day_num_max-1;
                stockA = stockB;
                stockB = stock;
                stockC = stockA;
                stockD = stock;
            } else {
                stockB = stock;
            }

            if (stockA < 0 || stockB < 0 || stock < 0){
                throw new IllegalArgumentException("Negative stock prices are illogical in accordance with " +
                        "our stock markets. Please enter positive stock valuations.");
            }
        }
        if (largest_increase == 0){
            System.out.println("There was no increase in price among those "+ DAYS + " valuation dates");
        } else {

            System.out.println("The largest increase of " + largest_increase);
            System.out.println("from " + stockC + " to " + stockD);
            System.out.println("occurred between day #" + day_num_min + " and " +
                    "day #" + day_num_max);
        }
    }
}