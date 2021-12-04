package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;

public class RegisterGui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterGui window = new RegisterGui();
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
	public RegisterGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 921, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 916, 106);
		panel_1.setBackground(Color.BLACK);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\91949\\Documents\\Sem-3\\sem3-project\\src\\icon.png"));
		lblNewLabel.setBounds(0, 0, 141, 106);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("VERTIGO");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setBounds(151, 33, 165, 42);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBounds(0, 105, 907, 46);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(285, 0, 118, 46);
		panel_2.add(btnNewButton);
		
		JButton btnBuilder = new JButton("About Us");
		btnBuilder.setBackground(Color.ORANGE);
		btnBuilder.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnBuilder.setBounds(406, 0, 118, 46);
		panel_2.add(btnBuilder);
		
		JButton btnRetailer = new JButton("Services");
		btnRetailer.setBackground(Color.ORANGE);
		btnRetailer.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnRetailer.setBounds(517, 0, 118, 46);
		panel_2.add(btnRetailer);
		
		JButton btnManager = new JButton("Products");
		btnManager.setBackground(Color.ORANGE);
		btnManager.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnManager.setBounds(634, 0, 124, 46);
		panel_2.add(btnManager);
		
		JButton btnSupervisior = new JButton("Contact Us");
		btnSupervisior.setBackground(Color.ORANGE);
		btnSupervisior.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSupervisior.setBounds(757, 0, 140, 46);
		panel_2.add(btnSupervisior);
	}
}
