package com.ex;
import java.util.Scanner;
public class ExceptionDemo1
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter no1..  :");
			int a=sc.nextInt();
			System.out.println("Enter no2..  :");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println("Your Answer is.."+c);
			System.out.println("Your proram is completed..");
			
			//system.gc();
		}
		catch(Exception e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}
		finally
		{
			System.out.println("This Program is devloped by :");
			System.out.println("Shraddha Rathod");
			System.out.println("Mo : 7990383279");
		}
	}
}
