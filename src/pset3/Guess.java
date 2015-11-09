package pset3;

import java.util.Scanner;

/**
 * csci-e-10ab
 *
 * @author Kevin Phillips
 * @since 11/9/15
 */
public class Guess {
    public static void main(String[] args){
        giveIntro();
        Scanner console = new Scanner(System.in);
//        while (!userInput.equals("c")){
        int guesses = 1;
        int binary_algo = 50;
        System.out.println("Is it " + binary_algo + "? (type s, b, or c): ");
        String userInput = console.nextLine();

        while (!userInput.equals("c")){
            System.out.println("Is it " + binary_algo + "? (type s, b, or c): ");
                while (userInput.equals("s")){
                    binary_algo= binary_algo/2;
                    System.out.println("Is it " + binary_algo + "? (type s, b, or c): ");
                }
        }

        System.out.println("I got it after making just " + guesses + " guesses.");
/*
        do {
            System.out.println("Is it " + binary_algo + "? (type s, b, or c): ");
        }while (!userInput.equals("c"));*/


/*        if (userInput.equals("c")){
            System.out.println("I got it after making just " + guesses + " guesses.");
        }else if (userInput.equals("s")){
            guesses++;
                System.out.println("Is it 25? (type s, b, or c): ");

            }*/
//            System.out.println("correct");

    }

    public static void giveIntro(){
        System.out.println("This program has you, the user, choose a number between 1 and " +
                "100. Then I, the computer, will try my best to guess it.\n\nIf I guess a number" +
                " that's SMALLER than the secret number, respond by typing the letter s. If I guess " +
                "a number that's BIGGER \nthan the secret number, respond by typing the letter b. And if " +
                "I guess CORRECTLY, respond by typing the letter c.\n");
    }
}