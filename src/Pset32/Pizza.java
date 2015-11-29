package Pset32;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/19/2015
 */
public class Pizza {
//    instance variables
    private String PizzaName;
    private double radius;
    private double cost;
    private int  slices;

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
        return costPerSlice() / areaPerSlice();
    }
}
