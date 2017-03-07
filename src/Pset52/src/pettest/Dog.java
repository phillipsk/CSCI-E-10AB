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

public class Dog extends Pet {
	public Dog(String name, int year) {
		super(name, year);
	}

	public String speak() {
		return "Woof!";
	}
}
