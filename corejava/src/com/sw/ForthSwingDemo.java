package com.sw;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollBar;

class Forth
{
	JFrame frame;
	JScrollBar h;
	JScrollBar v;
	public Forth()
	{
		frame=new JFrame("First Demo");
		frame.setLayout(new FlowLayout());
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		h=new JScrollBar(JScrollBar.HORIZONTAL,1,5,0,100);
		v=new JScrollBar(JScrollBar.VERTICAL,1,5,0,100);
		
		frame.add(h);
		frame.add(v);
	}
}
public class ForthSwingDemo 
{
	public static void main(String[] args)
	{
		new Forth();
	}
}
