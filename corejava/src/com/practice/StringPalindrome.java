package com.practice;
import java.util.Scanner;
public class StringPalindrome
{
	public static void main(String[] args)
	{
		Scanner Scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String original = Scanner.nextLine();

	        String reversed = reverseString(original);

	        if (original.equalsIgnoreCase(reversed))
	        {
	            System.out.println("The string \"" + original + "\" is a palindrome.");
	        } else {
	            System.out.println("The string \"" + original + "\" is not a palindrome.");
	        }
	    }

	    public static String reverseString(String input) 
	    {
	        StringBuilder reversed = new StringBuilder(input);
	        return reversed.reverse().toString();
	}
}
