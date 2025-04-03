package com.oops;

import java.util.Scanner;

public class maximumValue_1 
{

			public static int findMax(int[] arr)
			{
				int Max =  arr[0];
				for(int i=1; i< arr.length; i++)
				{
					if(arr[i]>Max)
					{
						Max = arr[i];
					}
				}
				return Max;
			}
			
			public static void main(String[] args)
			{
//				int[] arr= new int[5];
//				Scanner sc=new Scanner (System.in);
//				
//				
//				for(int i=0; i<5; i++)
//			    {
//					System.out.println("Enter a number :");
//					arr[i]=sc.nextInt();
//				}
//				
				int[] arr = {5,65,76,3,1};
				int maxValue = findMax(arr);
				System.out.println("The maximum value in the array is :" +maxValue);
			}
		
	
}
