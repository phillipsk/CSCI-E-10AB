package pset2;

import java.util.Scanner;

/**
 * @author Kevin Phillips
 * @since 10/12/2015
 * CSCI-E-10a
 * Unit 22 HW
 */
public class Powers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter the maximum power: ");
//        printPowersOf2(console.nextInt());
        printPowersOf2(10);
    }

/*    This method calculates the powers of 2 up until the nth power, with nth represented by a user input passed
        through main*/
    public static void printPowersOf2(int inputPower){

        int number = 1;
        System.out.print("1 ");
/*        for (int i = 1; i <= inputPower; i++){
            number=number*2;
            System.out.print(number + " ");
        }*/

        int next = 0;
        int sum = 0;
        for (int i = 1; i <= inputPower; i++){
            for (int j = 0; j <= i; j++){
                for (int k = 2; k <= j; k = k+2){
                    next = number + i;
                    sum += next;

                }
                System.out.print(sum + " ");
            }
        }
//        System.out.print(sum + " ");
    }
}
