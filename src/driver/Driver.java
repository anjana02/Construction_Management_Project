package driver;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import gui.AcceptingAuthorityGui;
import gui.BuilderGui;
import gui.ClientGui;
import gui.ManagerGui;
import gui.RetailerGui;
import gui.SupervisorGui;

class Driver extends JFrame implements ActionListener  {
	@SuppressWarnings("rawtypes")
	JComboBox select = null;
	JTextField id = null;
	JPasswordField code = null;
	JLabel message = null;
	JFrame loginWindow = null;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Driver(){
		loginWindow = new JFrame("User Login");
		ImageIcon img = new ImageIcon("src/image.jpg");
		JLabel background = new JLabel("",img,JLabel.CENTER);
		
		JPanel log = new JPanel();
		log.setSize(800,600);
//		log.setBackground(new Color(246,190,0));
		loginWindow.add(log);
		
		JLabel CMS = new JLabel("VERTIGO DEVELOPERS");
		CMS.setFont(new Font("Times New Roman", Font.ITALIC, 30));
		CMS.setForeground(Color.BLACK);
		CMS.setBounds(65,6,350,50);
		log.add(CMS);
		
		JLabel WEL = new JLabel("Welcome to login page!");
		WEL.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		WEL.setForeground(Color.orange);
		WEL.setBounds(125,45,350,30);
		log.add(WEL);
		
		JLabel loginType = new JLabel("Login type: ");
		loginType.setFont(new Font("Times New Roman", Font.BOLD, 16));
		loginType.setBounds(90,90,100,20);
		log.add(loginType);
		
	    String type[] = { "None","Manager","Retailer","Builder","Client","Supervisor","AcceptingAUTH"};
	    select = new JComboBox(type);
	    select.setFont(new Font("Times New Roman", Font.PLAIN, 16));
	    select.setBounds(200,90,100,22);
	    log.add(select);
		
		JLabel userID = new JLabel("User ID: ");
		userID.setBounds(90,130,100,20);
		userID.setFont(new Font("Times New Roman", Font.BOLD, 15));
		log.add(userID);
		
		id = new JTextField("");
	    id.setBounds(200,130,100,20);
	    log.add(id);
	    
		JLabel password = new JLabel("Password: ");
		password.setBounds(90,170,100,20);
		password.setFont(new Font("Times New Roman", Font.BOLD, 16));
		log.add(password);
		
		code = new JPasswordField("");
		code.setBounds(200,170,100,20);
		log.add(code);
		
		JButton enter = new JButton("Enter");
		enter.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		enter.setBounds(150,220,100,20);
		log.add(enter);
		
		message = new JLabel("");
		message.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		message.setBounds(100,250,400,20);
		message.setForeground(Color.BLACK);
		log.add(message);
		
		
		loginWindow.add(background);
		loginWindow.setSize(600,500);
		
		log.setLayout(null);
		loginWindow.setLayout(null);
		loginWindow.setVisible(true);
		select.addActionListener(this);
		enter.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		String type = (String) select.getSelectedItem();
		if(type.equals("Client") && e.getSource() == select) {
			new ClientGui();
		}
		else if(type.equals("Retailer") && e.getSource() == select) {
			new RetailerGui();
		}
		else {
			String username = id.getText();
			String password = String.valueOf(code.getPassword());
			UserLogin ul = new UserLogin();
			switch(type)
			{
				case("Client"): if((ul.clientLogin(username,password)).equals("Success")) {
										new ClientGui(username);
										loginWindow.dispose();
								}
								else if(e.getSource() != select){
										message.setText(ul.clientLogin(username,password));
								}
						 break;
				case("Retailer"): if((ul.retailerLogin(username,password)).equals("Success")) {
										new RetailerGui(username);
										loginWindow.dispose();
								}
										
								  else if(e.getSource() != select) {
									  message.setText(ul.retailerLogin(username, password));
								  }
						 break;
				case("Builder"): if((ul.builderLogin(username,password)).equals("Success")) {
										new BuilderGui(username);
										loginWindow.dispose();
								}
								else if(e.getSource() != select){
										message.setText(ul.builderLogin(username,password));
								}
						 break;
				case("Manager"):if((ul.managerLogin(username,password)).equals("Success")) {
										new ManagerGui(username);
										loginWindow.dispose();
								}
								else if(e.getSource() != select){
										message.setText(ul.managerLogin(username,password));
								}
						 break;
				case("Supervisor"): if((ul.supervisorLogin(username,password)).equals("Success")) {
											new SupervisorGui(username);
											loginWindow.dispose();
									}
									else if(e.getSource() != select){
											message.setText(ul.supervisorLogin(username,password));
									}
						 break;
				case("AcceptingAUTH"): if(username.equals("Anjana")  && password.equals("Anjana123")) {
											new AcceptingAuthorityGui();
											loginWindow.dispose();
									}
									else if(e.getSource() != select){
											message.setText("Incorrect username or password");
									}
						 break;		 
				case("None"): message.setText("Please select a LOGIN TYPE!");
				 		 break;		 
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Driver();

		
	}



}



