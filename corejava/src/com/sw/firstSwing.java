package com.sw;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

 class first1 implements ActionListener
{
	JFrame frame;
	JLabel l1,msg;
	JTextField t1;
    JButton b1;
    public first1()
	{
		frame=new JFrame("First Demo");
		frame.setLayout(new FlowLayout());
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("Enter your name :");
		msg=new JLabel(" ");
		t1=new JTextField(15);
		b1=new JButton ("Display");
		frame.add(l1);
		frame.add(t1);
		frame.add(b1);
		frame.add(msg);
	}
    
	@Override
	public void actionPerformed(ActionEvent e)
	{
//		if(e.getSource()==b1);
	//	{
	//	msg.setText(t1.getText());
	//    }
		if(e.getActionCommand().equalsIgnoreCase("display"));
		{
			msg.setText(t1.getText());
		}
	}
	
}
public class firstSwing
{
	public static void main(String[] args)
	{
		new first1();
	}
}
