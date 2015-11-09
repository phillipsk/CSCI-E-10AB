package pset3;

import java.util.Scanner;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/2/2015
 */
public class Congress {
    /**
     * This program calls upon the getInt(); input validation method and the boolean methods, eligibleForHouse
     * and eligibleForSenate which evaluate the legal returned integers from getInt according the to House and Senate
     * prerequisites outlined below. The main method evaluates the returned boolean values from these two methods
     * according the below criteria and as such prints an acceptable response indicting whether a candidate is eligible
     * to serve in the House or Senate, both or neither.
     *
     * A Representative is defined as follows:
     * age >= 25
     * citizenship >= 7
     * and be an Inhabitant of that State in which he shall be chosen.
     *
     * A Senator is defined as follows:
     * age => 30
     * citizenship => 9
     * and be an Inhabitant of that State in which he shall be chosen
     */
    public static void main(String[] args) {
        System.out.println("CONGRESS ELIGIBILITY");
        Scanner console = new Scanner(System.in);

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

    /**
     * I learned of this method through the Reges textbook. This method evaluates user input to ensure the
     * user's input is of a legal integer data type.
     *
     * @param console   receives the Scanner class System.In constructor
     * @param prompt    receives the user's defined string message prompted before integer input and when integer
     *                  input is not received, in the case of integer/input validation.
     * @return  A legal integer data type.
     */
    public static int getInt(Scanner console, String prompt){
        System.out.print(prompt);
        while (!console.hasNextInt()){ //&& (console.nextInt() < 0)){
            console.next(); // discard non-integer values as we are looking for integers only
            System.out.println("Not an integer, Please try again.");
            System.out.print(prompt);
        }
        return console.nextInt();
    }
    /*
    * This method, according the House eligibility criteria above, returns true if the candidate's age and
    * citizenship are within the House's criteria tolerance.
    */
    public static boolean eligibleForHouse(int age, int lengthOfCitizenship){
        if (age >= 25 && lengthOfCitizenship >= 7){
            return true;
        }else {
            return false;
        }
    }
    /*
    * This method, according the Senate eligibility criteria above, returns true if the candidate's age and
    * citizenship are within the Senate's criteria tolerance.
    */
    public static boolean eligibleForSenate(int age, int lengthOfCitizenship){
        if (age >= 30 && lengthOfCitizenship >= 9){
            return true;
        }else {
            return false;
        }
    }
}
