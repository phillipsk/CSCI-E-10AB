package pset2;

//  MoneyChanger.java

import java.util.*;

class MoneyChanger
{
    static void makeChange(double amount)
    {
        //  get input
        // Scanner in = new Scanner(System.in);
        // System.out.print( "Enter the amount for change:  " );
        // double amount = in.nextDouble();

        //  make change - convert amount to cents
        int amt = (int)(amount * 100);
        int dollars = amt / 100;

        amt = amt % 100;   //  or amt %= 100;
        int quarters = amt / 25;

        amt %= 25;
        int dimes = amt / 10;

        amt %= 10;
        int nickels = amt / 5;
        int pennies = amt % 5;

        System.out.println( "To make change for " + amount +
                ", give back:\n" +
                "\t" + dollars + " dollars\n" +
                "\t" + quarters + " quarters\n" +
                "\t" + dimes + " dimes\n" +
                "\t" + nickels + " nickels\n" +
                "\t" + pennies + " pennies." );
    }

    public static void main( String [] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.print( "Enter the amount for change: $ " );
        double amt = in.nextDouble();
        makeChange(amt );

        System.out.print( "Enter another amount:  $ " );
        amt = in.nextDouble();
        makeChange( amt );

    }
}