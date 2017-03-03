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

public abstract class Pet {

	private String name;
	private int year;

	public Pet(String name, int year) {
		this.name = name;
		this.year = year;
	}

	/**
	 * Abstract method must be implemented in all child classes
	 * 
	 * @return
	 */
	public abstract String speak();

	/**
	 * The getName method is required for the expected output. This method
	 * returns the name of the pet.
	 * 
	 * @return
	 */
	public String getName() {
		return this.name;
	}

	public int getYear() {
		return year;
	}

}
