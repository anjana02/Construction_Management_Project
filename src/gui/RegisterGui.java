package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("unused")
public class RegisterGui {

	public JFrame frame;

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
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 907, 612);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 916, 106);
		panel_1.setBackground(Color.BLACK);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(".\\src\\icon.png"));
		lblNewLabel.setBounds(0, 0, 141, 106);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("VERTIGO");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setBounds(151, 33, 165, 42);
		panel_1.add(lblNewLabel_1);
		
		Button button_1 = new Button("Home");
//		button_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				 homepage hobj = new homepage();
//				 hobj.frame.setVisible(true);
//				 dispose();
//			}
//		});
		button_1.setFont(new Font("Dubai", Font.BOLD, 20));
		button_1.setBackground(Color.ORANGE);
		button_1.setBounds(740, 42, 123, 33);
		panel_1.add(button_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBounds(0, 105, 907, 46);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Services ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel_2.setBounds(40, 10, 142, 26);
		panel_2.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Client");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(41, 233, 139, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Builder ");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(41, 294, 139, 34);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnRetailer = new JButton("Retailer");
		btnRetailer.setBackground(Color.WHITE);
		btnRetailer.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnRetailer.setBounds(41, 362, 139, 34);
		frame.getContentPane().add(btnRetailer);
		
		JButton btnManager = new JButton("Manager");
		btnManager.setBackground(Color.WHITE);
		btnManager.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnManager.setBounds(41, 426, 139, 34);
		frame.getContentPane().add(btnManager);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(".\\images\\bg3.png"));
		lblNewLabel_3.setBounds(231, 116, 666, 459);
		frame.getContentPane().add(lblNewLabel_3);
	}

}
