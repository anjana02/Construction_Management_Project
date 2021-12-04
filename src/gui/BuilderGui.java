package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Label;
import java.awt.Button;
import javax.swing.JPasswordField;
import java.awt.Font;

public class BuilderGui {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuilderGui window = new BuilderGui();
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
	public BuilderGui() {
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
		
		textField = new JTextField();
		textField.setBounds(116, 24, 96, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
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
		
		Label label_1_3 = new Label("Supervisor id");
		label_1_3.setBounds(35, 176, 75, 21);
		panel.add(label_1_3);
		
		Label label_1_4 = new Label("Job description");
		label_1_4.setBounds(335, 29, 59, 21);
		panel.add(label_1_4);
		
		Label label_1_5 = new Label("Street name");
		label_1_5.setBounds(332, 64, 78, 21);
		panel.add(label_1_5);
		
		Label label_1_6 = new Label("City");
		label_1_6.setBounds(335, 116, 59, 21);
		panel.add(label_1_6);
		
		Label label_1_7 = new Label("State");
		label_1_7.setBounds(335, 160, 59, 21);
		panel.add(label_1_7);
		
		Label label_1_8 = new Label("zip code");
		label_1_8.setBounds(335, 194, 59, 21);
		panel.add(label_1_8);
		
		Button button = new Button("Submit");
		button.setFont(new Font("Dubai", Font.BOLD, 12));
		button.setBackground(Color.ORANGE);
		button.setBounds(236, 239, 80, 21);
		panel.add(button);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(116, 141, 96, 19);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(116, 180, 96, 19);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(417, 30, 96, 19);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(416, 70, 96, 19);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(417, 118, 96, 19);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(417, 156, 96, 19);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(417, 196, 96, 19);
		panel.add(textField_9);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(116, 101, 96, 19);
		panel.add(passwordField);
		
		Button button_1 = new Button("Home");
		button_1.setFont(new Font("Dubai", Font.BOLD, 12));
		button_1.setBackground(Color.ORANGE);
		button_1.setBounds(793, 92, 82, 21);
		frame.getContentPane().add(button_1);
		
		Label label_2 = new Label("BUILDER");
		label_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 33));
		label_2.setForeground(Color.WHITE);
		label_2.setBackground(Color.DARK_GRAY);
		label_2.setBounds(133, 84, 266, 44);
		frame.getContentPane().add(label_2);
	}
}
