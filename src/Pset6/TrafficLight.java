package Pset6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
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
Write a Java application named TrafficLight that produces a drawing
that resembles a traffic light. Arrange for each circle to have the proper 2
color. Here’s what your program might look like in action running on
both Mac OS/X and on Windows:

For a small amount of “extra credit” have a control on-screen to dim
and to light up individually each of the three lights. For example, clicking
the the green light could brighten it a bit, while at the same time “dimming”
the other two.
*/

public class TrafficLight extends JPanel {

	private static final long serialVersionUID = 1L;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrafficLight window = new TrafficLight();
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
	public TrafficLight() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(255, 255, 255));
		frame.setSize(240, 800);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		double width = dim.width - frame.getSize().width;
		double height = dim.height - frame.getSize().height;

		frame.setLocation((int) width / 2, (int) height / 2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(4, 2));

		Circle panel_1 = new Circle(Color.red, new Color(240, 128, 128), 150);
		frame.getContentPane().add(panel_1);

		Circle panel_2 = new Circle(Color.yellow, new Color(240, 230, 140), 150);
		frame.getContentPane().add(panel_2);

		Circle panel_3 = new Circle(Color.green, new Color(144, 238, 144), 150);
		frame.getContentPane().add(panel_3);

		JPanel buttonContainer = new JPanel();
		frame.getContentPane().add(buttonContainer);
		JButton redBtn = new JButton("Red");
		buttonContainer.add(redBtn);
		redBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel_1.bright();
				panel_2.dim();
				panel_3.dim();
			}
		});
		JButton yelBtn = new JButton("Yellow");
		buttonContainer.add(yelBtn);
		yelBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel_1.dim();
				panel_2.bright();
				panel_3.dim();
			}
		});
		JButton grnBtn = new JButton("Green");
		buttonContainer.add(grnBtn);
		grnBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel_1.dim();
				panel_2.dim();
				panel_3.bright();
			}
		});
	}

	class Circle extends JPanel {
		private static final long serialVersionUID = 1L;
		private Color color = Color.BLUE;
		private Color primaryColor;
		private Color dimColor;
		private int diameter;

		public Circle(Color c, Color dim, int d) {
			setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
			this.primaryColor = c;
			this.diameter = d;
			this.dimColor = dim;
			this.color = primaryColor;
		}

		public void dim() {
			this.color = dimColor;
			repaint();
		}
		
		public void bright() {
			this.color = primaryColor;
			repaint();
		}

		@Override
		public Dimension getPreferredSize() {
			return new Dimension(75, 75);
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(color);
			g.fillOval(30, 10, diameter, diameter);
		}
	}
}
