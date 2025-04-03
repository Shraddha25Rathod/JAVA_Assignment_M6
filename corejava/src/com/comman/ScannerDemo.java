package com.comman;

import java.util.Scanner;
public class ScannerDemo
{
	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   Scanner sc1=new Scanner(System.in);
	   System.out.println("Enter no :");
	   int no=sc.nextInt();
	   
	   System.out.println("Enter single Character...");
	   char name=sc.next().charAt(0);
	   
	   System.out.println("Your No is ..."+no);
	   System.out.println("Your Name is.."+name);
	   
		
	}
}
