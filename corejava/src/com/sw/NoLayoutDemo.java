package com.sw;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class NDemo
{
	JFrame frame;
	JButton b1,b2,b3,b4;
	
	public NDemo()
	{
		frame=new JFrame("NDemo Demo");
		frame.setLayout(null);
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b1=new JButton("Insert");
		b1.setBounds(100,100,75,25);
		b2=new JButton("Updte");
		b1.setBounds(180,100,75,25);
		b3=new JButton("Delet");
		b1.setBounds(100,130,75,25);
		b4=new JButton("Display");
		b1.setBounds(180,130,75,25);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		
	}	
}
public class NoLayoutDemo 
{
	public static void main(String[] args) 
	{
		new NDemo();
	}
}
