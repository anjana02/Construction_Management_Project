package gui;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class homepage {

	public JFrame frame;

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
		frame.setBounds(100, 100, 801, 557);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 807, 83);
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(".\\src\\icon.png"));
		lblNewLabel.setBounds(10, 10, 94, 74);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("VERTIGO");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(114, 23, 109, 30);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Sign up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterGui Robj = new RegisterGui();
				Robj.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(605, 33, 85, 29);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Login ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginpage loginpage = new loginpage();
				loginpage.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(688, 33, 85, 29);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Home");
		btnNewButton_3.setBackground(Color.ORANGE);
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_3.setBounds(429, 33, 85, 29);
		panel.add(btnNewButton_3);
		
		JButton btnRetailer = new JButton("Services");
		btnRetailer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterGui Robj = new RegisterGui();
				Robj.frame.setVisible(true);
				frame.dispose();
			}
		});
		btnRetailer.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnRetailer.setBackground(Color.ORANGE);
		btnRetailer.setBounds(515, 33, 91, 29);
		panel.add(btnRetailer);
		
		JLabel lblNewLabel_3 = new JLabel("Build your  Dreams with Us");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_3.setBounds(91, 126, 238, 31);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CONSTRUCTION AT ");
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 35));
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setBounds(82, 152, 436, 47);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("THE BEST");
		lblNewLabel_4_1.setForeground(Color.BLACK);
		lblNewLabel_4_1.setFont(new Font("Verdana", Font.BOLD, 35));
		lblNewLabel_4_1.setBounds(85, 196, 208, 47);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JButton btnNewButton_2 = new JButton("Contact Us");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setBounds(118, 253, 107, 38);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(".\\src\\image.jpg"));
		lblNewLabel_2.setBounds(-37, 80, 832, 440);
		frame.getContentPane().add(lblNewLabel_2);
	}

    public void showDetails() {
    }

    public void setVisible(boolean b) {
    }
}
