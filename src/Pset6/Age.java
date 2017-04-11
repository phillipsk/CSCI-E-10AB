package Pset6;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10B Introduction to Computer Science Using Java II
 * Professor Dr. Henry Leitner
 * Teaching Assistant Brandon Tineo
 * Received help from Dharmendra Prasad
 *
 * @author Kevin Phillips
 * @since 4/5/17
 */

/*
* Write a Java program that pops up an option pane that asks the user for his or her age, e.g., If the user types a
* number less than 40, respond with a message box saying that he or she is young. Otherwise, respond with a message
* box that teases the user for being old!
*/

public class Age {

	public static void main(String[] args) {
		// a jframe here isn't strictly necessary, but it makes the example a
		// little more real
		JFrame frame = new JFrame("Input");
		frame.setSize(500, 300);

		// prompt the user to enter their name
		String age = JOptionPane.showInputDialog(frame, "What's your age cowboy?");
		if (age != null && !age.isEmpty()) {
			float ageFloat = Float.parseFloat(age);
			if (ageFloat < 40) {
				JOptionPane.showMessageDialog(frame, "You are a young dude, huh?");
			} else {
				JOptionPane.showMessageDialog(frame, "How do you do old man!");
			}
		}
		JOptionPane.setRootFrame(frame);
		frame.pack();
		// get the user's input. note that if they press Cancel, 'name' will be
		// null
		System.exit(0);
	}
}
