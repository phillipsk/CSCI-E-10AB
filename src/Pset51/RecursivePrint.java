package Pset51;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10B Introduction to Computer Science Using Java II
 * Professor Dr. Henry Leitner
 * Teaching Assistant Brandon Tineo
 * Received help from Codementor.io Dharmendra Prasad
 *
 * @author Kevin Phillips
 * @since 2/13/17
 */

/*
Define a recursive method named printNumber (int n) that takes a
single integer argument, n, and prints the value of n using standard English
words. You can assume n is less than one million.

For example, printNumber (143) should produce the output
one hundred forty three

whereas printNumber (-24549) should produce the output
minus twenty four thousand five hundred forty nine

*/
public class RecursivePrint {

    public static void printNumber(int n) {
        if (n == 0) {
            System.out.print("zero");
            return;
        }

        if (n < 0) {
            System.out.print("minus ");
            n = Math.abs(n);
        }

        // single digit other than 0
        if (n > 0 && n < 20) {
            printDigit(n);
            return;
        }

        if (n > 99999) { // is hundred thousand or more
            int quant = n/100000;
            printDigit(quant);
            System.out.print("hundred ");

            int remainder = n%100000;
            if (remainder == 0) {
                System.out.print("thousand ");
                return;
            } else if (remainder < 1000) {
                System.out.print("thousand ");
            }
            printNumber(n%100000);
            return;
        }

        int div = 1;
        if (n > 999) {
            div = 1000;
        } else if (n > 99) {
            div = 100;
        }

        int quant = n/div;
        if (quant == 0) {
            return;
        }
        if (quant > 19) {
            switch (quant/10) {
                case 2:
                    System.out.print("twenty ");
                    break;
                case 3:
                    System.out.print("thirty ");
                    break;
                case 4:
                    System.out.print("forty ");
                    break;
                case 5:
                    System.out.print("fifty ");
                    break;
                case 6:
                    System.out.print("sixty ");
                    break;
                case 7:
                    System.out.print("seventy ");
                    break;
                case 8:
                    System.out.print("eighty ");
                    break;
                case 9:
                    System.out.print("ninety ");
                    break;
            }
            quant = quant%10;
            printDigit(quant);
        } else {
            printDigit(quant);
        }

        switch (div) {
            case 1000:
                System.out.print("thousand ");
                break;
            case 100:
                System.out.print("hundred ");
                break;
        }

        int remainder = n % div;
        if (div != 1 && remainder != 0) {
            printNumber(remainder);
        }
    }

    /*
     * Helper method to print the number into text
    */
    private static void printDigit(int n) {
        switch (n) {
            case 1:
                System.out.print("one ");
                break;
            case 2:
                System.out.print("two ");
                break;
            case 3:
                System.out.print("three ");
                break;
            case 4:
                System.out.print("four ");
                break;
            case 5:
                System.out.print("five ");
                break;
            case 6:
                System.out.print("six ");
                break;
            case 7:
                System.out.print("seven ");
                break;
            case 8:
                System.out.print("eight ");
                break;
            case 9:
                System.out.print("nine ");
                break;
            case 10:
                System.out.print("ten ");
                break;
            case 11:
                System.out.print("eleven ");
                break;
            case 12:
                System.out.print("twelve ");
                break;
            case 13:
                System.out.print("thirteen ");
                break;
            case 14:
                System.out.print("fourteen ");
                break;
            case 15:
                System.out.print("fifteen ");
                break;
            case 16:
                System.out.print("sixteen ");
                break;
            case 17:
                System.out.print("seventeen ");
                break;
            case 18:
                System.out.print("eighteen ");
                break;
            case 19:
                System.out.print("nineteen ");
                break;
        }
    }

    public static void main(String[] args) {
        int A = 900101;
        System.out.println(A);
        printNumber(A);
        System.out.println();
        System.out.println();

        int B = -900101;
        System.out.println(B);
        printNumber(B);
        System.out.println();
        System.out.println();

        int C = 0;
        System.out.println(C);
        printNumber(C);
    }
}
