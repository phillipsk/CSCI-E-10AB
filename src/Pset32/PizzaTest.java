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

/*    package Pset32;

    *//**
     * csci-e-10ab
     *
     * @author Kevin Phillips
     * @since 11/19/2015
     *//*
    public class Pizza {
        //    instance variables
        public String PizzaName;
        public double radius;
        public double cost;
        public int  slices;

        //    constructor
        Pizza(String a, double b, double c, int d){
            PizzaName = a;
            radius = b;
            cost = c;
            slices = d;
        }

        public String getName(){
//        PizzaName = s;
            return PizzaName;
        }

        public double areaPerSlice(){
//        radius = 8;
//        slices = n_slices;
            return (Math.PI*radius*radius) / (double) slices;
        }

        public double costPerSlice(){
            return cost / slices;
        }

        public double costPerSquareInch(){
            return cost / areaPerSlice();
        }
    }*/


}
