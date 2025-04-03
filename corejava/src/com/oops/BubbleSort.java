package com.oops;

import java.util.Scanner;

public class BubbleSort 
{
	public static void bubblesort(int[]arr)
	{
		int n = arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int a = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] =a;
				}
			}
		}
	}
	
	public static void printArray(int[]arr)
	{
		for(int num : arr)
		{
			System.out.println();
		}
	}
	
	public static void main(String[]  args)
	{
		int[] arr= new int [5];
		Scanner sc=new Scanner(System.in);
		
		 for(int i=1; i<5; i++)
		 {
			 System.out.println("Enter no :");
			 arr[i]=sc.nextInt();
		 }
		printArray(arr);
		bubblesort(arr);
		
		System.out.println("Sorted array :");
		 printArray(arr);
	}
	
}
