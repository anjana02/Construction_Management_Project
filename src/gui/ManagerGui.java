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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManagerGui {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerGui window = new ManagerGui();
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
	public ManagerGui() {
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
		lblNewLabel.setIcon(new ImageIcon(".\\src\\image.jpg"));
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
		
		Label label = new Label("Name :");
		label.setFont(new Font("Calibri Light", Font.BOLD, 12));
		label.setBounds(36, 24, 80, 21);
		panel.add(label);
		
		Label label_1 = new Label("Password :");
		label_1.setFont(new Font("Calibri Light", Font.BOLD, 12));
		label_1.setBounds(30, 101, 86, 21);
		panel.add(label_1);
		
		Label label_1_1 = new Label("Email ID :");
		label_1_1.setFont(new Font("Calibri Light", Font.BOLD, 12));
		label_1_1.setBounds(36, 57, 74, 21);
		panel.add(label_1_1);
		
		Label label_1_2 = new Label("Phone :");
		label_1_2.setFont(new Font("Calibri Light", Font.BOLD, 12));
		label_1_2.setBounds(36, 139, 80, 21);
		panel.add(label_1_2);
		
		Label label_1_3 = new Label("Supervior id");
		label_1_3.setFont(new Font("Calibri Light", Font.BOLD, 12));
		label_1_3.setBounds(10, 178, 100, 21);
		panel.add(label_1_3);
		
		Label label_1_4 = new Label("Project Type :");
		label_1_4.setFont(new Font("Calibri Light", Font.BOLD, 12));
		label_1_4.setBounds(310, 30, 100, 21);
		panel.add(label_1_4);
		
		Label label_1_5 = new Label("Site id  :");
		label_1_5.setFont(new Font("Calibri Light", Font.BOLD, 12));
		label_1_5.setBounds(336, 68, 74, 21);
		panel.add(label_1_5);
		
		Label label_1_6 = new Label("City :");
		label_1_6.setFont(new Font("Calibri Light", Font.BOLD, 12));
		label_1_6.setBounds(351, 116, 59, 21);
		panel.add(label_1_6);
		
		Label label_1_7 = new Label("State :");
		label_1_7.setFont(new Font("Calibri Light", Font.BOLD, 12));
		label_1_7.setBounds(351, 156, 59, 21);
		panel.add(label_1_7);
		
		Label label_1_8 = new Label("zip code :");
		label_1_8.setFont(new Font("Calibri Light", Font.BOLD, 12));
		label_1_8.setBounds(335, 194, 75, 21);
		panel.add(label_1_8);
		
		Button button = new Button("Submit");
		button.setFont(new Font("Dubai", Font.BOLD, 12));
		button.setBackground(Color.ORANGE);
		button.setBounds(236, 239, 115, 21);
		panel.add(button);
		
		
		JTextField textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(116, 141, 96, 19);
		panel.add(textField_3);
		
		JTextField textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(116, 180, 96, 19);
		panel.add(textField_4);
		
		JTextField textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(417, 30, 96, 19);
		panel.add(textField_5);
		
		JTextField textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(416, 70, 96, 19);
		panel.add(textField_6);
		
		JTextField textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(417, 118, 96, 19);
		panel.add(textField_7);
		
		JTextField textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(417, 156, 96, 19);
		panel.add(textField_8);
		
		JTextField textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(417, 196, 96, 19);
		panel.add(textField_9);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(116, 101, 96, 19);
		panel.add(passwordField);
		
		Button button_2 = new Button("Back");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterGui Reobj = new RegisterGui();
				Reobj.frame.setVisible(true);
				frame.dispose();
			}
		});
		button_2.setFont(new Font("Dubai", Font.BOLD, 12));
		button_2.setBackground(Color.ORANGE);
		button_2.setBounds(398, 239, 115, 21);
		panel.add(button_2);
		
		Button button_1 = new Button("Home");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homepage hobj = new homepage();
				hobj.frame.setVisible(true);
				frame.dispose();
			}
		});
		button_1.setFont(new Font("Dubai", Font.BOLD, 12));
		button_1.setBackground(Color.ORANGE);
		button_1.setBounds(793, 92, 82, 21);
		frame.getContentPane().add(button_1);
		
		Label label_2 = new Label("MANAGER");
		label_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 33));
		label_2.setForeground(Color.WHITE);
		label_2.setBackground(Color.DARK_GRAY);
		label_2.setBounds(133, 84, 266, 44);
		frame.getContentPane().add(label_2);

	}

}
