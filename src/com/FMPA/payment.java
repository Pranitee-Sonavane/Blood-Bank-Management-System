package com.FMPA;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;




public class payment extends JFrame implements ActionListener
{	
	public static void main(String[] args)
	{
		new payment().setVisible(true);
	}
	public payment()
	{
        
        setLayout(null);
        setBounds(600, 220, 800, 600);
        
        JLabel label=new JLabel("Pay the Payment");
        label.setFont(new Font("Raleway", Font.BOLD, 40));
        label.setBounds(50, 20, 350, 45);
        add(label);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("FMPAicons/Payment.png"));
        Image i8 = i7.getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel l4 = new JLabel(i9);
        l4.setBounds(0, 150, 800, 600);
        add(l4);
        
        JButton pay = new JButton("Pay");
        pay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Payment Done Successfully");
            }
        });
        pay.setBounds(420, 20, 80, 40);
        add(pay);
        
        JButton back=new JButton("Back");
        back.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) 
            {
                setVisible(false);
            }
        });
        back.setBounds(510, 20, 80, 40);
        add(back);
        
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);

    }
	@Override
	public void actionPerformed(ActionEvent ei) {
		
		dispose();
	}
}