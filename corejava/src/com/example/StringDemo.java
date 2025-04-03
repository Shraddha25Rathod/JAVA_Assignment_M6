package com.example;
import java.util.Scanner;
public class StringDemo 
{
	public static void main(String[] args)
	{
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		
		String input = Scanner.nextLine();
		int vowel=0; 
		int digit=0;
		int spaces=0; 
		int uppercase=0;
       int lowercase=0;
       
       String vowelset="AEIOUaeiou";
       
       for(char ch : input.toCharArray())
       {
    	   if(vowelset.indexOf(ch)!=-1)
    	   {
    	   else if(Character.isDigit(ch));
    	   }
       }
	}

		
	}
}
