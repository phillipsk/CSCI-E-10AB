package pset2;

import java.text.DateFormatSymbols;
import java.util.Scanner;

/**
 * csci-e-10ab
 * @author Kevin Phillips
 * @since 10/21/15
 */
public class Easter {
    /** Accepts user input for the following computeEaster method.
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("In which year would you like to view the weekday of Easter?");
        System.out.println("Please enter the year: ");
        int year = console.nextInt();

        computeEaster(year);
    }

    /**This method computes the day of the week Easter falls on courtesy of mathematician
     * Carl Friedrich Gauss's formula developed in 1800
     * @param y represents an integer year passed to computeEaster method from a System.in input
     *          object defined in main
     * @throws IllegalArgumentException if year is outside of 1900 > y < 2100
     */
    public static void computeEaster(int y){
        if (y < 1900 || y > 2100){
            throw new IllegalArgumentException("To determine the date of Easter, please enter " +
                    "any year from 1900 to 2100.");
        }

        int a = y % 19;
        int b = y / 100;
        int c = y % 100;
        int d = b / 4;
        int e = b % 4;
        int g = (8 * b + 13) / 25;
        int h = (19 * a + b - d - g + 15) % 30;
        int j =  c / 4;
        int k =  c % 4;
        int m = (a + 11 * h) / 319;
        int r = (2 * e + 2 * j - k - h + m + 32) % 7;
        int n = (h - m + r + 90) / 25;
        int p = (h - m + r + n + 19) % 32;

        String month;
            if(n == 4){
                month = "April";
            } else {
                month = "March";
            }
        System.out.println(month + " " + p);
    }
}
