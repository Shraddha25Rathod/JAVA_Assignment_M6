package com.oops;

import java.util.Scanner;

public class Array_2 
{
	public static void main(String[] args) 
	{
		int[][] a=new int[3][3];
		int[][] b=new int[3][3];
		int[][] c=new int[3][3];
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Now start A array..");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter value  for a :");
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
      System.out.println(" Now start  b  array..");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter value  for b :");
				b[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("Now start Summation..");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
