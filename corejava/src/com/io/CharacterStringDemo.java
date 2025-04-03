package com.io;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class CharacterStringDemo 
{
	public static void main(String[] args) 
	{
		try {
			FileWriter fw=new FileWriter("a2.txt");
			String s="This is Tops Tr=echnologies...";
			byte[] b=s.getBytes();
			fw.write(s);
			fw.flush();
			fw.close();
			System.out.println("Data Write....");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
		
		try {
			FileReader fr=new FileReader("a2.txt");
			int x;
			while((x=fr.read()) != -1)
			{
				System.out.print((char)x);
			}
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}