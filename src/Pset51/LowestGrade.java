package Pset51;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10B Introduction to Computer Science Using Java II
 * Professor Dr. Henry Leitner
 * Teaching Assistant Brandon Tineo
 * Received help from Codementor.io Dharmendra Prasad
 *
 * @author Kevin Phillips
 * @since 2/10/17
 */

/* Define a static method named removeLowest that accepts a variable number
of integer arguments that represent the homework scores of a single student. Your
method should return an integer array that contains all of the values passed to the
method EXCEPT for the lowest score.

In this problem you will write your own static method named arrayPrint, so
that System.out.println (arrayPrint (a) ); would also output [3, 4, 9, -2, 5]

Note that the arrayPrint method returns a String value, and should accept
an array of integer values as its only argument. If the argument passed
contains no values (i.e., the array has a length of 0), then your method should
return “[]” . Your solution to this problem does NOT involve recursion!

*/
public class LowestGrade {

	private static String arrayPrint(int[] a) {
		StringBuilder stringBuilder = new StringBuilder("[");
		for (int i = 0; i < a.length; i++) {
			if (i > 0)
				stringBuilder.append(", ");
			stringBuilder.append(a[i]);
		}
		stringBuilder.append("]");
		return stringBuilder.toString();
	}

	private static int[] removeLowest(int... args) {
		if (args.length == 0)
			return new int[] {};

		if (args.length == 1)
			return new int[] { args[0] };

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < args.length; i++) {
			if (min > args[i]) {
				min = args[i];
			}
		}

		int[] result = new int[args.length - 1];
		boolean removed = false;
		int index = 0;
		for (int i = 0; i < args.length; i++) {
			if (args[i] == min && !removed) {
				removed = true;
			} else {
				result[index++] = args[i];
			}
		}

		return result;
	}

	public static void main(String[] args) {

		int[] a = removeLowest(23, 90, 47, 55, 88);
		int[] b = removeLowest(85);
		int[] c = removeLowest();
		int[] d = removeLowest(59, 92, 93, 47, 88, 47);
		System.out.println("a = " + arrayPrint(a));
		System.out.println("b = " + arrayPrint(b));
		System.out.println("c = " + arrayPrint(c));
		System.out.println("d = " + arrayPrint(d));

	}
}
