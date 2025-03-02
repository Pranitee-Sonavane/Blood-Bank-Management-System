package com.FMPA;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.FourMation.travels.AboutPage;
import com.FourMation.travels.PaymentPage;

public class home extends JFrame implements ActionListener
{

	JMenuItem mi1;
	JMenuItem mi2;
	JMenuItem mi4;
	JMenuItem mi5;
	JMenuItem mi6;
	JMenuItem mi7;
	JMenuItem mi8;
	//JMenuItem mi9;
	JMenuItem mi10;
	JMenuItem mi11;
	JMenuItem mi12;
	JMenuItem mi13;
	JButton b1;
	private String username;
	public static void main(String[] args) 
	{

		new home("").setVisible(true);
	}
	public home(String username)
	{
		super("Blood Bank Management System");
		this.username=username;
		setForeground(Color.CYAN);
		setLayout(null);

	
		
		  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("FMPAicons/home1.jpg")); 
		  Image i2 =i1.getImage().getScaledInstance(1800, 800, Image.SCALE_DEFAULT); 
		  ImageIcon i3 = new ImageIcon(i2); 
		  JLabel NewLabel = new JLabel(i3);
		  NewLabel.setBounds(0, 0, 1800, 800); 
		  add(NewLabel);
		 
		
		JLabel l1 = new JLabel("Blood Bank Management System");
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 70));
		l1.setBounds(150, 100, 2000, 200);
		NewLabel.add(l1);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		//Customer
		JMenu m1 = new JMenu("DONOR");
		m1.setForeground(Color.BLACK);
		menuBar.add(m1);

		mi1 = new JMenuItem("Add Donor");
		m1.add(mi1);
		mi1.addActionListener(this);
		
		mi13 = new JMenuItem("Request to Donate");
		m1.add(mi13);
		//mi3.addActionListener(this);

		mi2 = new JMenuItem("Update Donor Details");
		m1.add(mi2);
		mi2.addActionListener(this);

		mi4 = new JMenuItem("Delete Donor Details");
		m1.add(mi4);
		mi4.addActionListener(this);

		//packages
		JMenu m2 = new JMenu("INVENTORY");
		m2.setForeground(Color.BLACK);
		menuBar.add(m2);
		
		mi5 = new JMenuItem("Blood Inventory");
		m2.add(mi5);
		//mi5.addActionListener(this);

		
		
		//HotelsS
		JMenu m3 = new JMenu("HOSPITALS");
		m3.setForeground(Color.BLACK);
		menuBar.add(m3);
		
		mi8 = new JMenuItem("Hospitals");
		m3.add(mi8);
		mi8.addActionListener(this);

		/*mi9 = new JMenuItem("View Connected Hospitals");
		m3.add(mi9);
		//mi9.addActionListener(this);*/

		mi10 = new JMenuItem("Request for Blood");
		m3.add(mi10);
		//mi10.addActionListener(this);
		
		//Payment
		JMenu m4= new JMenu("PAYMENTS");
		m4.setForeground(Color.BLACK);
		menuBar.add(m4);
		
		mi11 = new JMenuItem("Make Payments");
		m4.add(mi11);
		mi11.addActionListener(this);
		
		//About
		JMenu m5= new JMenu("ABOUT");
		m5.setForeground(Color.BLACK);
		menuBar.add(m5);
		
		mi12 = new JMenuItem("About us");
		m5.add(mi12);
		mi12.addActionListener(this);
		
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
		getContentPane().setBackground(Color.BLACK);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==mi1)
		{
			new AddDonor(username).setVisible(true);
		}
		else if(e.getSource()==mi2)
		{
			new updatecustomer(username).setVisible(true);
		}
		else if(e.getSource()==mi4)
		{
			new deletedonor(username).setVisible(true);
		}
		else if(e.getSource()==mi11)
		{
			new payment().setVisible(true);
		}
		if(e.getSource()==mi12)
		{
			new about().setVisible(true);
		}
		if(e.getSource()==mi8)
		{
			new hospital().setVisible(true);
		}
		
		
		
	}
	
}
