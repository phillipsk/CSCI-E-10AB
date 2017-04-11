package Pset6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10B Introduction to Computer Science Using Java II
 * Professor Dr. Henry Leitner
 * Teaching Assistant Brandon Tineo
 * Received help from Dharmendra Prasad
 *
 * @author Kevin Phillips
 * @since 4/8/17
 */

/*
This problem is required for graduate-credit students only!
According to Wikipedia, “The 15-puzzle (also called Gem Puzzle, Boss
Puzzle, Game of Fifteen, Mystic Square and many others) is a sliding
puzzle that consists of a frame of numbered square tiles in random order
with one tile missing.”

A user clicks on one of the numbered tiles that’s adjacent to the empty
space, and that tile then moves to the empty space.

Write a Java application that presents a 15-puzzle with the numbered
tiles in some random order. Your program should allow the user to click
on numbered tiles in order to move them around. The actual objective of
the puzzle is for the player to get the board to look like this (numbers sorted
numerically.

Note that if a user clicks on a numbered tile that is NOT adjacent to the
empty space, then nothing should happen.

IMPORTANT: To avoid the having the tiles shuffled into positions that
make it literally impossible to move them back into the order shown
above, you need to shuffle the tiles carefully. One way to do this is to repeatedly
exchange 2 tiles positioned adjacent to the open space in a “legal”
way. You should place a Shuffle button on the display, as shown in
the following solution written by one of the teaching assistants.

You should arrange the initial configuration of the board with the tiles
in order, from 1 to 15. Then clicking the Shuffle button will reorder the
tiles in a solvable manner. You can play with this solution by copying the
files Fifteen.class and Fifteen$1.class from the unit6 folder on
the Lecture Examples page of our course website.

In addition, you should have your program stop and print a
congratulatory message when the user has manually clicked the tiles into
the correct positions after a Shuffle has taken place. (Hint: a straightforward
solution will involve a two-dimensional array of JButtons.)

*/
public class FifteenPuzzle extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

	private static final long serialVersionUID = 1L;
	private JFrame frame;
	int[] A = new int[16];
	JButton[] BA = new JButton[16];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FifteenPuzzle window = new FifteenPuzzle();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FifteenPuzzle() {
		for (int i = 0; i < 16; i++) {
			A[i] = i;
		}
		shuffleArray();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(255, 255, 255));
		frame.setSize(480, 600);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		double width = dim.width - frame.getSize().width;
		double height = dim.height - frame.getSize().height;

		frame.setLocation((int) width / 2, (int) height / 2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setResizable(false);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(4, 4));
		panel.setBounds(0, 100, frame.getWidth(), frame.getHeight() - 100);
		addButtons(panel);

		Panel buttonPanel = new Panel();
		frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);

		JButton shuffle = new JButton("Shuffle");
		shuffle.setPreferredSize(new Dimension(100, 40));
		JButton exit = new JButton("Exit");
		exit.setPreferredSize(new Dimension(100, 40));
		buttonPanel.add(shuffle);
		buttonPanel.add(exit);

		shuffle.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				shuffleArray();
				for (int k = 0; k < BA.length; k++) {
					BA[k].setText(A[k] == 0 ? "" : A[k] + "");
				}
			}
		});
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
			}
		});
	}

	private void addButtons(JPanel panel) {

		for (int i = 0; i < 16; i++) {
			JButton button = new JButton((A[i] == 0 ? "" : A[i] + ""));
			button.setPreferredSize(new Dimension(120, 120));
			BA[i] = button;
			button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JButton source = (JButton) e.getSource();
					String text = source.getText();
					System.out.println(text);
					int index = -1;
					for (int j = 0; j < A.length; j++) {
						if (A[j] == Integer.parseInt(text)) {
							index = j;
							break;
						}
					}

					if (index - 1 >= 0 && A[index - 1] == 0) {
						A[index - 1] = A[index];
						BA[index - 1].setText("" + A[index]);
						BA[index].setText("");
						A[index] = 0;
					} else if (index + 1 < A.length && A[index + 1] == 0) {
						A[index + 1] = A[index];
						BA[index + 1].setText("" + A[index]);
						BA[index].setText("");
						A[index] = 0;
					} else if (index - 4 >= 0 && A[index - 4] == 0) {
						A[index - 4] = A[index];
						BA[index - 4].setText("" + A[index]);
						BA[index].setText("");
						A[index] = 0;
					} else if (index + 4 < A.length && A[index + 4] == 0) {
						A[index + 4] = A[index];
						BA[index + 4].setText("" + A[index]);
						BA[index].setText("");
						A[index] = 0;
					}

					if (isASorted()) {
						JOptionPane.showMessageDialog(frame, "Congratulations!!! you have solved the puzzle");
					}
				}
			});
			panel.add(button);
		}
	}

	void shuffleArray() {
		// If running on Java 6 or older, use `new Random()` on RHS here
		Random rnd = new Random();
		for (int i = A.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			// Simple swap
			int a = A[index];
			A[index] = A[i];
			A[i] = a;
		}
	}

	boolean isASorted() {
		for (int i = 14; i >= 0; i--) {
			if (A[i] < A[i - 1])
				return false;
		}
		return true;
	}
}
