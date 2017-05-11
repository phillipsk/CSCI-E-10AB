package com.prob7;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JPanel {

	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private CalcBackend backend = new CalcBackend();
	private boolean isDate = false;

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
	
	private void dateFix(JTextField resultScreen) {
		String displayValue = null;
		if(isDate){
			int d  = (int)backend.getDisplayVal();
			displayValue = d+"";
		}else{
			displayValue = backend.getDisplay()+"";
		}
		resultScreen.setText(displayValue);
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
		frame.setSize(510, 800);
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
		char ch = 0x221A;
		final JButton sqrtButton = new JButton("" + ch);
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

		c.gridx = 0;
		c.gridy = 5;
		c.gridwidth = 2;
		final JButton twosComplementButton = new JButton("2's");
		twosComplementButton.setFont(font);
		panel.add(twosComplementButton, c);

		c.gridx = 2;
		c.gridy = 5;
		c.gridwidth = 2;
		final JButton unixDateButton = new JButton("Date");
		unixDateButton.setFont(font);
		panel.add(unixDateButton, c);

		oneButton.setMultiClickThreshhold(100);
		oneButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('1');
				dateFix(resultScreen);
			}
		});

		twoButton.setMultiClickThreshhold(100);
		twoButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('2');
				dateFix(resultScreen);
			}
		});

		threeButton.setMultiClickThreshhold(100);
		threeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('3');
				dateFix(resultScreen);
			}
		});

		fourButton.setMultiClickThreshhold(100);
		fourButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('4');
				dateFix(resultScreen);
			}
		});

		fiveButton.setMultiClickThreshhold(100);
		fiveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('5');
				dateFix(resultScreen);
			}
		});

		sixButton.setMultiClickThreshhold(100);
		sixButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('6');
				dateFix(resultScreen);
			}
		});

		sevenButton.setMultiClickThreshhold(100);
		sevenButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('7');
				dateFix(resultScreen);
			}
		});

		eightButton.setMultiClickThreshhold(100);
		eightButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('8');
				dateFix(resultScreen);
			}
		});

		nineButton.setMultiClickThreshhold(100);
		nineButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('9');
				dateFix(resultScreen);
			}
		});

		zeroButton.setMultiClickThreshhold(100);
		zeroButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('0');
				dateFix(resultScreen);
			}

			
		});

		dotButton.setMultiClickThreshhold(100);
		dotButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('.');
				String displayValue = "" + backend.getDisplayVal();
				resultScreen.setText(displayValue);
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
				String displayValue = "" + backend.getDisplayVal();
				if(isDate){
					String display = backend.getDisplay();
					if("-99999.0".equals(display)){
						JOptionPane.showMessageDialog(frame, "An incorrect date format was received. Please enter date format MMDDYYYY");
					}else{
						resultScreen.setText(display);
						isDate = false;
					}
				}
				else if (displayValue.equals("-0.99999111")) {
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

		twosComplementButton.setMultiClickThreshhold(100);
		twosComplementButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				backend.feedChar('!');
				resultScreen.setText(backend.getDisplay());
			}
		});

		unixDateButton.setMultiClickThreshhold(100);
		unixDateButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Please enter the date format in MMDDYYYY format");
				backend.feedChar('D');
				isDate = true;
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
				if (keyCode == KeyEvent.VK_ENTER) {
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
