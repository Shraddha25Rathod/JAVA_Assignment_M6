package com.oops;

import java.util.Scanner;

public class prime_number 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no :");
		int no=sc.nextInt();
		for(int i=1;i<=i/2;i++)
		{
		int	prime = 0;
		{
			for(int j=2;j<=i/2;j++)
			{
				if(i%j == 0)
				{
					prime++;
				}
			}
			if(prime<0)
			{
				System.out.println(i);
			}
		}
	}
	}
}
