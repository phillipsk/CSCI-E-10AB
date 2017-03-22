package Pset53;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10B Introduction to Computer Science Using Java II
 * Professor Dr. Henry Leitner
 * Teaching Assistant Brandon Tineo
 * Received help from Dharmendra Prasad
 *
 * @author Kevin Phillips
 * @since 3/19/17
 */

/*
A large number of student responses to questions on a multiple-choice examination are to be processed by a program
that you will write. The input to your program will consist of:
⇒ the correct answers to the exam questions;
⇒ the actual student responses (assume that there can be no more than 100 students).
⇒ the responses are contained in a file; we will supply a sample file for you to use.

Note that for every exam question there are precisely 6 possible answers: A, B, C, D, E and blank. The last case is
to allow the possibility of a student not responding at all to a question.
Since the student answers are to be read in from a file, you should “echo” the data on to the computer display screen
as it is being read. You should assume that the user of your program knows nothing about how computers work, so your
program needs to be friendly and easy to operate.

The output from your program will consist of
⇒ a complete listing of the students' scores (the number of correct answers, incorrect answers, and blank answers);
these may be given by student number (as illustrated below).
⇒ a second listing, like the one shown below, which illustrates how the group as a whole answered each
question on the examination.

Here is how the output from your program should appear when executed:

I hope you are ready to begin ...
Please type the correct answers to the exam questions,
one right after the other: ABCEDBACED
What is the name of the file containing each student's
responses to the 10 questions? ~cscie10/unit5/assign/exams.dat

Student #1's responses: ABDEBBAC D
Student #2's responses: ABCE CACED
Student #3's responses: DCE AEDC
Student #4's responses: ABCEB ACED
Student #5's responses: BBCEDBACED
Student #6's responses: DBCE CACED
Student #7's responses: ABCE CA E (note the space after the final E) Student #8's responses: BBE CACED

       Student #9's responses:  ABCEDBACED
       We have reached “end of file!”
       Thank you for the data on 9 students.  Here's the analysis:
    Student #        Correct        Incorrect       Blank
    ~~~~~~~~~        ~~~~~~~        ~~~~~~~~~       ~~~~~
1721 2811 ............
... ... ... { the whole table should be filled in} ............
9 10 0 0
    QUESTION ANALYSIS   (* marks the correct response)
    ~~~~~~~~~~~~~~~~~
Question #1:
A* B C D E Blank 421101
     44.4%    22.2%   11.1%   11.1%    0.0%    11.1%
Question #2:
       A        B*      C       D       E       Blank
       ...
       ...
       ... etc. Again, be sure to fill in the entire table for all 10 questions.

Be sure to test your program out on the sample data provided above which corresponds to an exam having
10 multiple-choice questions with just 9 students taking the exam. But remember — your program should be
general enough that it would work with an exam having any number (up to 100) different multiple- choice questions
and with up to 100 different students taking the exam.

You may wish to copy the sample student answers to the nine questions from the file exams.dat into your own directory.
You can find this file in the unit5/assign folder which is linked to from the “Lecture Examples”
page on our course website.

*/

public class ExamAnalysis {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("I hope you are ready to begin ...");
        System.out.println("Please type the correct answers to the exam questions, one right after the other:");
        String correctAnswers = keyboard.nextLine();
        int numberOfQuestions = correctAnswers.length();
        System.out.println();
        System.out.println("What is the name of the file containing each student's responses to the questions? ");

        String fileName = keyboard.nextLine();
        Scanner fileReader = new Scanner(new File(fileName));
        List<Integer> correctList = new ArrayList<Integer>();
        List<Integer> inCorrectList = new ArrayList<Integer>();
        List<Integer> blankList = new ArrayList<Integer>();
        int numberOfStudentResponses = 0;

        int[][] questionAnalysis = new int[numberOfQuestions][correctAnswers.length()];

        while (fileReader.hasNextLine()) {
            String response = fileReader.nextLine();
            System.out.println("Student #" + (numberOfStudentResponses + 1) + "'s responses: " + response);
            int correct = 0;
            int inCorrect = 0;
            int blank = 0;
            for (int i = 0; i < correctAnswers.length(); i++) {
                if (i < response.length()) {

                    // question analysis
                    switch (response.charAt(i)) {
                        case 'A':
                            questionAnalysis[i][0]++;
                            break;
                        case 'B':
                            questionAnalysis[i][1]++;
                            break;
                        case 'C':
                            questionAnalysis[i][2]++;
                            break;
                        case 'D':
                            questionAnalysis[i][3]++;
                            break;
                        case 'E':
                            questionAnalysis[i][4]++;
                            break;
                        default:
                            break;
                    }

                    if (response.charAt(i) == ' ') {
                        questionAnalysis[i][5]++;
                        blank++;
                    } else if (correctAnswers.charAt(i) == response.charAt(i)) {
                        correct++;
                    } else {
                        inCorrect++;
                    }
                } else {
                    questionAnalysis[i][5]++;
                    blank++;
                }
            }

            correctList.add(numberOfStudentResponses, correct);
            inCorrectList.add(numberOfStudentResponses, inCorrect);
            blankList.add(numberOfStudentResponses, blank);
            numberOfStudentResponses++;
        }

        fileReader.close();
        keyboard.close();

        System.out.println("We have reached \"end of the file!\"");
        System.out.println();
        System.out.println("Thank you for the data of " + numberOfStudentResponses + " students. Here's the analysis:");
        System.out.println("Student #        Correct        Incorrect        Blank");
        System.out.println("---------        -------        ---------        -----");
        for (int i = 0; i < numberOfStudentResponses; i++) {
            System.out.println(String.format("%7d %13d %15d %15d", (i + 1), correctList.get(i), inCorrectList.get(i),
                    blankList.get(i)));
        }

        System.out.println();
        System.out.println("QUESTION ANALYSIS (* marks the correct response");
        System.out.println("-----------------");

        for (int i = 0; i < numberOfQuestions; i++) {
            char answer = correctAnswers.charAt(i);
            System.out.println("\nQUESTION #" + (i + 1) + ":");
            switch (answer) {
                case 'A':
                    System.out.print("A*           B            C            D            E            Blank");
                    break;
                case 'B':
                    System.out.print("A            B*           C            D            E            Blank");
                    break;
                case 'C':
                    System.out.print("A            B            C*           D            E            Blank");
                    break;
                case 'D':
                    System.out.print("A            B            C            D*           E            Blank");
                    break;
                case 'E':
                    System.out.print("A            B            C            D            E*           Blank");
                    break;
                default:
                    break;
            }
            System.out.println();
            System.out.println(String.format("%d%13d%13d%13d%13d%13d", questionAnalysis[i][0], questionAnalysis[i][1],
                    questionAnalysis[i][2], questionAnalysis[i][3], questionAnalysis[i][4], questionAnalysis[i][5]));
            int totalAnswers = numberOfQuestions - questionAnalysis[i][5];

            System.out.println(String.format("%.1f%s %10.1f%s %11.1f%s %12.1f%s %11.1f%s %11.1f%s",
                    (100 * questionAnalysis[i][0] / (float) totalAnswers), "%",
                    (100 * questionAnalysis[i][1] / (float) totalAnswers), "%",
                    (100 * questionAnalysis[i][2] / (float) totalAnswers), "%",
                    (100 * questionAnalysis[i][3] / (float) totalAnswers), "%",
                    (100 * questionAnalysis[i][4] / (float) totalAnswers), "%",
                    (100 * questionAnalysis[i][5] / (float) totalAnswers), "%"));
            System.out.println("\n\n");

        }

    }

}
