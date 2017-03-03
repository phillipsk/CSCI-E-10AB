package Pset52.src.pettest;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10B Introduction to Computer Science Using Java II
 * Professor Dr. Henry Leitner
 * Teaching Assistant Brandon Tineo
 * Received help from Dharmendra Prasad
 *
 * @author Kevin Phillips
 * @since 3/3/17
 */

public class PetTest {
	public static void main(String[] args) {
		Pet[] myPets = new Pet[3];

		myPets[0] = new Dog("Boo-Boo", 2008);

		myPets[1] = new Cat("Tigi", 1999);

		myPets[2] = new Cat("Sheldon", 2001);

		for (Pet p : myPets) {
			System.out.println(p.getName() + " says " + p.speak());
		}
	}
}
