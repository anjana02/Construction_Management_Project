package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class homepage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage window = new homepage();
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
	public homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	 private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 809, 457);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 795, 83);
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\91949\\Documents\\Sem-3\\sem3-project\\src\\icon.png"));
		lblNewLabel.setBounds(10, 10, 94, 74);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("VERTIGO");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(114, 23, 109, 30);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Sign up");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(605, 33, 85, 29);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Login ");
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(688, 33, 85, 29);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Home");
		btnNewButton_3.setBackground(Color.ORANGE);
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_3.setBounds(428, 33, 85, 29);
		panel.add(btnNewButton_3);
		
		JButton btnRetailer = new JButton("Services");
		btnRetailer.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnRetailer.setBackground(Color.ORANGE);
		btnRetailer.setBounds(515, 33, 91, 29);
		panel.add(btnRetailer);
		
		JLabel lblNewLabel_3 = new JLabel("Build your  Dreams with Us");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_3.setBounds(27, 119, 238, 31);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CONSTRUCTION AT ");
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 35));
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setBounds(27, 149, 436, 47);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("THE BEST");
		lblNewLabel_4_1.setForeground(Color.BLACK);
		lblNewLabel_4_1.setFont(new Font("Verdana", Font.BOLD, 35));
		lblNewLabel_4_1.setBounds(37, 191, 208, 47);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JButton btnNewButton_2 = new JButton("Contact Us");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.setBounds(27, 253, 107, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\91949\\Documents\\Sem-3\\sem3-project\\src\\image.jpg"));
		lblNewLabel_2.setBounds(-27, 84, 822, 336);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
