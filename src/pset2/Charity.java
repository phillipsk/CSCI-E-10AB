package pset2;

import java.util.Scanner;

/**
 * Created by Kevin Phillips on 10/7/15.
 */
public class Charity {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the amount of a contribution:  ");
        double contribution = console.nextDouble();
    }

    /*  $10k or greater     = Benefactor
    *   $1k <> $9,999.99    = Patrons
    *   $500 <> $999.99     = Supporters
    *   $100 <> $499.99     = Friends
    *   < $100              = Cheapskates
    *
    *   The donor method evaluates each donor's contribution and returns one of the above designations.
    *   This method passes the contribution value defined in the main method through the user's input
     *   as a double variable defined as donation. */
    public static void donor(double donation){
//        double benefactor = $10,000.000
        if (donation >= 10000.00){
            System.out.println("Benefactor");
            }
        else if(donation >= 1000.00 && donation <= 9999.99){
        }
    }
}
