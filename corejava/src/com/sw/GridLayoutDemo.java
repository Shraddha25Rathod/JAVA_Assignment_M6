package com.sw;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class GDemo
{
	JFrame frame;
	JLabel l1,l2;
	JTextField t1;
	JPasswordField p1;
	JButton b1,b2;
	
	public GDemo()
	{
		frame=new JFrame("GDemo Demo");
		frame.setLayout(new FlowLayout());
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("Enter UserName");
		l2=new JLabel("Enter password");
		t1=new JTextField(15);
		p1=new JPasswordField(15);
		b1=new JButton("Login");
		b2=new JButton("cancle");
		frame.add(l1);
		frame.add(t1);
		frame.add(l2);
		frame.add(p1);
		frame.add(b1);
		frame.add(b2);
	}
}
public class GridLayoutDemo 
{
	public static void main(String[] args) 
	{
		new GDemo();
	}
}
