package Pset6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
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
 * @since 4/5/17
 */

/*
Write a complete Java program that presents a window (JFrame) organized
like this. The boxes next to the fields To:, Cc:, Bcc: and Subject: are all JTextFields.
The box to the right of From: is a JComboBox (you should include 3
different names/email addresses in this dropdown list).
The region that contains my email message (blah, blah, blah … ) is a
JTextArea. Also, you should include a clickable “Send” button (a JButton
object). It can be located just below the title bar of the JFrame, or anywhere
else that makes sense. When clicked, this button should cause the content of
the JTextArea to be written to a file named outbox.txt After the message is
written to file, the screen should be cleared and title should be reset.
Note that the JFrame’s “title” should be set to whatever the user types
inside the Subject: JTextField. If the user does not type anything, then the
title should simply be “New Message”.
*/
public class MailLayout {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	private static int X_OFFSET = 10;
	private static int Y_OFFSET = 50;
	
	private static String DEFAULT_TITLE = "New Message";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MailLayout window = new MailLayout();
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
	public MailLayout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setSize(850, 760);
		frame.setTitle(DEFAULT_TITLE);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		double width = dim.width - frame.getSize().width;
		double height = dim.height - frame.getSize().height;
		
		frame.setLocation((int)width/2, (int)height/2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("To:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(X_OFFSET + 12, Y_OFFSET + 24, 56, 16);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblCc = new JLabel("Cc:");
		lblCc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCc.setBounds(X_OFFSET + 12, Y_OFFSET + 68, 56, 16);
		frame.getContentPane().add(lblCc);

		JLabel lblBcc = new JLabel("Bcc:");
		lblBcc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBcc.setBounds(X_OFFSET + 12, Y_OFFSET + 113, 56, 16);
		frame.getContentPane().add(lblBcc);

		JLabel lblSubject = new JLabel("Subject:");
		lblSubject.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSubject.setBounds(X_OFFSET + 12, Y_OFFSET + 155, 56, 16);
		frame.getContentPane().add(lblSubject);

		JLabel lblFrom = new JLabel("From:");
		lblFrom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFrom.setBounds(X_OFFSET + 12, Y_OFFSET + 196, 56, 16);
		frame.getContentPane().add(lblFrom);

		JSeparator separator = new JSeparator();
		separator.setBackground(Color.LIGHT_GRAY);
		separator.setBounds(X_OFFSET + 12, Y_OFFSET + 56, 790, 2);
		frame.getContentPane().add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.LIGHT_GRAY);
		separator_1.setBounds(X_OFFSET + 12, Y_OFFSET + 97, 790, 2);
		frame.getContentPane().add(separator_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.LIGHT_GRAY);
		separator_2.setBounds(X_OFFSET + 12, Y_OFFSET + 140, 790, 2);
		frame.getContentPane().add(separator_2);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(Color.LIGHT_GRAY);
		separator_3.setBounds(X_OFFSET + 12, Y_OFFSET + 184, 790, 2);
		frame.getContentPane().add(separator_3);

		JSeparator separator_4 = new JSeparator();
		separator_4.setBackground(Color.LIGHT_GRAY);
		separator_4.setBounds(X_OFFSET + 12, Y_OFFSET + 225, 790, 2);
		frame.getContentPane().add(separator_4);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setToolTipText("");
		textField.setBounds(X_OFFSET + 75, Y_OFFSET + 16, 738, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setBorder(null);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(X_OFFSET + 75, Y_OFFSET + 60, 738, 32);
		frame.getContentPane().add(textField_1);
		textField_1.setBorder(null);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(X_OFFSET + 75, Y_OFFSET + 105, 738, 32);
		frame.getContentPane().add(textField_2);
		textField_2.setBorder(null);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(X_OFFSET + 75, Y_OFFSET + 147, 738, 32);
		frame.getContentPane().add(textField_3);
		textField_3.setBorder(null);
		
		// Listen for changes in the text
		textField_3.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				if(textField_3.getText() == null || textField_3.getText().toString() == null || textField_3.getText().toString().isEmpty()){
					frame.setTitle(DEFAULT_TITLE);
				}
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				if(textField_3.getText() != null && textField_3.getText().toString() != null && !textField_3.getText().toString().isEmpty()){
					frame.setTitle(textField_3.getText().toString());
				}
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				System.out.println("Changed");
			}
		});		

		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinner.setModel(new SpinnerListModel(new String[] { "John Rick - johnrick@gmail.com",
				"Kathie Sierra - kathiesierra@gmail.com", "Albert Einstein - alberteinstein@gmail.com" }));
		spinner.setBounds(84, 242, 728, 25);
		frame.getContentPane().add(spinner);
		spinner.setBorder(null);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBackground(new Color(176, 196, 222));
		
		btnNewButton.setBounds(12, 13, 122, 48);
		frame.getContentPane().add(btnNewButton);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textArea.setBounds(12, 287, 808, 413);
		frame.getContentPane().add(textArea);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// write to a file here
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textArea.setText("");
				File f = new File("output.txt");
				try {
					FileOutputStream fos = new FileOutputStream(f);
					fos.write(textArea.getText().getBytes());
					fos.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
	}
}

