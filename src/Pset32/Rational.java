package Pset32;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/24/2015
 */
public class Rational {

    public static void main(String[] args) {
        Rational a2 = new Rational (8, 16);
        Rational b2 = new Rational (2, 3);
        a2.lessThanRat(b2);
            System.out.println(a2.lessThanRat(b2));

        Rational a = new Rational(9,12);
        Rational b = new Rational(6);
        Rational c = new Rational(a);
        Rational d = a; // d is not a copy of a
        System.out.println("a = " + a + " and b = " + b);
        System.out.println("c = " + c);
        c = a.addRat(b);
        System.out.println("c = " + c + " and a = " + a);
        a = b.mulRat(c);
        System.out.println("a = " + a + " and d = " + d);
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

    public String lessThanRat(Rational explicit_Rational){
        double first_rational = this.numerator / this.denominator;
        double second_rational = explicit_Rational.numerator / explicit_Rational.denominator;
        if (first_rational < second_rational){
            return "The first rational number is less than the second rational number.";
        }else if (first_rational == second_rational){
            return "These rational numbers equal each other!";
        }else {
            return "The second rational number is greater than the first rational number.";
        }
    }
}
