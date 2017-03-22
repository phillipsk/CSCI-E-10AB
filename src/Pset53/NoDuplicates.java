package Pset53;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10B Introduction to Computer Science Using Java II
 * Professor Dr. Henry Leitner
 * Teaching Assistant Brandon Tineo
 * Received help from Dharmendra Prasad
 *
 * @author Kevin Phillips
 * @since 3/20/17
 */

/*
Write a program that reads a text file of numbers of type int and outputs all the
numbers to another file, but without any duplicate numbers.

Assume the input file is already sorted from smallest first, to largest last. After the program is run, the new file
will contain all the numbers in the original file, but no number will appear more than once in the output file. The
numbers in the output file should also be sorted from smallest to largest.

Your program should obtain both file names from the “command line.” Be sure to print both the input and output
files you tested your program on.

Here is how your program output might appear when it is executed:

    java NoDuplicates input.txt output.txt
    ORIGINAL FILE: input.txt contains the values
    3
    4
    4
    4
    7
    11
    11

    OUTPUT FILE: output.txt contains the values
    3
    4
    7
    11
*/

public class NoDuplicates {

    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.err.println("Please pass the input and output file name as arguments.");
            System.exit(1);
        }

        String inputFileName = args[0];
        String outputFileName = args[1];

        Scanner sc = new Scanner(new File(inputFileName));
        System.out.println("ORIGINAL FILE: " + inputFileName + " contains the values");
        String previousNum = "A";
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println(num);
            if (!previousNum.equals(num + "")) {
                sb.append(num);
                sb.append("\n");
                previousNum = num + "";
            }
        }

        System.out.println("OUTPUT FILE: " + outputFileName + " contains the values");
        System.out.println(sb.toString());

        FileOutputStream fos = new FileOutputStream(new File(outputFileName));
        fos.write(sb.toString().getBytes());
        fos.close();
        sc.close();
    }
}
