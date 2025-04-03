package com.oops;
import java.util.Scanner;

public class minimum_value
{
	public static int findMini(int[] arr)
	{
		int Mini =  arr[0];
		for(int i=1; i< arr.length; i++)
		{
			if(arr[i]<Mini)
			{
				Mini = arr[i];
			}
		}
		return Mini;
	}
	
	public static void main(String[] args) 
	{
//		int[] arr= new int[5];
//		Scanner sc=new Scanner (System.in);
//		
//		
//		for(int i=0; i<5; i++)
//	    {
//			System.out.println("Enter a number :");
//			arr[i]=sc.nextInt();
//		}
//		
		int[] arr = {5,65,76,3,1};
		int MiniValue = findMini(arr);
		System.out.println("The minimum value in the array is :" +MiniValue);
	}
}