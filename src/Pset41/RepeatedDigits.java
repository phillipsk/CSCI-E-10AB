package Pset41;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10A Introduction to Computer Science Using Java I
 * Professor Dr. Henry Leitner
 * Teaching Assistant Mr. David Habermehl
 *
 * @author Kevin Phillips
 * @since 12/16/15
 */
public class RepeatedDigits {
    /**
     * This method accepts an integer argument as passed from main. The method proceeds to count the total sum value of
     * each integer present within the integer argument as a whole. The sum value of each digit between 0-9 is recorded
     * within the 'array_occurrences' integer array. The 'array_digits' stores the integers 0-9, sequentially and
     * literally as this array merely acts as a header when printed immediately before the 'array_occurrences' array.
     *
     * @param inputNumber   an integer argument as passed from main Scanner System.in class
     */
        public static void singleDigitIt(int inputNumber){
            if (inputNumber < 0){
                inputNumber = inputNumber * -1;
            }

            int array_digit[] = {0,1,2,3,4,5,6,7,8,9};
            int array_occurrences[] = new int[10];
            int counter0 = 1;
            int counter1 = 1;
            int counter2 = 1;
            int counter3 = 1;
            int counter4 = 1;
            int counter5 = 1;
            int counter6 = 1;
            int counter7 = 1;
            int counter8 = 1;
            int counter9 = 1;

            String stringNumber = inputNumber + "";
            int sum = 0;
            for (int i = 0; i < stringNumber.length(); i++){
//                I learned of the parseInt method from the Integer class documentation
                int location = Integer.parseInt(String.valueOf(stringNumber.charAt(i)));

                switch (location){
                    case 0: array_occurrences[0] = counter0++;
                        break;
                    case 1: array_occurrences[1] = counter1++;
                        break;
                    case 2: array_occurrences[2] = counter2++;
                        break;
                    case 3: array_occurrences[3] = counter3++;
                        break;
                    case 4: array_occurrences[4] = counter4++;
                        break;
                    case 5: array_occurrences[5] = counter5++;
                        break;
                    case 6: array_occurrences[6] = counter6++;
                        break;
                    case 7: array_occurrences[7] = counter7++;
                        break;
                    case 8: array_occurrences[8] = counter8++;
                        break;
                    case 9: array_occurrences[9] = counter9++;
                        break;
                }
            }
            System.out.print("Digit:       ");
            for (int n:array_digit) System.out.printf("%3d    ", n);
            System.out.println("");
            System.out.print("Occurrences: ");
            for (int n:array_occurrences) System.out.printf("%3d    ", n);
        }

    /**
     * This program accepts a user provided integer from the Scanner System.in class. The program proceeds to pass the
     * user inputted integer to the method singleDigitIt
     */
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            System.out.println("Please enter an integer: ");

            int number = console.nextInt();
//            int number = 3456353;

            System.out.println(number);
            System.out.println("");
            singleDigitIt(number);
            }
        }
