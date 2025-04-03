package com.sw;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


class Second1 implements ItemListener
{
	JFrame frame;
	JCheckBox c1,c2,c3;
	JLabel msg;
	public Second1()
	{
		frame=new JFrame("First Demo");
		frame.setLayout(new FlowLayout());
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c1=new JCheckBox("Cricket");
		c2=new JCheckBox("Caroom");
		c3=new JCheckBox("Chess");
		
		msg = new JLabel("");
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		
		frame.add(c1);
		frame.add(c2);
		frame.add(c3);
		frame.add(msg);
	}
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		msg.setText(((JCheckBox)e.getSource()).getText()+"checkBox is"+(e.getStateChange()==1?"checked..":"Unchecked.."));
	}
	
}
public class secondSwing
{
	public static void main(String[] args) 
	{
		new Second1();
	}
}
