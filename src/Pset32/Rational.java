package Pset32;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/24/2015
 */
public class Rational {

    /**
     * instance variables defined as integers numerator and denominator
     */
    private int numerator;
    private int denominator;

    /**
     * The Rational constructor evaluates the GCD of each numerator / denominator fraction and returns a
     * fraction in lowest terms.
     *
     * @param n represent the numerator
     * @param d represents the denominator
     */
    public Rational (int n, int d)
    {
        // Implement Euclid's Algorithm for GCD
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
     * This boolean instance method evaluates two Rational objects, the first of which, the implicit parameter,
     * is assigned to the double variable, first_rational, while the second parameter, the explicit parameter
     * is assigned to the double variable, second_rational. If and only if the implicit parameter is less than
     * the explicit parameter, is a True value returned.
     *
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
