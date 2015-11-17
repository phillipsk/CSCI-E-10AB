package Pset32;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/16/2015
 */
public class Dog {
    // "instance variables" that define the state of the object
    String name;
    double weight;
    int age;
    boolean hungry;

    // "instance methods" define the behaviors
    void speak ()
    {
        if (weight > 20) System.out.println ("Woof!"); // ( (char) 7); // this references an audio sample
        else System.out.println ("aarf");
    }

}
