package com.practice;
import java.util.Scanner;
public class StringComparison 
{
	public static void main(String[] args) 
	{
		Scanner Scanner = new Scanner(System.in);
		 System.out.print("Enter the first string: ");
	        String string1 = Scanner.nextLine();

	        System.out.print("Enter the second string: ");
	        String string2 = Scanner.nextLine();

	        if (string1.equals(string2))
	        {
	            System.out.println("The strings are equal (using equals()).");
	        } else {
	            System.out.println("The strings are not equal (using equals()).");
	        }

	        int result = string1.compareTo(string2);
	        if (result == 0) {
	            System.out.println("The strings are equal (using compareTo()).");
	        } else if (result > 0) {
	            System.out.println("The first string is lexicographically greater (using compareTo()).");
	        } else {
	            System.out.println("The first string is lexicographically smaller (using compareTo()).");
	        }
	}
}
