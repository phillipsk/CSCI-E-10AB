package Pset6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
Your calculator implementation must make use of the helper class
described below which will separate the calculator math logic from the code
needed to display it. You must implement a class called CalcBackend, that
keeps track of what should be displayed on the screen and updates this
based on key input.

Your CalcBackend should not have any other public methods or
variables. Your main class Calculator should take care of the swing
graphics and have a CalcBackend instance as a member variable. We
have provided you with a unit-test class CalcBackendTest to check the
correctness of your backend implementation. If you have implemented
your backend correctly, all the test cases CalcBackendTest should pass.
You should add more test-cases to check the calculator featuers.

NOTE: the above technique of separating display and backend code is
widely known as the Model-View-Controller pattern (MVC). In this terminology,
CalcBackend is called the Model, and the JFrame code in
Calculator describing the display is called the view, and the ActionListener
code in Calculator that feeds the button pushes to the backend
and updates the display is called the controller.

Some miscellaneous cases to be aware of:
[1] If the user clicks an arithmetic operator (e.g., “*”) but then
immediately clicks a different operator (e.g., “+”), the former operator
is discarded and replaced by the more recent one. In other words,
addition will get performed in this case. Note that there is no precedence
of operators; the evaluation is strictly “left to right.”

[2] There is no “unary minus” operator. To create a negative number,
you will need to perform a calculation such as subtraction from zero.

[3] The calculator performs all of its computations using the data type
double. Consider using the Java class method
Double.parseDouble(s) or Double.valueOf(s).doubleValue() to
convert from a String value to its double representation.

[4] The display should not allow any part of the number to scroll off
either side of the field. And, of course, the user should not be able to
input a number with more than one decimal point!

[5] If the “=” button is pressed repeatedly, it should simply re-produce
whatever is on the calculator’s display.
[6] You can use a GridLayout for the Calculator buttons.

Extra Credit Options (each is worth a different number of points)
Graduate-credit students must implement ONE of the
following for 5 additional points. All students may implement up
to 3 options (no more than that) for the listed extra credit point
values.

[1] 5 points: Implement the MC (memory clear), MS (memory set) and
MR (memory recall) buttons. Carefully define the semantics of these
buttons by playing around with the calculator that is built in to Windows
or OS/X.

[2] 3 points: Implement a +/- button that negates the current display.
Clicking this button repeatedly will toggle the value’s sign.

[3] 3 points: Allow the user to control the calculator by using the keyboard
(in addition to the mouse). In other words, hitting the “*” key will
have the same effect as clicking the “*” with the mouse. (Examine
the Microsoft Windows calculator to find out which keys correspond to
√ , =, MC, and others. One way to do this is to “right-click” on a button
and then select “What’s This?”) You’ll need to learn how to do
this by referring to: https://docs.oracle.com/javase/tutorial/
uiswing/events/keylistener.html and https://docs.oracle.com/
javase/tutorial/uiswing/misc/keybinding.html

[4] 10 points: Implement “(” and “)” buttons that allow the user to
parenthesize expressions so that evaluation of arithmetic expressions
can be performed in a more controlled fashion.

[5] 5 points: Open an additional window containing a JTextArea with
scroll bars so that a “paper tape” of some or all of the user’s interaction
can be referred to later. There should be a calculator button that
controls whether the JTextArea is “on” or “off.”

[6] up to 5 points: Implement one button of your own design. Your idea
must be approved in advance by your teaching fellow. To get you
thinking along the right line, here’s a view of OS/X’s calculator, operating
in “scientific mode.”

[7] 5 points: The layout manager used to arrange the buttons in the
above figures is the most complicated one (but also the most flexible),
a GridBagLayout. It allows the calculator window to be resized
while keeping the relative size and location of the various buttons
intact. Refer to the GridBagDemo.java program in an earlier lecture
handout for guidance. Study the code in that example to understand
how to use the GridBagLayout and GridBagConstraints classes.
*/

public class Calculator extends JPanel {

	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private CalcBackend backend = new CalcBackend();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(255, 255, 255));
		frame.setSize(510, 700);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		double width = dim.width - frame.getSize().width;
		double height = dim.height - frame.getSize().height;

		frame.setLocation((int) width / 2, (int) height / 2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.setResizable(false);

		JPanel resultPanel = new JPanel();
		frame.getContentPane().add(resultPanel, BorderLayout.NORTH);
		resultPanel.setBounds(0, 0, frame.getWidth(), 500);
		resultPanel.setSize(510, 100);

		Font font = new Font("Arial", Font.BOLD, 35);
		JTextField resultScreen = new JTextField();
		resultScreen.setPreferredSize(new Dimension(500, 120));
		resultScreen.setBorder(BorderFactory.createCompoundBorder(resultScreen.getBorder(),
				BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		resultScreen.setHorizontalAlignment(JTextField.RIGHT);
		resultScreen.setFont(font);
		resultScreen.setEditable(false);
		resultScreen.setBackground(Color.yellow);
		resultPanel.add(resultScreen);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(new GridBagLayout());
		panel.setBounds(0, 100, frame.getWidth(), frame.getHeight() - 100);

		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.ipady = 45;
		c.ipadx = 58;
		c.insets = new Insets(5, 5, 5, 5);
		c.gridx = 0;
		c.gridy = 0;

		final JButton clearButton = new JButton("C");
		clearButton.setFont(font);
		panel.add(clearButton, c);

		c.gridx = 1;
		c.gridy = 0;
		final JButton sqrtButton = new JButton("√");
		sqrtButton.setFont(font);
		panel.add(sqrtButton, c);

		c.gridx = 2;
		c.gridy = 0;
		final JButton divideButton = new JButton("/");
		divideButton.setFont(font);
		panel.add(divideButton, c);

		c.gridx = 3;
		c.gridy = 0;
		final JButton multiplyButton = new JButton("*");
		multiplyButton.setFont(font);
		panel.add(multiplyButton, c);

		c.gridx = 0;
		c.gridy = 1;
		final JButton sevenButton = new JButton("7");
		sevenButton.setFont(font);
		panel.add(sevenButton, c);

		c.gridx = 1;
		c.gridy = 1;
		final JButton eightButton = new JButton("8");
		eightButton.setFont(font);
		panel.add(eightButton, c);

		c.gridx = 2;
		c.gridy = 1;
		final JButton nineButton = new JButton("9");
		nineButton.setFont(font);
		panel.add(nineButton, c);

		c.gridx = 3;
		c.gridy = 1;
		final JButton negativeButton = new JButton("-");
		negativeButton.setFont(font);
		panel.add(negativeButton, c);

		c.gridx = 0;
		c.gridy = 2;
		final JButton fourButton = new JButton("4");
		fourButton.setFont(font);
		panel.add(fourButton, c);

		c.gridx = 1;
		c.gridy = 2;
		final JButton fiveButton = new JButton("5");
		fiveButton.setFont(font);
		panel.add(fiveButton, c);

		c.gridx = 2;
		c.gridy = 2;
		final JButton sixButton = new JButton("6");
		sixButton.setFont(font);
		panel.add(sixButton, c);

		c.gridx = 3;
		c.gridy = 2;
		final JButton positiveButton = new JButton("+");
		positiveButton.setFont(font);
		panel.add(positiveButton, c);

		c.gridx = 0;
		c.gridy = 3;
		final JButton oneButton = new JButton("1");
		oneButton.setFont(font);
		panel.add(oneButton, c);

		c.gridx = 1;
		c.gridy = 3;
		final JButton twoButton = new JButton("2");
		twoButton.setFont(font);
		panel.add(twoButton, c);

		c.gridx = 2;
		c.gridy = 3;
		final JButton threeButton = new JButton("3");
		threeButton.setFont(font);
		panel.add(threeButton, c);

		c.gridx = 0;
		c.gridy = 4;
		final JButton zeroButton = new JButton("0");
		zeroButton.setFont(font);
		panel.add(zeroButton, c);

		c.gridx = 1;
		c.gridy = 4;
		final JButton dotButton = new JButton(".");
		dotButton.setFont(font);
		panel.add(dotButton, c);

		c.gridx = 2;
		c.gridy = 4;
		final JButton plusMinusButton = new JButton("+/-");
		plusMinusButton.setFont(font);
		panel.add(plusMinusButton, c);

		c.gridx = 3;
		c.gridy = 3;
		c.gridheight = 2;
		c.weighty = GridBagConstraints.REMAINDER;
		final JButton equalsButton = new JButton("=");
		equalsButton.setFont(font);
		panel.add(equalsButton, c);

		oneButton.setMultiClickThreshhold(100);
		oneButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('1');
				double displayValue = backend.getDisplayVal();
				System.out.println(displayValue + " des");
				resultScreen.setText("" + displayValue);
			}
		});

		twoButton.setMultiClickThreshhold(100);
		twoButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('2');
				resultScreen.setText("" + backend.getDisplayVal());
			}
		});

		threeButton.setMultiClickThreshhold(100);
		threeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('3');
				resultScreen.setText("" + backend.getDisplayVal());
			}
		});

		fourButton.setMultiClickThreshhold(100);
		fourButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('4');
				resultScreen.setText("" + backend.getDisplayVal());
			}
		});

		fiveButton.setMultiClickThreshhold(100);
		fiveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('5');
				resultScreen.setText("" + backend.getDisplayVal());
			}
		});

		sixButton.setMultiClickThreshhold(100);
		sixButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('6');
				resultScreen.setText("" + backend.getDisplayVal());
			}
		});

		sevenButton.setMultiClickThreshhold(100);
		sevenButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('7');
				resultScreen.setText("" + backend.getDisplayVal());
			}
		});

		eightButton.setMultiClickThreshhold(100);
		eightButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('8');
				resultScreen.setText("" + backend.getDisplayVal());
			}
		});

		nineButton.setMultiClickThreshhold(100);
		nineButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('9');
				resultScreen.setText("" + backend.getDisplayVal());
			}
		});

		zeroButton.setMultiClickThreshhold(100);
		zeroButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('0');
				resultScreen.setText("" + backend.getDisplayVal());
			}
		});

		dotButton.setMultiClickThreshhold(100);
		dotButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('.');
				double displayValue = backend.getDisplayVal();
				System.out.println(displayValue + " dis");
				resultScreen.setText("" + displayValue);
			}
		});

		positiveButton.setMultiClickThreshhold(100);
		positiveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('+');
				resultScreen.setText("" + backend.getDisplayVal());
			}
		});

		negativeButton.setMultiClickThreshhold(100);
		negativeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('-');
				resultScreen.setText("" + backend.getDisplayVal());
			}
		});

		multiplyButton.setMultiClickThreshhold(100);
		multiplyButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('*');
				resultScreen.setText("" + backend.getDisplayVal());
			}
		});

		divideButton.setMultiClickThreshhold(100);
		divideButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('/');
				resultScreen.setText("" + backend.getDisplayVal());
			}
		});

		sqrtButton.setMultiClickThreshhold(100);
		sqrtButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('q');
				resultScreen.setText("" + backend.getDisplayVal());
			}
		});

		equalsButton.setMultiClickThreshhold(100);
		equalsButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('=');
				double displayValue = backend.getDisplayVal();
				if (displayValue == -0.999999999999999111) {
					resultScreen.setText("ERROR");
				} else {
					resultScreen.setText("" + backend.getDisplayVal());
				}
			}
		});
		clearButton.setMultiClickThreshhold(100);
		clearButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('c');
				resultScreen.setText("" + backend.getDisplayVal());
			}
		});

		plusMinusButton.setMultiClickThreshhold(100);
		plusMinusButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('N');
				resultScreen.setText("" + backend.getDisplayVal());
			}
		});

		resultScreen.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if(keyCode == KeyEvent.VK_ENTER){
					equalsButton.doClick();
					return;
				}
				char ch = e.getKeyChar();
				
				switch (ch) {
				case '0':
					zeroButton.doClick();
					break;
				case '1':
					oneButton.doClick();
					break;
				case '2':
					twoButton.doClick();
					break;
				case '3':
					threeButton.doClick();
					break;
				case '4':
					fourButton.doClick();
					break;
				case '5':
					fiveButton.doClick();
					break;
				case '6':
					sixButton.doClick();
					break;
				case '7':
					sevenButton.doClick();
					break;
				case '8':
					eightButton.doClick();
					break;
				case '9':
					nineButton.doClick();
					break;
				case '+':
					positiveButton.doClick();
					break;
				case '-':
					negativeButton.doClick();
					break;
				case '*':
					multiplyButton.doClick();
					break;
				case '/':
					divideButton.doClick();
					break;
				case '=':
					equalsButton.doClick();
					break;
				case 'c':
				case 'C':
					clearButton.doClick();
					break;

				}

			}
		});

	}

}
