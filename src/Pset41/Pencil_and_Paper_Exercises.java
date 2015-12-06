package Pset41;

import java.util.Arrays;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10A Introduction to Computer Science Using Java I
 * Professor Dr. Henry Leitner
 * Teaching Assistant Mr. David Habermehl
 *
 * @author Kevin Phillips
 * @since 12/2/15
 */
public class Pencil_and_Paper_Exercises {
    public static void main(String[] args) {
        boolean answers[] = new boolean[20];
        double avg_family_szie[] = new double[110];
        double avg_rainfaill_5_years[][] = new double[12][5];

        final int SIZE = 5;
//        int sample[] = new int[SIZE];
/*            for (int i = 0; i < sample.length; i++){
                sample[i] = 5;
            }*/

        int[] sample = {2, -4 , 6 ,3 ,-12};
        System.out.println(Arrays.toString(sample));
//        swap(sample, 0, sample.length-1);
        for (int i = 0; i < sample.length; i++){
/*            if (sample[i] < 0){
                sample[i] = sample[i]* -1;
            }*/
            if (sample[i] % 2 != 0){
                System.out.print(i);
            }
        }
        System.out.println();

/*        for (int i = 0; i < sample.length / 2; i++){
            int j = sample.length -i - 1;
        }*/
        System.out.println(Arrays.toString(sample));


        System.out.println("");

        // This is the answer to part Question 1 part D below:

//        public class Candidate {
//            private String name;
//            private int votes;
//            String candidates[] = new String[8];
//        }

        /*
        * class Foobar
{
    public static void main (String [] args)
    {
//        1 properly define array
        int r[] = new int[20];
//        5 The Question asks for an array of INTEGER values, changed Math.Random() class to new Random object,
//        previously tried to type cast the Math.Random() class into an integer but found allow resulting values
//        rounded down
        Random rand_num = new Random();

//        2 Not a method call, differences among object and array methods
//        3 Modified for loop continuation parameter to be less than array length, which keeps array index in bound
        for (int i = 0; i < r.length; i++)
//            4 appropriately call the random() method of the Math class

//            5 The Question asks for an array of INTEGER values
            r[i] = rand_num.nextInt();
    }
}*/
            System.out.println(digitSum(3456));

    }

    public static void swap(int [] list, int i, int j){
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    static int digitSum (int n)
    {
        if ( n < 10) { return n;
        }
        else return n;
    }
}