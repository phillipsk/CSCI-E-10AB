package Pset32;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/24/2015
 */
public class Rational {

    public static void main(String[] args) {

    }


    // define instance variables
    //
    private int numerator;
    private int denominator;

    // define constructors
    //
    public Rational (int n, int d)
    {
        //Implement Euclid's Algorithm for GCD
        // so that the Rational number constructed will
        // be in "lowest terms"

        int a = n;
        int b = d;
        // here's the code for Euclid's Algorithm
        int remainder = a % b;
        while (remainder != 0)
        {
            a = b;
            b = remainder;
            remainder = a % b;
        }

        numerator = n / b;
        denominator = d / b;
    }

    public Rational (int n)
    {
        numerator = n;
        denominator = 1;
    }

    public Rational (Rational r)
    {
        numerator = r.numerator;
        denominator = r.denominator;
    }

    public Rational ()
    {
        numerator = 0;
        denominator = 1;
    }


    // now the instance methods!
    //
    public Rational mulRat (Rational multiplier)
    {
        int topPartAnswer = this.numerator * multiplier.numerator;
        int bottomPartAnswer = this.denominator * multiplier.denominator;
        return new Rational (topPartAnswer, bottomPartAnswer);
    }

    public Rational addRat (Rational addend)
    {
        int top = numerator * addend.denominator +
                denominator * addend.numerator;
        int bottom = denominator * addend.denominator;
        return new Rational (top, bottom);
    }

    public String toString ()
    {
        return  numerator + " / " + denominator;
    }
}
