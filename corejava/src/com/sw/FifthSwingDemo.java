package com.sw;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class Fifth
{
	JFrame frame;
	JMenuBar bar;
	JMenu file,edit;
	JMenuItem New,open,save,cut,paste,copy;
	
	public Fifth()
	{
		frame=new JFrame("Fifth Demo");
		frame.setLayout(new FlowLayout());
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		New=new JMenuItem("new");
		open=new JMenuItem("open");
		save=new JMenuItem("save");
		
		file=new JMenu("file");
		file.add(New);
		file.add(open);
		file.add(save);
		
		cut=new JMenuItem("cut");
		copy = new JMenuItem("copy");
		paste=new JMenuItem("paste");
		
		edit=new JMenu("edit");
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		
		bar=new JMenuBar();
		bar.add(file);
		bar.add(edit);
		
		frame.add(bar);
	}
}
public class FifthSwingDemo 
{
	public static void main(String[] args)
	{
		new Fifth();
	}
}
