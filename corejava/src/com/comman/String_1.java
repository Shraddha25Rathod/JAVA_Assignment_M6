package com.comman;
import java.util.Scanner;

public class String_1 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String...");
        String s1 = scanner.nextLine();
        System.out.println("String is :" + s1);

        int constants = 0;
        int digit = 0;
        int Space = 0;
        int spaceCharacter = 0;

        for (int i = 0; i < s1.length(); i++) 
        {
            char ch = s1.charAt(i);
            if (Character.isLetter(ch)) 
            {
            	constants ++;
            } else if (Character.isDigit(ch)) 
            {
            	digit ++;
            } else if (Character.isSpaceChar(ch))
            {
            	Space ++;
            } else {
            	spaceCharacter ++;
            }
        }

        System.out.println("Constants: " + constants);
        System.out.println("Digits: " + digit);
        System.out.println("Spaces: " + Space);
        System.out.println("Special Characters: " + spaceCharacter);
    
	}
}