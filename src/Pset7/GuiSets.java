package Pset7;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10B Introduction to Computer Science Using Java II
 * Professor Dr. Henry Leitner
 * Teaching Assistant Brandon Tineo
 * Received help from Dharmendra Prasad
 *
 * @author Kevin Phillips
 * @since 4/22/17
 */

/*
* Programming Problem on Bitsets (25 - 35 points)
See chapter 16 in the Reges textbook, which covers linked-list data structures.

[1] Copy the files Bitset.java and TestSets.java from our course website into
your own Cloud9 account.
Part (a) 10 points
The cardinality of a set is defined as the number of elements in the set.
Implement public int cardinality() as an instance method of the Bitset
class, and modify program TestSets to adequately test this new feature.

Part (b) 15 points
A set named a is considered subset of the set named b if and only if every
element of a is also a member of the set b. Implement public boolean
isSubset (Bitset b) as an instance method of the Bitset class, and modify
program TestSets to adequately test this new feature. (Within TestSets be sure to
test whether a is a subset of b and also whether b is a subset of a.)

Part (c) up to 10 points — for “extra credit” only
The user-interface presented by program TestSets.java is pretty lame,
given the graphical user interface components provided by Java’s AWT and
Swing classes. At present, the user is presented with a console-window that
presents a list of choices that looks something like the following:

Type 1 to CREATE SET A
Type 2 to CREATE SET B
Type 3 to CREATE INTERSECTION (A * B)
Type 4 to CREATE UNION (A + B)
Type 5 to CREATE DIFFERENCE (A - B)
Type any OTHER # to EXIT PROGRAM

Command: 2

TYPE SOME SMALL INTEGERS each < 8, and type DONE when all done!
3 3 3 7 5 6 2 DONE
 SET B = { 2 3 5 6 7 }
Type 1 to CREATE SET A
Type 2 to CREATE SET B
Type 3 to CREATE INTERSECTION (A * B)
Type 4 to CREATE UNION (A + B)
Type 5 to CREATE DIFFERENCE (A - B)
Type any OTHER # to EXIT PROGRAM

Command: 1

TYPE SOME SMALL INTEGERS each < 16, and type DONE when all done!
11 12 3 4 4
4 5 2 DONE
 SET A = { 2 3 4 5 11 12 }
Type 1 to CREATE SET A
Type 2 to CREATE SET B
Type 3 to CREATE INTERSECTION (A * B)
Type 4 to CREATE UNION (A + B)
Type 5 to CREATE DIFFERENCE (A - B)
Type any OTHER # to EXIT PROGRAM

Command: 3

 Intersection (A * B) = { 2 3 5 }
Type 1 to CREATE SET A
Type 2 to CREATE SET B
Type 3 to CREATE INTERSECTION (A * B)
Type 4 to CREATE UNION (A + B)
Type 5 to CREATE DIFFERENCE (A - B)
Type any OTHER # to EXIT PROGRAM


Your job is to rewrite the existing code so that the user interface is provided
through a combination of JMenus, JButtons, JTextFields, JTextAreas, JPanels,
JFrames, JCheckBoxes and other GUI components you are familiar with. Note:
you do not need to use all of the above-mentioned elements; create a tasteful and
easy-to-use interface using a subset of the Swing components that make the most
sense.

*/

public class GuiSets extends JPanel {

	int X_OFFSET = 40;
	int Y_OFFSET = 10;
	boolean setACreated = false;
	boolean setBCreated = false;
	Bitset setA = new Bitset(16);
	Bitset setB = new Bitset(8);

	private static final long serialVersionUID = 1L;
	private JFrame frame;

	JButton union = new JButton("Union");
	JButton intersection = new JButton("Intersection");
	JButton difference = new JButton("Difference");
	JButton checkSubset = new JButton("Check Subset");

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiSets window = new GuiSets();
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
	public GuiSets() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(255, 255, 255));
		frame.setSize(800, 600);
		frame.setTitle("Test Set GUI");
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		double width = dim.width - frame.getSize().width;
		double height = dim.height - frame.getSize().height;

		frame.setLocation((int) width / 2, (int) height / 2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setResizable(false);

		JLabel labelSetA = new JLabel("Set A");
		labelSetA.setBounds(X_OFFSET - 30, Y_OFFSET + 10, 400, 50);
		frame.getContentPane().add(labelSetA);

		JTextField setATF = new JTextField("1 2 3");
		setATF.setBounds(X_OFFSET + 10, Y_OFFSET + 10, 400, 50);
		frame.getContentPane().add(setATF);

		JButton createSetABtn = new JButton("Create Set");
		createSetABtn.setBounds(X_OFFSET + 20, Y_OFFSET + 70, 180, 50);
		frame.getContentPane().add(createSetABtn);

		JButton findCardinalityA = new JButton("Find Cardinality");
		findCardinalityA.setBounds(X_OFFSET + 220, Y_OFFSET + 70, 180, 50);
		findCardinalityA.setEnabled(false);
		frame.getContentPane().add(findCardinalityA);

		JLabel labelSetB = new JLabel("Set B");
		labelSetB.setBounds(X_OFFSET - 30, Y_OFFSET + 150, 400, 50);
		frame.getContentPane().add(labelSetB);

		JTextField setBTF = new JTextField("1 2 3");
		setBTF.setBounds(X_OFFSET + 10, Y_OFFSET + 150, 400, 50);
		frame.getContentPane().add(setBTF);

		JButton createSetBBtn = new JButton("Create Set");
		createSetBBtn.setBounds(X_OFFSET + 20, Y_OFFSET + 210, 180, 50);
		frame.getContentPane().add(createSetBBtn);

		JButton findCardinalityB = new JButton("Find Cardinality");
		findCardinalityB.setBounds(X_OFFSET + 220, Y_OFFSET + 210, 180, 50);
		findCardinalityB.setEnabled(false);
		frame.getContentPane().add(findCardinalityB);

		intersection.setBounds(X_OFFSET + 20, Y_OFFSET + 380, 180, 50);
		intersection.setEnabled(false);
		frame.getContentPane().add(intersection);

		union.setBounds(X_OFFSET + 220, Y_OFFSET + 380, 180, 50);
		union.setEnabled(false);
		frame.getContentPane().add(union);

		difference.setBounds(X_OFFSET + 20, Y_OFFSET + 450, 180, 50);
		difference.setEnabled(false);
		frame.getContentPane().add(difference);

		checkSubset.setBounds(X_OFFSET + 220, Y_OFFSET + 450, 180, 50);
		checkSubset.setEnabled(false);
		frame.getContentPane().add(checkSubset);

		JTextArea results = new JTextArea();
		results.setText("Results will appear here");
		results.setWrapStyleWord(true);
		results.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		results.setColumns(10);
		results.setEditable(false);
		results.setBounds(480, 30, 300, 500);
		frame.getContentPane().add(results);

		createSetABtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = setATF.getText();
				if (text.isEmpty()) {
					System.out.println("Error");
				} else {
					findCardinalityA.setEnabled(true);
					setA = new Bitset(16);
					try {
						setA.readSet(new Scanner(text));
					} catch (Exception x) {

					}
					setACreated = true;
					StringBuilder sb = new StringBuilder("Set A created. Below is the contents of Set A \n\n\n");
					sb.append(setA.toString());
					results.setText(sb.toString());
					if (setACreated && setBCreated) {
						enableActions();
					}
				}
			}

		});

		findCardinalityA.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				StringBuilder sb = new StringBuilder("The cardinality of set A is ").append(setA.cardinality());
				results.setText(sb.toString());
			}

		});

		createSetBBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String text = setBTF.getText();
				if (text.isEmpty()) {
					System.out.println("Error");
				} else {
					findCardinalityB.setEnabled(true);
					setB = new Bitset(8);
					try {
						setB.readSet(new Scanner(text));
					} catch (Exception x) {

					}
					setBCreated = true;
					StringBuilder sb = new StringBuilder("Set B created. Below is the contents of Set B \n\n\n");
					sb.append(setB.toString());
					results.setText(sb.toString());
					if (setACreated && setBCreated) {
						enableActions();
					}
				}
			}

		});

		findCardinalityB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				StringBuilder sb = new StringBuilder("The cardinality of set B is ").append(setB.cardinality());
				results.setText(sb.toString());
			}

		});

		intersection.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				StringBuilder sb = new StringBuilder();
				sb.append("Set A :").append(setA.toString()).append("\n\n");
				sb.append("Set B :").append(setB.toString()).append("\n\n");
				sb.append("The intersection of set A and set B is ").append(setA.intersect(setB));
				results.setText(sb.toString());
			}

		});

		union.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				StringBuilder sb = new StringBuilder();
				sb.append("Set A :").append(setA.toString()).append("\n\n");
				sb.append("Set B :").append(setB.toString()).append("\n\n");
				sb.append("The union of set A and set B is ").append(setA.union(setB));
				results.setText(sb.toString());
			}

		});

		difference.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				StringBuilder sb = new StringBuilder();
				sb.append("Set A :").append(setA.toString()).append("\n\n");
				sb.append("Set B :").append(setB.toString()).append("\n\n");
				sb.append("The difference of set A and set B is ").append(setA.difference(setB));
				results.setText(sb.toString());
			}

		});

		checkSubset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				StringBuilder sb = new StringBuilder();
				sb.append("Set A :").append(setA.toString()).append("\n\n");
				sb.append("Set B :").append(setB.toString()).append("\n\n");

				boolean subset = setA.isSubset(setB);
				if (subset) {
					sb.append("SET B is a subset of SET A");
				} else {
					if (setB.isSubset(setA)) {
						sb.append("SET A is a subset of SET B");
					} else {
						sb.append("No set is subset of the other set");
					}
				}
				results.setText(sb.toString());
			}

		});
	}

	private void enableActions() {
		union.setEnabled(true);
		intersection.setEnabled(true);
		difference.setEnabled(true);
		checkSubset.setEnabled(true);
	}
}