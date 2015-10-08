package pset2;

import java.text.DateFormatSymbols;
import java.util.Scanner;

/**
 * Created by Kevin Phillips on 10/7/2015
 * Following Reges, Stuart, and Martin Stepp. Building Java Programs: A Back to Basics Approach. 3rd Edition.
 */
public class Easter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("In which year would you like to view the weekday of Easter?");
        System.out.println("Please enter the year: ");
        int year = console.nextInt();

        computeEaster(year);
    }

/*    This method computers the day of the week Easter falls courtesy of mathematician Carl Friedrich Gauss
      developed in 1800*/
    public static void computeEaster(int y){
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

        System.out.println("Easter falls on the " + p + " of " + n);
        /* Initially initialized variables as type double, subsequently debugged
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(g);*/
    }
}
