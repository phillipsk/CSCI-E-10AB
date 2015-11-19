package Pset32;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/16/2015
 */
public class Nov16 {   public static void main (String [] args) {
    Dog fido =  new Dog ();   // constructs a new Dog
    fido.weight = 32;
    fido.speak();

    Dog rover = new Dog ();   // constructs a new Dog
    rover.weight = 17;
    rover.speak();

    Movie martian = new Movie (10, 8, 5);
    //  martian.script = 5;
    //   martian.directing = 8;

    martian.acting = 22;



    System.out.println ("Martian's overall rating = "  +  martian.rating() );

    Movie steveJobs = new Movie (8, 9, 10);
    System.out.println ("Steve Jobs' overall rating = "  +  steveJobs.rating() );

    Movie theSocialNetwork = new Movie ();
    System.out.println ("The Social Network's overall rating = "
            +  theSocialNetwork.rating());


    }
}
