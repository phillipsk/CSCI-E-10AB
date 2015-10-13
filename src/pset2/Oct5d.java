package pset2;

/**
 * @author Kevin Phillips
 * @since 10/12/15
 * csci-e-10ab
 */
public class Oct5d {

    public static void main (String [] args)
    {
        /* I am told there are a handful of 3-digit integers
          that are equal to the sum of the cube of their digits
         Find them, and print them */

        for (int n = 100; n <= 999; n++)
        {
            int h = n / 100;
            int u = n % 10;

            int t = (n % 100) / 10;

            if (h*h*h + t*t*t + u*u*u == n)
                System.out.println ("Here's one:  " + n);
        }

        //  Here's an alternative solution
        System.out.println ("Now an alternative solution:\n");
        for (int h = 1; h <= 9; h++)
        {
            for (int t = 0; t <= 9; t++)
            {
                for (int u = 0; u <=9; u++)
                {
                    int n = 100*h + 10*t + u;
                    if (h*h*h + t*t*t + u*u*u == n)
                        System.out.println ("Here's one:  " + n);
                }
            }
        }


    }
}