package pset3;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 10/31/15
 */
public class Oct26b {
    public static void main (String [] args)
    {
        int heads = 0;
        int tails = 0;

        for (int i = 1; i <= 1000000; i++)
        {
            double r  = Math.random();
            System.out.println(r);
            if (r <= 0.5) heads++;
            else tails++;
        }
        System.out.println ("You flipped " + heads + " heads, and \n" +
                tails + " tails!");
    }
//practiving for Drunk.java hw problem
/*    public static int diceRoll(){
        int heads = 0;
        int tails = 0;
        do {
            double r  = Math.random();
            System.out.println(r);
            if (r <= 0.5) heads++;
            else tails++;
        }while ()
    }*/
}