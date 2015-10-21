package pset2;

import java.util.Scanner;

/**
 * @author Kevin Phillips
 * @since 10/21/15
 * csci-e-10ab
 */
public class Matryoshka {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter 20 doll sizes: ");
        int a = 0;
        int sets = 0;
        int counter = 0;
        int max_counter = 0;
        for (int i = 1; i <= 20; i++){
            System.out.println("Next doll size: ");
            int user_INPUT = console.nextInt();
            if (a <= user_INPUT){
                if (sets == 0){
                    System.out.println("\t-- new set started ");
                }
                sets++;
                counter++;
                if (max_counter < counter){
                    max_counter = counter;
                }
                a = user_INPUT;
            } else {
//                i = console.nextInt();
//                System.out.println("Next doll size: " + i);
//                System.out.printf("%8d   -- new set started;");
                System.out.println("\t-- new set started ");
                a = user_INPUT;
                counter = 0;
            }
//            max_counter = counter;
        }
        System.out.println("There are " + sets + " sets in all.");
        System.out.println("The largest set has " + max_counter + " dolls.");
    }
}