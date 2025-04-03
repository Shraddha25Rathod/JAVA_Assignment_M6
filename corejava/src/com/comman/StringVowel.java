package com.comman;

import java.util.Scanner;

public class StringVowel 

{
	public static void main(String[] args)
	{
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter a String...");
		
		String s1 = Scanner.nextLine();
	    int vowelCout=0;
	    
	    s1=s1.toLowerCase();
	    for(int i=0;i<s1.length();i++)
	    {
	    	char ch = s1.charAt(i);
	    	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' ||ch == 'U' )
	    	{
	    		System.out.println("vowel");
	    	}else
	    	{
	    		System.out.println("consolances");
	    	}
	    	
	    	System.out.println();
	    }
	}
}
