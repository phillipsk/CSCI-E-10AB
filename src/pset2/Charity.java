package pset2;

import java.util.Scanner;

/**
 * csci-e-10ab
 * @author Kevin Phillips
 * @since 10/21/15
 */
public class Charity {
    /** Main accepts user input through the contribution parameter.1
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the amount of a contribution:  ");
        double contribution = console.nextDouble();
        System.out.println("You are designated in the group: ");
        donor(contribution);
    }

    /**
     *   The donor method evaluates each donor's contribution and returns one of the above designations.
     *   This method passes the contribution value defined in the main method through the user's input
     *   as a double variable defined as donation.
     *
     * @param donation  accepts user input from main method via System.in input defined as double
     *                  variable 'contribution.'
     *
     * @throws IllegalArgumentException       An illegal exception is thrown if a negative value attempts
     *                  to assign to the donation parameter.
     */
    public static void donor(double donation){
    /*
     *   $10k or greater     = Benefactor
     *   $1k <> $9,999.99    = Patrons
     *   $500 <> $999.99     = Supporters
     *   $100 <> $499.99     = Friends
     *   < $100              = Cheapskates
     */
        if (donation >= 10000.00){
            System.out.println("Benefactor");
            }
        else if(donation >= 1000.00 && donation <= 9999.99){
            System.out.println("Patrons");
        }
        else if(donation >= 500.00 && donation <= 999.99){
            System.out.println("Supporters");
        }
        else if (donation >= 100.00 && donation <= 499.99){
            System.out.println("Friends");
        }
        else if(donation >= 0 && donation <= 99.99){
            System.out.println("Cheapskates");
        }
        else {
            throw new IllegalArgumentException("Negative donations are illogical and unaccepted, please enter" +
                    " a positive amount.");
        }
    }
}
