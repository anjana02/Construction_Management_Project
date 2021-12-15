package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import actorClasses.AcceptingAuthority;
import driver.homepage;

public class AcceptingAuthorityGui implements ActionListener {
	JFrame authorityWindow =null;
	JButton exit=null;
	JPanel p1=null;
	JPanel p2=null;
	JTextField tf1=null;
	JTextField tf2=null;
	JTextField tf3=null;
	JTextField tf4=null;
	JTextField tf5=null;
	JTextField tf6=null;
	JButton b1= new JButton("Assigns");
	JButton b2= new JButton("Assigns");
	AcceptingAuthority a=new AcceptingAuthority();
	public AcceptingAuthorityGui()
	{
		
		
	    authorityWindow = new JFrame();
		JLabel background = new JLabel("",JLabel.CENTER);
        
        String data1[][]= a.getRetailers(); 		
        // add code part and return
        String column1[]= {"Id","Name","State","Service Rating"};      			
        // add code part and return
        String data2[][]= a.viewSubcontracts(); 		
        // add code part and return 
        String column2[]= {"Site Id","Material Model","Material Name"};    			 
		JPanel p6=new JPanel();
		p6.setBounds(540, 440, 420, 220);
		p6.setBackground(new Color(255, 250, 250));
		authorityWindow.getContentPane().add(p6);
		p6.setLayout(null);
		JPanel p3=new JPanel();
		p6.add(p3);
		JLabel l3=new JLabel("Retailer Rating");
		l3.setBounds(30, 5, 80, 50);
		l3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		p3.add(l3);
		p3.setBounds(333, 48, 437, 30);
		p3.setBackground(Color.ORANGE);
		JTable t2=new JTable(data2,column2);
		JScrollPane sp2=new JScrollPane(t2);
		p6.add(sp2);
		sp2.setBounds(805, 88, 420, 328);
		sp2.setViewportView(t2);
		p2=new JPanel(new BorderLayout());
		sp2.setRowHeaderView(p2);
		p2.setBounds(540, 90, 420, 350);
		p2.setBackground(new Color(211,211,211));
		JPanel p4=new JPanel();
		p6.add(p4);
		p4.setBounds(805, 48, 420, 30);
		p4.setBackground(Color.ORANGE);
		JLabel l4=new JLabel("Sub Contracts");
		p4.add(l4);
		l4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		exit = new JButton("Exit");
		exit.setBackground(Color.DARK_GRAY);
		p6.add(exit);
		exit.setBounds(1258,48,90,30);
		exit.setForeground(Color.WHITE);
		exit.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JPanel p5=new JPanel();
		p6.add(p5);
		
		p5.setBounds(333, 432, 437, 227);
		p5.setBackground(Color.LIGHT_GRAY);
		p5.setLayout(null);
		
		tf1=new JTextField("");
		p5.add(tf1);
		tf1.setBounds(281, 25, 100, 20);
		JLabel lb2=new JLabel("Retailer Id:");
		p5.add(lb2);
		lb2.setBounds(155, 25, 100, 20);
		lb2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		
		JLabel lb1=new JLabel("Assigns  :");
		p5.add(lb1);
		
		
		lb1.setBounds(31, 10, 100, 20);
		lb1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		tf2=new JTextField("");
		p5.add(tf2);
		tf2.setBounds(281, 70, 100, 20);
		JLabel lb3=new JLabel("To :");
		p5.add(lb3);
		lb3.setBounds(31, 53, 100, 20);
		lb3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		JLabel lb4=new JLabel("Site Id:");
		p5.add(lb4);
		lb4.setBounds(185, 68, 56, 20);
		lb4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		tf5=new JTextField("");
		p5.add(tf5);
		tf5.setBounds(281, 116, 100, 20);
		
		JLabel lb9=new JLabel("Material Model:");
		p5.add(lb9);
		lb9.setBounds(135, 114, 120, 20);
		lb9.setFont(new Font("Times New Roman", Font.BOLD, 15));
		tf6=new JTextField("");
		p5.add(tf6);
		tf6.setBounds(281, 158, 100, 20);
		JLabel lb10=new JLabel("Material Name:");
		p5.add(lb10);
		lb10.setBounds(135, 156, 120, 20);
		lb10.setFont(new Font("Times New Roman", Font.BOLD, 15));
		b1.setFont(new Font("Tahoma", Font.BOLD, 10));
		b1.setBackground(Color.WHITE);
		p5.add(b1);
		
		b1.setBounds(203, 186, 100, 30);
		b1.addActionListener(this);
		// add code part and return
		
		JTable t1=new JTable(data1,column1);
		t1.setBounds(5,70,20,50);
		JScrollPane sp1=new JScrollPane(t1);
		p6.add(sp1);
		sp1.setBounds(333, 88, 437, 328);
		t1.setBounds(10,60,350,150);
		
		p1=new JPanel(new BorderLayout());
		sp1.setColumnHeaderView(p1);
		p1.setBounds(30, 90, 420, 350);
		p1.setBackground(new Color(211,211,211));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 280, 669);
		p6.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("VERTIGO");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1.setBounds(114, 50, 155, 42);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\91949\\Downloads\\Java-project-main (1)\\Java-project-main\\Java-source-code\\src\\icon.png"));
		lblNewLabel.setBounds(10, 31, 94, 74);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(805, 432, 429, 227);
		p6.add(panel_1);
		panel_1.setLayout(null);
		JLabel lb5=new JLabel("Assigns :");
		lb5.setBounds(31, 25, 100, 20);
		panel_1.add(lb5);
		lb5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		tf3=new JTextField("");
		tf3.setBounds(269, 48, 100, 20);
		panel_1.add(tf3);
		b2.setFont(new Font("Tahoma", Font.BOLD, 10));
		b2.setBackground(Color.WHITE);
		b2.setBounds(227, 163, 100, 30);
		panel_1.add(b2);
		JLabel lb8=new JLabel("Project Id:");
		lb8.setBounds(159, 46, 100, 20);
		panel_1.add(lb8);
		lb8.setFont(new Font("Times New Roman", Font.BOLD, 15));
		JLabel lb6=new JLabel("Subcontract Id:");
		lb6.setBounds(109, 105, 150, 20);
		panel_1.add(lb6);
		lb6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		tf4=new JTextField("");
		tf4.setBounds(269, 107, 100, 20);
		panel_1.add(tf4);
		JLabel lb7=new JLabel("To :");
		lb7.setBounds(31, 77, 100, 20);
		panel_1.add(lb7);
		lb7.setFont(new Font("Times New Roman", Font.BOLD, 15));
		b2.addActionListener(this);
		exit.addActionListener(this);
		
		authorityWindow.getContentPane().add(background, BorderLayout.SOUTH);
		//authorityWindow.setLayout(null);
		authorityWindow.setSize(1372,706);
		authorityWindow.setTitle("Accepting Authority");
		authorityWindow.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AcceptingAuthorityGui();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==exit)
		{
			homepage hobj = new homepage();
			hobj.setVisible(true);
			authorityWindow.dispose();
		}
		else if(e.getSource()==b1)
		{
			String rId=tf1.getText();
			String siteId=tf2.getText();
			String materialModel=tf5.getText();
			String materialName=tf6.getText();
			a.approveRawMaterial(rId, siteId, materialModel, materialName);
			JFrame frame= new JFrame("Message");
			JOptionPane.showMessageDialog(frame, "Assigned Successfully!");
		}
		else if(e.getSource()==b2)
		{
			String pId=tf4.getText();
			a.approveSubcontracts(pId);
			JFrame frame1= new JFrame("Message");
			JOptionPane.showMessageDialog(frame1, "Assigned Successfully!");
		}
		
	}
}
