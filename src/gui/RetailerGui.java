package gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RetailerGui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RetailerGui window = new RetailerGui();
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
	public RetailerGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 899, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, -112, 885, 190);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\91949\\Documents\\Sem-3\\sem3-project\\src\\image.jpg"));
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(133, 134, 624, 287);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextField textField = new JTextField();
		textField.setBounds(116, 24, 96, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JTextField textField_1 = new JTextField();
		textField_1.setBounds(116, 59, 96, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		Label label = new Label("User Name");
		label.setBounds(36, 24, 80, 21);
		panel.add(label);
		
		Label label_1 = new Label("Password");
		label_1.setBounds(36, 99, 59, 21);
		panel.add(label_1);
		
		Label label_1_1 = new Label("Email ID");
		label_1_1.setBounds(36, 57, 59, 21);
		panel.add(label_1_1);
		
		Label label_1_2 = new Label("Phone");
		label_1_2.setBounds(36, 139, 42, 21);
		panel.add(label_1_2);
		
		Label label_1_5 = new Label("Street name");
		label_1_5.setBounds(335, 22, 78, 21);
		panel.add(label_1_5);
		
		Label label_1_6 = new Label("City");
		label_1_6.setBounds(354, 59, 59, 21);
		panel.add(label_1_6);
		
		Label label_1_7 = new Label("State");
		label_1_7.setBounds(354, 99, 59, 21);
		panel.add(label_1_7);
		
		Label label_1_8 = new Label("zip code");
		label_1_8.setBounds(354, 139, 59, 21);
		panel.add(label_1_8);
		
		Button button = new Button("Submit");
		button.setFont(new Font("Dubai", Font.BOLD, 12));
		button.setBackground(Color.ORANGE);
		button.setBounds(236, 239, 111, 21);
		panel.add(button);
		
		JTextField textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(116, 141, 96, 19);
		panel.add(textField_3);
		
		JTextField textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(430, 24, 96, 19);
		panel.add(textField_6);
		
		JTextField textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(430, 59, 96, 19);
		panel.add(textField_7);
		
		JTextField textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(430, 101, 96, 19);
		panel.add(textField_8);
		
		JTextField textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(430, 152, 96, 19);
		panel.add(textField_9);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(116, 101, 96, 19);
		panel.add(passwordField);
		
		Button button_1 = new Button("Home");
		button_1.setFont(new Font("Dubai", Font.BOLD, 12));
		button_1.setBackground(Color.ORANGE);
		button_1.setBounds(762, 84, 92, 21);
		frame.getContentPane().add(button_1);
		
		Label label_2 = new Label("Retailer");
		label_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 33));
		label_2.setForeground(Color.WHITE);
		label_2.setBackground(Color.DARK_GRAY);
		label_2.setBounds(133, 84, 266, 44);
		frame.getContentPane().add(label_2);
	}

}
