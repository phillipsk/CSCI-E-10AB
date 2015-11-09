package pset3;

import java.util.Scanner;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/2/2015
 */
public class Congress {
    public static void main(String[] args) {
        /*
        *   Representive
        * age >= 25
        * citizenship >= 7
        *  be an Inhabitant of that State in which he shall be chosen
        *  Senator
        * age => 30
        * citizenship => 9
        *  be an Inhabitant of that State in which he shall be chosen
        *  */
        System.out.println("CONGRESS ELIGIBILITY");
        Scanner console = new Scanner(System.in);
//        error checking needed**********************
        int input_age = getInt(console, "Enter age of candidate: ");
        int input_citizenship = getInt(console, "Enter years of U.S. citizenship: ");

        if (eligibleForHouse(input_age,input_citizenship) && eligibleForSenate(input_age,input_citizenship)){
            System.out.println("The candidate is eligible for election to both the House of\n" +
                    "Representatives and the Senate.");
        }else if (eligibleForHouse(input_age,input_citizenship) && !eligibleForSenate(input_age,input_citizenship)){
            System.out.println("The candidate is eligible for election to the House of\n" +
                    "Representatives but is NOT eligible for election to the\n" +
                    "Senate.");
        }else if (!eligibleForHouse(input_age,input_citizenship) && eligibleForSenate(input_age,input_citizenship)){
            System.out.println("The candidate is eligible for election to the Senate\n" +
                    "but is NOT eligible for election to the\n" +
                    "House of Representatives.");
        }else {
            System.out.println("The candidate is NOT eligible for election to either the\n" +
                    "House of Representatives or the Senate.");
        }
    }

//    Learned of this method through the Reges textbook
    public static int getInt(Scanner console, String prompt){
        System.out.print(prompt);
        while (!console.hasNextInt() && (console.nextInt() < 0)){
            console.next(); // discard non-integer values as we are looking for integers only
            System.out.println("Not an integer, Please try again.");
            System.out.print(prompt);
        }
        return console.nextInt();
    }

    public static boolean eligibleForHouse(int age, int lengthOfCitizenship){
        if (age >= 25 && lengthOfCitizenship >= 7){
            return true;
        }else {
            return false;
        }
    }

    public static boolean eligibleForSenate(int age, int lengthOfCitizenship){
        if (age >= 30 && lengthOfCitizenship >= 9){
            return true;
        }else {
            return false;
        }
    }
}
