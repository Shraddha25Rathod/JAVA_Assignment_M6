package com.oops;

import java.util.Scanner;

public class palidrom_no 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no :");
		int no=sc.nextInt();
		int copy=no,sum=0;
		while(no > 0)
		{
			int t = no%10;
			sum = sum+(t*t*t);
			no=no/10;
			sum=(sum*10)+t;
		}
		if(sum == copy)
		{
			System.out.println("your no is Palidrom..."+ sum);
		}
		else
		{
			System.out.println("your no is not an Palidrom..."+sum);
		}
	}
}
