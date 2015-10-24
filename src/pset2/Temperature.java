package pset2;

import java.util.Scanner;

/**
 * csci-e-10ab
 * @author Kevin Phillips
 * @since 10/21/15
 */
public class Temperature {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("OK, mate, what's the temperature outside?");
        int user_INPUT = console.nextInt();

        temp_Sport(user_INPUT);
    }

    /**
     * This method evaluates user input via System.in console input generated in main method, and
     * depending on following logic, recommends suitable sports for the evaluated temp variable
     * @param temp  passes user_INPUT from main method against multiple if statements to determine the appropriate sport
     */
//    what does this method do?
    public static void temp_Sport(int temp){

        if (temp > 110 || temp < -20){
            throw new IllegalArgumentException("No sports will be played above 110 degrees nor below -20 degrees.");
        } else {
            System.out.println("Looks good for ...");
        }
        if (temp >= 75 && temp <= 110){
            System.out.println("swimming");
        }
        if(temp > 32 && temp <= 70){
            System.out.println("soccer");
        }
        if (temp > 60 && temp <= 85){
            System.out.println("tennis");
        }
        if (temp > 10 && temp <= 32){
            System.out.println("skiing");
        }
        if (temp >= -20 && temp <= 10)
        {
            System.out.println("checkers");
        }
    }
}