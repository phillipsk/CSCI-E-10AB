package Pset6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Toolkit;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * Harvard Extension School Programming Certificate
 * CSCI E-10B Introduction to Computer Science Using Java II
 * Professor Dr. Henry Leitner
 * Teaching Assistant Brandon Tineo
 * Received help from Dharmendra Prasad
 *
 * @author Kevin Phillips
 * @since 4/9/17
 */

/*
Write a Java application using Swing graphics that draws the face of a
clock, showing the time that the user enters in two JTextField areas (one
for the hours, one for the minutes).

Hint: You need to find out the angles of the hour hand and the minute
hand. The angle of the minute hand is easy; the minute hand travels 360
degrees in 60 minutes. The angle of the hour hand is harder; it travels 360
degrees in 12 x 60 minutes. Don’t attempt this problem if you don’t remember
your trigonometry!
*/

public class Clock extends JPanel {
	private static final long serialVersionUID = 8839841342459211675L;
	private JFrame frame;

	public Clock() {
		initialize();
	}

	public void initialize() {

		frame = new JFrame();
		frame.setBackground(new Color(255, 255, 255));
		frame.setSize(600, 700);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		double width = dim.width - frame.getSize().width;
		double height = dim.height - frame.getSize().height;

		frame.setLocation((int) width / 2, (int) height / 2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTextField hour = new JTextField();
		JLabel hourLabel = new JLabel("Time");
		JTextField minute = new JTextField();
		JLabel minuteLabel = new JLabel("Minute");
		
		hourLabel.setBounds(10, 10, 50, 30);
		hour.setBounds(70, 10, 80, 30);
		hour.setBorder(null);
		hour.setBackground(Color.LIGHT_GRAY);
		minuteLabel.setBounds(160, 10, 50, 30);
		minute.setBounds(220, 10, 100, 30);
		minute.setBackground(Color.LIGHT_GRAY);
		minute.setBorder(null);
		

		final AnalogClock aClock = new AnalogClock(frame.getWidth(), frame.getHeight());

		hour.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				change();
			}

			public void removeUpdate(DocumentEvent e) {
				change();
			}

			public void insertUpdate(DocumentEvent e) {
				change();
			}

			public void change() {
				String hourStr = hour.getText();
				int hour = -1;
				try {
					hour = Integer.parseInt(hourStr);
				} catch (Exception e) {
				}
				aClock.changeTime(hour, -1);
			}
		});
		
		minute.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				change();
			}

			public void removeUpdate(DocumentEvent e) {
				change();
			}

			public void insertUpdate(DocumentEvent e) {
				change();
			}

			public void change() {
				String minuteStr = minute.getText();
				int minute = -1;
				try {
					minute = Integer.parseInt(minuteStr);
				} catch (Exception e) {
				}
				aClock.changeTime(-1, minute);
			}
		});

		frame.getContentPane().add(aClock);
		aClock.setBounds(0, 50, frame.getWidth(), frame.getHeight());
		
		frame.getContentPane().add(hour);
		frame.getContentPane().add(hourLabel);
		frame.getContentPane().add(minute);
		frame.getContentPane().add(minuteLabel);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clock window = new Clock();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	class AnalogClock extends JPanel {

		@Override
		public void paintComponent(Graphics g2d) {
			super.paintComponent(g2d);
			setBackground(Color.WHITE);
			g2d.setColor(Color.white);
			drawCircle(STARTX, STARTY, this.width - 150, g2d);
			drawWedge(2 * Math.PI * hours / 12, width / 5, g2d);
			drawWedge(2 * Math.PI * minutes / 60, width / 4, g2d);
			g2d.setColor(Color.white);
			g2d.drawString(timeString, 10, height - 10);
			g2d.dispose();
		}

		private static final int STARTY = 100;

		private static final int STARTX = 40;

		private static final long serialVersionUID = 1L;

		int width, height;
		Thread t = null;
		boolean threadSuspended;
		int hours = 0, minutes = 0, seconds = 0;
		String timeString = "";

		private int CENTERX;
		private int CENTERY;

		public AnalogClock(int width, int height) {

			this.width = width;
			this.height = height;
			setBackground(Color.black);
			this.CENTERX = width / 2;
			this.CENTERY = height / 2;

			Calendar cal = Calendar.getInstance();
			this.hours = cal.get(Calendar.HOUR_OF_DAY);

			if (this.hours > 12)
				this.hours -= 12;
			this.minutes = cal.get(Calendar.MINUTE);
			this.seconds = cal.get(Calendar.SECOND);
			repaint();
		}

		
		void drawHand(double angle, int radius, Graphics g) {
			angle -= 0.5 * Math.PI;
			int x = (int) (radius * Math.cos(angle));
			int y = (int) (radius * Math.sin(angle));
			g.drawLine(CENTERX, CENTERY, CENTERX + x, CENTERY + y);
		}

		void drawWedge(double angle, int radius, Graphics g) {
			angle -= 0.5 * Math.PI;
			int x = (int) (radius * Math.cos(angle));
			int y = (int) (radius * Math.sin(angle));
			angle += 2 * Math.PI / 3;
			int x2 = (int) (7 * Math.cos(angle));
			int y2 = (int) (7 * Math.sin(angle));
			angle += 2 * Math.PI / 3;
			int x3 = (int) (7 * Math.cos(angle));
			int y3 = (int) (7 * Math.sin(angle));

			Polygon p = new Polygon();
			p.addPoint(CENTERX + x2, CENTERY + y2);
			p.addPoint(CENTERX + x, CENTERY + y);
			p.addPoint(CENTERX + x3, CENTERY + y3);
			g.setColor(Color.black);
			g.fillPolygon(p);

		}

		public void drawCircle(int centerx, int centery, int diameter, Graphics g) {
			g.setColor(Color.black);

			int radius = diameter / 2;
			for (int i = 0; i < 360; i += 6) {
				double cos = Math.cos(i * Math.PI / 180);
				double sin = Math.sin(i * Math.PI / 180);
				int x = (int) (CENTERX + (radius * sin));
				int y = (int) (CENTERY + (radius * cos));
				if (i % 30 == 0) {
					g.fillOval(x, y, 15, 15);
				} else {
					g.drawOval(x, y, 5, 5);
				}
			}
		}

		public void changeTime(int hour, int minute) {
			if (minute >= 0)
				this.minutes = minute;
			if (hour >= 0) {
				if (hour > 12)
					this.hours = hour - 12;
				else
					this.hours = hour;
			}
			repaint();
		}

	}

}