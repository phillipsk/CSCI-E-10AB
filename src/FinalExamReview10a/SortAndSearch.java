package FinalExamReview10a; /** SortAndSearch.java
 *  A demonstration of the bubble sort algorithm
 *   and the binary search algorithm.
 *  Illustrates distinction between declared array size and 
 *   logical size (# elements actually stored in it)
 *
 *  @author  Dr. Henry H. Leitner
 *  @version Last Modified November 23, 2015
 */
import java.util.*;

class SortAndSearch
{
    private static final int MAX_ARRAY_SIZE = 100;
    private static final int ACTUAL_SIZE = 10;

    static void printArray ( int [] a, int size)
    {
        for (int i = 0; i < size; i++ )
        {
            System.out.println("Element [" + i + "] = " + a[i] );
        }
    }

    /**
     *  This method accepts an array and a size (n), and then sorts n 
     *  elements beginning at position 0 using a bubblesort algorithm.
     *
     *  @param    a     the array to be sorted
     *  @param   n   the number of elements to sort
     */
    static void bubblesort (int [] a,        // an array of numbers
                            int n )          // # of elements in array a
    {


        for (int i = 1; i < n; i++)           // sort a[0..size-1]
        {                                     // into non-descending
            for (int j = n-1; j >= i; j--)      // order by exchange method.  This
            {                                   // will leave a[0]; then a[1]; then
                // a[2]; ... then a[n-1]; with their correct values.
                // In other words, the j-FOR-loop always gets a[i-1]
                // set to the right value by "bubbling" the smallest
                // value in a[i-1], a[i], a[i+1], ..., down to position
                // a[i-1]

                if (a [j - 1] > a[j])           // If true, then the j-1'st and the
                {                               // j'th elements of a are out of
                    int temp = a[j - 1];        // order. They will be swapped!
                    a[j - 1] = a[j];
                    a[j]     = temp;
                }
            }
        }
    }

    /** performs a binary search for item in array a[fromIndex..toIndex]
     *  Returns array index where item was found, or -1 if not found
     */
    static int binary (int [] a, int fromIndex, int toIndex, int key)
    {
        int middle;
        do
        {
            middle = (fromIndex + toIndex) / 2;  // integer division
            if (key == a[middle]) return middle;
            else if (key > a[middle]) fromIndex = middle + 1;
            else toIndex = middle-1;
        } while (fromIndex <= toIndex);
        return -1;
    }


    public static void main (String[] args)
    {
        int  itemLoc;
        int [] list = new int [MAX_ARRAY_SIZE]; // elements init'd to 0
        Scanner keyboard = new Scanner (System.in);

        System.out.print("Do you want randomly assigned values? ");
        String response = keyboard.nextLine();
        char yOrn = response.charAt(0);
        for (int i = 0; i < ACTUAL_SIZE; i++ )
        {
            System.out.print ("Input an array element #" + i + ":  ");
            if (yOrn == 'y' || yOrn == 'Y')
            {
                list[i] = (int) (Math.random() * 100);
                System.out.println( list[i] );
            }
            else list[i] = keyboard.nextInt();
        }

        bubblesort (list, ACTUAL_SIZE); // sort the list into ascending order
        System.out.println
                ("\nHere is the array sorted into non-descending order:");
        printArray (list, ACTUAL_SIZE);
        do
        {
            System.out.print ("\nNow which value shall I search for? ");
            int i = keyboard.nextInt();
            keyboard.nextLine();   // WHY WHY WHY???
            itemLoc = binary (list, 0, ACTUAL_SIZE - 1, i);
            if (itemLoc >= 0)
                System.out.println ("Found " + i + " at location " + itemLoc);
            else
                System.out.println
                        ("Could find the value " + i + " in the array!");

            System.out.print ("Want to search for another value? [yes or no] ");
            response = keyboard.nextLine();
        } while (response.charAt(0) != 'N' && response.charAt(0) != 'n');
    }
}