package Pset52.barcode;

//BarCodeTest.java
/*********************************** 
 * Tester class to grade the BarCode problem  
 * CSCI E-10b, Homework 5, part 2 (2017) 
 * 
 * @author   Jan Jackson, modified by H. Leitner 
 * @version  1.2 
 * **/
public class BarCodeTest {
	public static void main(String[] args) {
		/*
		 * The items in the array below represent the following: [0] valid zip
		 * code - 02138 [1] valid bar code - 95014 [2] valid bar code - 78240
		 * [3] bad bar code - bad check digit [4] bad bar code - length 31 [5]
		 * bad bar code - missing final frame bar [6] bad zip code (contains
		 * letter) If there are other codes you would like to test, include them
		 * in the array below. When your program is graded, we will test with
		 * additional examples.
		 */
		String[] tester = { "02138", 
							"||:|:::|:|:||::::::||:|::|:::|||", 
							"||:::||::|:::|:|:|::|||:::|:|::|",
							"||:::||::|:::|:|:|::|||:::||:::|", 
							"||:::||::|:::|:|:|::|||:::||:::|",
							"||:|:::|:|:||::::::||:|::|:::||:", 
							"0231a" };
		for (int i = 0; i < tester.length; i++) {
			System.out.println();
			try {
				System.out.println("Creating bar code with " + tester[i]);
				BarCode bc = new BarCode(tester[i]);
				System.out.println("\tCode created!   ");
				System.out.println("\tBar code is : " + bc.getBarCode() + ";  zip is : " + bc.getZipCode());
			} catch (IllegalArgumentException iae) {
				System.out.println(iae.getMessage());
			}
			System.out.println();
		}
	}
}
