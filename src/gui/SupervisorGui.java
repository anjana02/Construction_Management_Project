package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import actorClasses.*;

public class SupervisorGui implements ActionListener{
	JFrame SupWindow = null;
	JButton exit = null;
	JTextField site = null;
	JTextField matName = null;
	JTextField matModel = null;
	JTextField builderID= null;
	JTextField projectID = null;
	JTextField pno = null;
	JTextField contractName = null;
	JTextField companyName  = null;
	JTextField contactno  = null;
	
	JTextField materialQty  = null;
	JTextField reorderLevel  = null;
	JTextField avilableQty  = null;
	
	JButton allocateSubCon = null;
	JButton showProjectStat = null;
	JButton trackBuilder = null;
	JButton getRawMat = null;
	JButton allocateRawMat = null;

	String sid = null;
	Supervisor s1 = null;
		public SupervisorGui(String username){
			SupWindow = new JFrame("Supervisor");
			ImageIcon img = new ImageIcon("src/images/image.jpg");
			JLabel background = new JLabel("",img,JLabel.CENTER);
			background.setBackground(Color.WHITE);
			sid = username;
			s1 = new Supervisor(sid);
			
			JLabel userType = new JLabel("Supervisor");
			userType.setBounds(395,119,200,20);
			userType.setForeground(Color.BLACK);
			userType.setFont(new Font("Times New Roman", Font.BOLD, 18));
			SupWindow.getContentPane().add(userType);
			
			JPanel p1 = new JPanel();
			p1.setBounds(270,149,380,342);
			p1.setBackground(Color.ORANGE);
			SupWindow.getContentPane().add(p1);
			
			JLabel AllocateRaw = new JLabel("Allocate Raw Materials");
			AllocateRaw.setBounds(76,10,200,37);
			AllocateRaw.setForeground(Color.BLACK);
			AllocateRaw.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
			p1.add(AllocateRaw);
			
			JLabel sitel = new JLabel("Site ID");
			sitel.setBounds(76,57,94,20);
			sitel.setForeground(Color.BLACK);
			sitel.setFont(new Font("Times New Roman", Font.BOLD, 18));
			p1.add(sitel);
			
			site = new JTextField("");
			site.setBounds(200,58,100,20);
			site.setForeground(Color.DARK_GRAY);
			site.setFont(new Font("Times New Roman", Font.ITALIC, 16));
			p1.add(site);
			
			JLabel mName = new JLabel("Material name");
			mName.setBounds(24,87,128,20);
			mName.setForeground(Color.BLACK);
			mName.setFont(new Font("Times New Roman", Font.BOLD, 18));
			p1.add(mName);
			
			matName = new JTextField("");
			matName.setBounds(200,88,100,20);
			matName.setForeground(Color.DARK_GRAY);
			matName.setFont(new Font("Times New Roman", Font.ITALIC, 16));
			p1.add(matName);
			
			JLabel mModel = new JLabel("Material model");
			mModel.setBounds(15,117,128,20);
			mModel.setForeground(Color.BLACK);
			mModel.setFont(new Font("Times New Roman", Font.BOLD, 18));
			p1.add(mModel);
			
			matModel = new JTextField("");
			matModel.setBounds(200,118,100,20);
			matModel.setForeground(Color.DARK_GRAY);
			matModel.setFont(new Font("Times New Roman", Font.ITALIC, 16));
			p1.add(matModel);
			
			JLabel matQty = new JLabel("Material quantity");
			matQty.setBounds(15,159,163,20);
			matQty.setForeground(Color.BLACK);
			matQty.setFont(new Font("Times New Roman", Font.BOLD, 18));
			p1.add(matQty);
			
			materialQty = new JTextField("");
			materialQty.setBounds(200,160,100,20);
			materialQty.setForeground(Color.DARK_GRAY);
			materialQty.setFont(new Font("Times New Roman", Font.ITALIC, 16));
			p1.add(materialQty);
			
			JLabel rlvl = new JLabel("Reorder level");
			rlvl.setBounds(33,193,137,20);
			rlvl.setForeground(Color.BLACK);
			rlvl.setFont(new Font("Times New Roman", Font.BOLD, 18));
			p1.add(rlvl);
			
			reorderLevel = new JTextField("");
			reorderLevel.setBounds(200,194,100,20);
			reorderLevel.setForeground(Color.DARK_GRAY);
			reorderLevel.setFont(new Font("Times New Roman", Font.ITALIC, 16));
			p1.add(reorderLevel);
			
			JLabel avlQty = new JLabel("Available quantity");
			avlQty.setBounds(15,237,155,20);
			avlQty.setForeground(Color.BLACK);
			avlQty.setFont(new Font("Times New Roman", Font.BOLD, 18));
			p1.add(avlQty);
			
			avilableQty = new JTextField("");
			avilableQty.setBounds(200,238,100,20);
			avilableQty.setForeground(Color.DARK_GRAY);
			avilableQty.setFont(new Font("Times New Roman", Font.ITALIC, 16));
			p1.add(avilableQty);
			
			allocateRawMat = new JButton("Allocate");
			allocateRawMat.setBounds(100, 285, 128, 31);
			p1.add(allocateRawMat);
			
			JPanel p2 = new JPanel();
			p2.setBounds(715,149,380,342);
			p2.setBackground(Color.ORANGE);
			SupWindow.getContentPane().add(p2);
			
			JLabel allocateSub = new JLabel("Allocate Sub-Contracts");
			allocateSub.setBounds(71,10,214,32);
			allocateSub.setForeground(Color.BLACK);
			allocateSub.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
			p2.add(allocateSub);
			
			JLabel pnum = new JLabel("Project ID");
			pnum.setBounds(15,62,127,20);
			pnum.setForeground(Color.BLACK);
			pnum.setFont(new Font("Times New Roman", Font.BOLD, 18));
			p2.add(pnum);
			
			pno = new JTextField("");
			pno.setBounds(200,63,100,20);
			pno.setForeground(Color.DARK_GRAY);
			pno.setFont(new Font("Times New Roman", Font.ITALIC, 16));
			p2.add(pno);
			
			JLabel conName = new JLabel("Contract name");
			conName.setBounds(15,109,148,20);
			conName.setForeground(Color.BLACK);
			conName.setFont(new Font("Times New Roman", Font.BOLD, 18));
			p2.add(conName);
			
			contractName = new JTextField("");
			contractName.setBounds(200,110,100,20);
			contractName.setForeground(Color.DARK_GRAY);
			contractName.setFont(new Font("Times New Roman", Font.ITALIC, 16));
			p2.add(contractName);
			
			JLabel comName = new JLabel("Company name");
			comName.setBounds(15,149,163,20);
			comName.setForeground(Color.BLACK);
			comName.setFont(new Font("Times New Roman", Font.BOLD, 18));
			p2.add(comName);
			
			companyName = new JTextField("");
			companyName.setBounds(200,150,100,20);
			companyName.setForeground(Color.DARK_GRAY);
			companyName.setFont(new Font("Times New Roman", Font.ITALIC, 16));
			p2.add(companyName);
			
			JLabel comCon = new JLabel("Company number");
			comCon.setBounds(24,191,153,20);
			comCon.setForeground(Color.BLACK);
			comCon.setFont(new Font("Times New Roman", Font.BOLD, 18));
			p2.add(comCon);
			
			contactno = new JTextField("");
			contactno.setBounds(200,192,100,20);
			contactno.setForeground(Color.DARK_GRAY);
			contactno.setFont(new Font("Times New Roman", Font.ITALIC, 16));
			p2.add(contactno);
			
			JLabel bid = new JLabel("BuilderID");
			bid.setBounds(29,234,148,20);
			bid.setForeground(Color.BLACK);
			bid.setFont(new Font("Times New Roman", Font.BOLD, 18));
			p2.add(bid);
			
			builderID = new JTextField("");
			builderID.setBounds(200,235,100,20);
			builderID.setForeground(Color.DARK_GRAY);
			builderID.setFont(new Font("Times New Roman", Font.ITALIC, 16));
			p2.add(builderID);
			
			allocateSubCon = new JButton("Allocate");
			allocateSubCon.setBounds(137, 294, 148, 22);
			p2.add(allocateSubCon);
			
			background.setBounds(228,106,949,545);
			SupWindow.getContentPane().add(background);
			SupWindow.setSize(1191,688);
			p1.setLayout(null);
			p2.setLayout(null);
			SupWindow.getContentPane().setLayout(null);
			
			JPanel panel = new JPanel();
			panel.setBackground(Color.BLACK);
			panel.setBounds(0, 0, 1177, 107);
			SupWindow.getContentPane().add(panel);
			panel.setLayout(null);
			
			exit = new JButton("Exit");
			exit.setBounds(1038, 61, 108, 36);
			panel.add(exit);
			exit.setForeground(Color.BLACK);
			exit.setFont(new Font("Times New Roman", Font.BOLD, 15));
			JLabel user = new JLabel("Welcome! "+ s1.name);
			user.setBounds(765, 10, 206, 43);
			panel.add(user);
			user.setForeground(Color.WHITE);
			user.setFont(new Font("Times New Roman", Font.BOLD, 20));
			
			JLabel lblNewLabel_1 = new JLabel("VERTIGO");
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
			lblNewLabel_1.setBounds(131, 33, 155, 42);
			panel.add(lblNewLabel_1);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\91949\\Downloads\\Java-project-main (1)\\Java-project-main\\Java-source-code\\src\\icon.png"));
			lblNewLabel.setBounds(10, 10, 94, 87);
			panel.add(lblNewLabel);
			
			exit.addActionListener(this);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBackground(Color.GRAY);
			panel_1.setBounds(0, 106, 226, 535);
			SupWindow.getContentPane().add(panel_1);
			panel_1.setLayout(null);
			
			getRawMat = new JButton("Get raw materials");
			getRawMat.setBounds(10, 69, 178, 36);
			panel_1.add(getRawMat);
			getRawMat.setFont(new Font("Times New Roman", Font.BOLD, 14));
			
			showProjectStat = new JButton("Get projects status");
			showProjectStat.setFont(new Font("Times New Roman", Font.BOLD, 14));
			showProjectStat.setBounds(10, 172, 178, 36);
			panel_1.add(showProjectStat);
			
			trackBuilder = new JButton("Track builder status");
			trackBuilder.setFont(new Font("Times New Roman", Font.BOLD, 14));
			trackBuilder.setBounds(10, 284, 178, 36);
			panel_1.add(trackBuilder);
			trackBuilder.addActionListener(this);
			showProjectStat.addActionListener(this);
			getRawMat.addActionListener(this);
			SupWindow.setVisible(true);
			allocateSubCon.addActionListener(this);
			allocateRawMat.addActionListener(this);
		}
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource().equals(exit)) {
				SupWindow.dispose();
			}

			if(e.getSource().equals(allocateRawMat)) {
				s1.allocateRawMaterials(site.getText(), matName.getText(), matModel.getText(),Integer.parseInt(materialQty.getText()),Integer.parseInt(reorderLevel.getText()),Integer.parseInt(avilableQty.getText()));

			}
			if(e.getSource().equals(allocateSubCon)) {
				s1.allocateSubcontracts(pno.getText(), contractName.getText(), companyName.getText(), Long.parseLong(contactno.getText()));
			}
			if(e.getSource().equals(showProjectStat)) {
				JFrame frame= new JFrame("Projects Status");
				String[] columns = {"builder_id", "project_no", "completion_status" };
				JTable table = new JTable(s1.projectStatus(builderID.getText()),columns);
				JScrollPane scroll = new JScrollPane(table);
				scroll.setSize(300,100);
				frame.getContentPane().add(scroll);
				frame.setSize(500,300);
				frame.setVisible(true);
			}
			if(e.getSource().equals(trackBuilder)) {
				JFrame frame= new JFrame("Track builder");
				String[] columns = {"builder_id", "no_of_projects"," total_hours"};
				JTable table = new JTable(s1.builderPerformanceTracking(),columns);
				JScrollPane scroll = new JScrollPane(table);
				scroll.setSize(300,100);
				frame.getContentPane().add(scroll);
				frame.setSize(500,300);
				frame.setVisible(true);
			}
			if(e.getSource().equals(getRawMat)) {
				JFrame frame= new JFrame("Raw materials");
				String[] columns = {"material_name","material_model","material_type" ,"manufacturer"};
				JTable table = new JTable(s1.getRawMaterials(),columns);
				JScrollPane scroll = new JScrollPane(table);
				scroll.setSize(300,100);
				frame.getContentPane().add(scroll);
				frame.setSize(500,300);
				frame.setVisible(true);
			}
		}
}
