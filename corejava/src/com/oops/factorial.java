package com.oops;

import java.util.Scanner;

public class factorial
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no :");
		int no=sc.nextInt();
		int num = 50;
		int factorial = 1;
		
		for(int i =1; i <=num;i ++)
		{
			factorial*=i;
		}
		 System.out.println("factorial num...."+num);
	}
}
