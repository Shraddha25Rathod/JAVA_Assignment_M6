package com.practice;
import java.util.Scanner;
public class FibonaccieDemo 
{
	public static void main(String[] args)
	{
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("Enter your number");
		int n=Scanner.nextInt();
		
		int num1=0;
		int num2=1;
		
		System.out.println("Fibonaccie Number ");
		for(int i=1;i<=n;i++);
		{
			System.out.println(num1+" ");
			int sum = num1+num2;
			num1=num2;
			num2=sum;
		}
	}
}
