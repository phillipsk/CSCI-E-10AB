package Pset41;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10A Introduction to Computer Science Using Java I
 * Professor Dr. Henry Leitner
 * Teaching Assistant Mr. David Habermehl
 *
 * @author Kevin Phillips
 * @since 12/19/15
 */
public class BankAccountTest {
    public static void main(String[] args) {
        final int SIZE = 5;
//        BankAccount [][] accounts =  new BankAccount[26][];

        String [] names = {"John","Pirthu","Jan","Henry","Fred"};

        int n = 0;
        for (int i = 0; i < names.length; i++){
            char firstletter = names[i].toLowerCase().charAt(n);
            System.out.println(firstletter);
            n++;
        }
    }
}