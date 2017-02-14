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

/*
Write a recursive method sumTo that takes an integer parameter n
and returns the sum of the first n reciprocals. In other words:
sumTo(n) returns the value of the expression
 (1 + 1/2 + 1/3 + 1/4 + ... + 1/n)

For example, sumTo (2) should return the value 1.5. The method
should return 0.0 if passed the value 0 and should throw an
IllegalArgumentException if passed a value less than 0.

You may NOT use a while loop, for loop or do-while loop to solve this
problem; you MUST use recursion. Write a main method that
convincingly demonstrates your method in action.

*/
public class RecursiveSum {
	public static void main(String[] args) {
		System.out.println("sumTo(5)");
		System.out.println(sumTo(5));
		System.out.println();

		System.out.println("sumTo(1)");
		System.out.println(sumTo(1));
		System.out.println();

		System.out.println("sumTo(0)");
		System.out.println(sumTo(0));
		System.out.println();

		System.out.println("sumTo(-1)");
		System.out.println(sumTo(-1));
	}

	private static double sumTo(int n) {
		if (n < 0) {
			throw new IllegalArgumentException();
		}
		if (n == 0)
			return 0.0;

		if (n == 1)
			return 1.0;

		return sumTo(n - 1) + 1.0/n;
	}
}
