package Pset7;
/**
*  TestSets.java
*
*  @version: Last Modified April 8, 2017
*  @author:  Henry Leitner
*/

import java.util.*;

public class TestSets {
	static void menu() {
		System.out.println();
		System.out.print("Type 1 to CREATE SET A\n");
		System.out.print("Type 2 to CREATE SET B\n");
		System.out.print("Type 3 to CREATE INTERSECTION (A * B)\n");
		System.out.print("Type 4 to CREATE UNION (A + B)\n");
		System.out.print("Type 5 to CREATE DIFFERENCE (A - B)\n");
		System.out.print("Type 6 to CHECK SUBSET\n");
		System.out.print("Type 7 to FIND CARDINALITY \n");
		System.out.print("Type any OTHER # to EXIT PROGRAM \n\n");
		System.out.print("Command: ");
	}

	public static void main(String[] args) {
		Bitset setA = new Bitset(16);
		int command;
		Bitset setB = new Bitset(8);

		Scanner keyboard = new Scanner(System.in);
		do {
			menu();

			switch (command = keyboard.nextInt()) {
			case 1:
				System.out.println("Type some small integers, each < 16" + ", and type DONE when all done!");
				setA.readSet(keyboard);
				System.out.print("     SET A = " + setA);
				break;

			case 2:
				System.out.println("Type some small integers, each < 8" + ", and type DONE when all done!");
				setB.readSet(keyboard);
				System.out.print("     SET B = " + setB);
				break;

			case 3:
				System.out.print("     Intersection (A * B) = ");
				System.out.print(setA.intersect(setB));
				break;

			case 4:
				System.out.print("     Union (A + B) = ");
				System.out.print(setA.union(setB));
				break;

			case 5:
				System.out.print("     Difference (A - B) = ");
				System.out.print(setA.difference(setB));
				break;
			case 6:
				boolean subset = setA.isSubset(setB);
				if(subset){
					System.out.println("SET B is a subset of SET A");
					break;
				}else{
					if(setB.isSubset(setA)){
						System.out.println("SET A is a subset of SET B");
						break;
					}
				}
				System.out.println("No set is subset of the other set");break;

			case 7:
				System.out.print("Enter the set name (A or B)");
				String setName = keyboard.next();
				if ("A".equalsIgnoreCase(setName)) {
					System.out.println("Cardinality of SET A : " + setA.cardinality());
				} else if ("B".equalsIgnoreCase(setName)) {
					System.out.println("Cardinality of SET B " + setB.cardinality());
				}
				break;

			default:
				System.exit(0);

			}
		} while (command > 0 && command < 8);
	}
}
