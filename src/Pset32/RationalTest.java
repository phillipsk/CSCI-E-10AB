package Pset32;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/29/15
 */
public class RationalTest {
    /**
     * This method calls on the Rational class to arithmetically evaluate an implicit parameter against
     * the explicit parameter. If the implicit argument is less then the explicit, a boolean True value is
     * returned.
     */
    public static void main(String[] args) {
        Rational a1 = new Rational (8, 16);
        Rational b1 = new Rational (8, 16);
        System.out.println("a = " + a1 + " \nand \nb = " + b1);
        System.out.println(a1.lessThanRat(b1));

        Rational a2 = new Rational (8, 16);
        Rational b2 = new Rational (2, 3);
        System.out.println("a = " + a2 + " \nand \nb = " + b2);
        System.out.println(a2.lessThanRat(b2));

        System.out.println();
        Rational foo = new Rational(5, 17);
        Rational bar = new Rational(6, 19);
        System.out.println("a = " + foo + " \nand \nb = " + bar);
        System.out.println(foo.lessThanRat(bar));

        System.out.println();
        boolean result = foo.lessThanRat(bar);
        System.out.println("boolean result = foo.lessThanRat(bar);");
        System.out.println(result);

        System.out.println();
        boolean r1 = new Rational( 3, 8).lessThanRat(new Rational(7, 16)); //  is true
        boolean r2 = new Rational(-3,-8).lessThanRat(new Rational(7, 16)); //  is true
        boolean r3 = new Rational( 3, 8).lessThanRat(new Rational(7,-16)); //  is false
        boolean r4 = new  Rational(-3, 8).lessThanRat(new Rational(7,-16)); //  is false
        System.out.println("boolean r1 = new Rational( 3, 8).lessThanRat(new Rational(7, 16));");
        System.out.println("r1 = " + r1);
        System.out.println("boolean r2 = new Rational(-3,-8).lessThanRat(new Rational(7, 16));");
        System.out.println("r2 = " + r2);
        System.out.println("boolean r3 = new Rational( 3, 8).lessThanRat(new Rational(7,-16));");
        System.out.println("r3 = " + r3);
        System.out.println("boolean r4 = new  Rational(-3, 8).lessThanRat(new Rational(7,-16));");
        System.out.println("r4 = " + r4);
    }
}