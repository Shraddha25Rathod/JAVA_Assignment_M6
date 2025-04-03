package com.practice;
import java.util.Scanner;
public class EvenOddNumber 
{
	public static void main(String[] args)
	{
		Scanner Scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
	    int number = Scanner.nextInt();

	    if (number % 2 == 0) 
	    {
	      System.out.println(number + " is even.");
	    } else
	    {
	      System.out.println(number + " is odd.");
	    }
	}
}
