package Pset41;

import java.util.Arrays;

class Dec7
{
    public static void main (String [] args)
    {
       /* float [] [] payScaleTable = new float [4] [5];

        payScaleTable [0] [0] = 10.50f;
        payScaleTable [0] [1] = 12.00f;
       */


        float [] [] payScaleTable = {
                {10.5f, 12.0f, 14.5f, 16.75f, 18.0f},
                {20.5f, 22.25f, 24.0f, 26.25f},
                {34.0f, 36.50f},
                {50.0f, 60.0f, 70.0f}
        };

        // compute average pay for the grade 2 programmers

        float sum = 0.0f;

        for (int i = 0; i < payScaleTable [2].length; i++)
        {
            System.out.println(Arrays.toString(payScaleTable[2]));
            sum += payScaleTable [2] [i];
        }
        System.out.println ("Average pay for type 2 programmer = " +
                sum / payScaleTable [2].length);

        // Print the pay difference between the lowest and highest steps for each grade
        float diff;
        for (int i = 0; i < payScaleTable.length; i++)
        {
            diff = payScaleTable [i] [ payScaleTable[i].length-1 ]   -
                    payScaleTable [i] [0];
            System.out.println ("The difference in grade " + i + " = " + diff);

        }

        // Now, everybody gets a $1.50 raise
        for (int i = 0;  i < payScaleTable.length; i++)
        {
            for (int j = 0; j < payScaleTable [i].length; j++)
            {
                payScaleTable [i] [j] += 1.50f;
            }
        }
    }
}


