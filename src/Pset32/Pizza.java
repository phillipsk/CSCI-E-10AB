package Pset32;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/19/2015
 */
public class Pizza {
    /**
     * instance variables
     */
    private String PizzaName;
    private double radius;
    private double cost;
    private int  slices;

    /**
     * The Pizza constructor
     * @param a assigned to String value PizzaName
     * @param b assigned to double value radius
     * @param c assigned to double value cost
     * @param d assigned to integer value slices
     */
    Pizza(String a, double b, double c, int d){
        PizzaName = a;
        radius = b;
        cost = c;
        slices = d;
    }

    /**
     * This instance method returns the 'type' or flavor of Pizza ordered, represented through the instance
     * variable PizzaName.
     *
     * @return name of pizza
     */
    public String getName(){
        return PizzaName;
    }

    /**
     * This instance method evaluates the area per slice of a Pizza by computing the circumference
     * divided by the number of slices.
     *
     * @return area per slice, which is instance variable radius squared then multiplied by the vale of Math.PI
     * and then divided by the number of slices represented through the slices instance variable.
     */
    public double areaPerSlice(){
        return (Math.PI*radius*radius) / slices;
    }

    /**
     * This instance method calculates the cost per slice by deriving the total cost from Pizza class instance
     * variable cost divided by Pizza class instance variable slices.
     *
     * @return cost per slice
     */
    public double costPerSlice(){
        return cost / slices;
    }

    /**
     * This instance method calculates the cost per square inch by calling on costPerSlice instance method and
     * dividing by the areaPerSlice instance method.
     *
     * @return cost per square inch
     */
    public double costPerSquareInch(){
        return costPerSlice() / areaPerSlice();
    }
}
