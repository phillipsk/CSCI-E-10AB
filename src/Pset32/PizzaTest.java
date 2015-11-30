package Pset32;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/19/2015
 */
public class PizzaTest {
    /**
     * This method calls upon the Pizza class and constructs a new Pizza object through the Pizza constructor,
     * defined through several instance variables passed each of which respectively representing PizzaName,radius
     * of the Pizza as a whole, cost of the whole pizza, and total slices available per Pizza.
     *
     * The method further prints two statements depicting the Pizza Name, the associated area per slice, cost per
     * slice, and cost per square inch, varying according to the instance variables previously defined through the
     * Pizza constructor.
     */
    public static void main (String [] args) {
        Pizza myPizza = new Pizza("Pepperoni", 8, 10.50, 10);
        System.out.printf ("Your %s pizza has %.2f square inches " +
                        " per slice.\n", myPizza.getName(),
                myPizza.areaPerSlice() );

        System.out.printf ("One slice costs $%.2f, which comes to $%.3f per square inch.\n",
                myPizza.costPerSlice(),
                myPizza.costPerSquareInch() );

        System.out.println();

        myPizza = new Pizza("Pineapple & Pepper", 10, 11.95, 8);
        System.out.printf ("Your %s pizza has %.2f square inches " +
                        " per slice.\n", myPizza.getName(),
                myPizza.areaPerSlice() );

        System.out.printf ("One slice costs $%.2f, which comes to $%.3f per square inch.\n",
                myPizza.costPerSlice(),
                myPizza.costPerSquareInch() );
    }
}
