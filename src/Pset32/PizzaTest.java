package Pset32;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/19/2015
 */
public class PizzaTest {
    public static void main (String [] args) {
        Pizza myPizza = new Pizza("Pepperoni", 8, 10.50, 10);
        System.out.printf ("Your %s pizza has %.2f square inches " +
                        " per slice.\n", myPizza.getName(),
                myPizza.areaPerSlice() );

        System.out.printf ("One slice costs $%.2f, which comes to $%.3f per square inch.\n",
                myPizza.costPerSlice(),
                myPizza.costPerSquareInch() );

        System.out.println("Your Pepperoni pizza has 20.11 square inches per slice.\n" +
                "One slice costs $1.05, which comes to $0.052 per square inch.");
        System.out.println();

        myPizza = new Pizza("Pineapple & Pepper", 10, 11.95, 8);
        System.out.printf ("Your %s pizza has %.2f square inches " +
                        " per slice.\n", myPizza.getName(),
                myPizza.areaPerSlice() );

        System.out.printf ("One slice costs $%.2f, which comes to $%.3f per square inch.\n",
                myPizza.costPerSlice(),
                myPizza.costPerSquareInch() );

        System.out.println("Your Pineapple & Pepper pizza has 39.27 square inches per slice.\n" +
                "One slice costs $1.49, which comes to $0.038 per square inch.");
    }

}
