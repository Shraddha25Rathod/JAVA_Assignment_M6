package com.comman;

import java.util.Scanner;

public class String_Maximum
{
    public static void main(String[] args)
    {
    	Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter a String...");
		
		String s1 = Scanner.nextLine();
		System.out.println("string is :"+s1);
		
        int maxLength = 100000; 

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxLength; i++)
        {
            sb.append('a');
        }
        String maxString = sb.toString();
        System.out.println("Maximum string length: " + maxString.length());

	}
}
