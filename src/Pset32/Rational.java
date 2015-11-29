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
//        a2.lessThanRat(b2);
        System.out.println("a = " + a2 + " \nand \nb = " + b2);
        System.out.println(a2.lessThanRat(b2));

        System.out.println();
        Rational foo = new Rational(5, 17);
        Rational bar = new Rational(6, 19);
        System.out.println("a = " + foo + " \nand \nb = " + bar);
        System.out.println(foo.lessThanRat(bar));

        boolean result = foo.lessThanRat(bar);

        System.out.println();
        boolean rr_result = new Rational( 3, 8).lessThanRat(new Rational(7, 16));
        System.out.println(rr_result);
        boolean r1 = new Rational( 3, 8).lessThanRat(new Rational(7, 16)); //  is true
        boolean r2 = new Rational(-3,-8).lessThanRat(new Rational(7, 16)); //  is true
        boolean r3 = new Rational( 3, 8).lessThanRat(new Rational(7,-16)); //  is false
        boolean r4 = new  Rational(-3, 8).lessThanRat(new Rational(7,-16)); //  is false
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);


/*          // Examples outlined in Lecture
        Rational a = new Rational(9,12);
        Rational b = new Rational(6);
        Rational c = new Rational(a);
        Rational d = a; // d is not a copy of a
        System.out.println("a = " + a + " and b = " + b);
        System.out.println("c = " + c);
        c = a.addRat(b);
        System.out.println("c = " + c + " and a = " + a);
        a = b.mulRat(c);
        System.out.println("a = " + a + " and d = " + d);*/
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

    /**
     * @param explicit_Rational Literally, explicit parameter passed once method is called, parameter
     *                          of the Rational form, as defined in the Rational class
     * @return  true if the implicit Rational number is greater than or equal to the explicit Rational
     * parameter
     */
    public boolean lessThanRat(Rational explicit_Rational){
        double first_rational = (double) this.numerator / this.denominator;
        double second_rational = (double) explicit_Rational.numerator / explicit_Rational.denominator;
        if (first_rational < second_rational){
            return true;
        }else if (first_rational == second_rational){
            return false;
        }else {
            return false;
        }
    }
}
