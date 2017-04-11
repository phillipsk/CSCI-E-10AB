package Pset6;

import java.math.BigDecimal;

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


public class CalcBackend {

	private StringBuilder num1 = new StringBuilder();
	private StringBuilder num2 = new StringBuilder();
	int lastNumber = -1;
	private char operation = ' ';
	private double result = -99999.0;

	public void feedChar(char c) {
		if (c == 'N') {
			result = 0 - result;
		} else if (c == 'c') {
			num1 = new StringBuilder();
			num2 = new StringBuilder();
			operation = ' ';
			result = 0.0;
			lastNumber = -1;

		} else if (c == '+' || c == '-' || c == '*' || c == '/') {
			if (num1.length() > 0 && num2.length() > 0) {
				try {
					float n1 = Float.parseFloat(num1.toString());
					float n2 = Float.parseFloat(num2.toString());
					switch (operation) {
					case '+':
						result = n1 + n2;
						break;
					case '-':
						result = n1 - n2;
						break;
					case '*':
						result = n1 * n2;
						break;
					case '/':
						if (n2 == 0)
							result = -0.999999999999999111;
						else
							result = n1 / n2;
						break;
					}
				} catch (Exception e) {

				}
				num1 = new StringBuilder(result + "");
				num2 = new StringBuilder();
			}
			operation = c;
		} else if ((c >= '0' && c <= '9') || c == '.') {
			if (operation == ' ') {
				if (num1.length() == 0) {
					num1.append("0");
				}
				num1.append(c);
				lastNumber = 1;
				try {
					result = Float.parseFloat(num1.toString());
				} catch (Exception e) {
				}
			} else {
				if (num2.length() == 0) {
					num2.append("0");
				}
				num2.append(c);
				lastNumber = 2;
				result = Float.parseFloat(num2.toString());
			}
		} else if (c == 'q') {
			if (lastNumber == 1) {
				try {
					float parseFloat = Float.parseFloat(num1.toString());
					if (result < 0)
						result = -0.999999999999999111;
					else {
						result = Math.sqrt(parseFloat);
					}
				} catch (Exception e) {

				}
			} else if (lastNumber == 2) {
				try {
					float parseFloat = Float.parseFloat(num2.toString());
					if (parseFloat < 0)
						result = -0.999999999999999111;
					else {
						result = Math.sqrt(parseFloat);
						if (operation != ' ') {
							num2 = new StringBuilder(result + "");
						}
					}
				} catch (Exception e) {

				}
			} else if (lastNumber == 3) {
				if (result < 0)
					result = -0.999999999999999111;
				else
					result = Math.sqrt(result);
			}
		}

		if (c == '=') {
			if (num1.length() > 0 && num2.length() > 0 && operation != ' ') {
				try {
					float n1 = Float.parseFloat(num1.toString());
					float n2 = Float.parseFloat(num2.toString());
					switch (operation) {
					case '+':
						result = n1 + n2;
						break;
					case '-':
						result = n1 - n2;
						break;
					case '*':
						result = n1 * n2;
						break;
					case '/':
						if (n2 == 0)
							result = -0.999999999999999111;
						else
							result = n1 / n2;
						break;
					}
				} catch (Exception e) {

				}
				num1 = new StringBuilder(result + "");
				num2 = new StringBuilder();
			}
			lastNumber = 3;
		}

	}

	public double getDisplayVal() {
		BigDecimal bd = new BigDecimal(String.format("%.2f", result));
		if(num1.length() == 0 && num2.length() == 0 && result ==  -99999.0){
			return 0.0;
		}
		return bd.doubleValue();
	}
}
