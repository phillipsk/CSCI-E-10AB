package Pset32;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/19/15
 */
public class Pet {

//    3 instance variables
    public String name;
    public int age;
    public double weight;

//    2 constructors
    Pet(String a, int b, double c){
        name = a;
        age = b;
        weight = c;
    }

    Pet(String a, int b){
        name = a;
        age = b;
    }

    public static void main(String[] args) {
        Pet myDog = new Pet("Fido", 9, 29.5);
        Pet myParrot = new Pet("Polly", 32, 2.85);
        Pet myCat = new Pet("Tiger", 4);
    }
}