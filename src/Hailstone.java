import java.util.Scanner;

/**
* Copied from http://stackoverflow.com/questions/22736087/hailstone-sequence-java
* So I have this problem that was assigned to me where you have write a program that asks for a starting integer and an ending integer and returns the length of the longest hailstone sequence, the number between the start and the end where it occurs, and the actual sequence.
* I figured out most of it, but I was stuck on printing out the actual largest sequence. If anyone could please help me on this, it would really help. Thank you!
*/
public class Hailstone {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first, last, counter = -500, highestSequence = 0, highestNumber = 0, number = 0, sequence = 0;

        System.out.println("First candidate?");
        first = scan.nextInt();

        System.out.println("Last candidate?");
        last = scan.nextInt();

        for (int x = first; x <= last; x++) {
            number = x;
            counter = 1;

            while (number != 1) {
                if (number % 2 == 0) //even
                {
                    number = number / 2;
                } else //odd
                {
                    number = number * 3 + 1;
                }

                counter++; //counts sequence
            }
            if (counter > highestSequence) {
                highestSequence = counter;
                highestNumber = x;
                sequence = number;
            }

        }
        System.out.println("longest sequence of " + highestSequence + " occurs at " + highestNumber);

    }


/*   Attempted answer

        public int checkSequence(int x, boolean print) {
        int number = x;
        while (number != 1) {
            if (print) {
                System.out.print(number + " ");
            }
            if (number % 2 == 0) //even
            {
                number = number / 2;
            } else //odd
            {
                number = number * 3 + 1;
            }

            counter++; //counts sequence
        }
        return counter;
    }*/
}