package com.practice;
/*Relational Calculator Program*/
import java.util.Scanner;

public class CalculatorDemo
{
	public static void main(String[] args)
	{
		Scanner Scanner = new Scanner(System.in);
		 System.out.println("Relational Calculator");
		    System.out.println("1. Equal To (==)");
		    System.out.println("2. Not Equal To (!=)");
		    System.out.println("3. Greater Than (>)");
		    System.out.println("4. Less Than (<)");
		    System.out.println("5. Greater Than or Equal To (>=)");
		    System.out.println("6. Less Than or Equal To (<=)");

		    System.out.print("Enter your choice: ");
		    int choice = Scanner.nextInt();

		    System.out.print("Enter first number: ");
		    double num1 = Scanner.nextDouble();

		    System.out.print("Enter second number: ");
		    double num2 = Scanner.nextDouble();

		    switch (choice) 
		    {
		      case 1:
		        System.out.println("Is " + num1 + " equal to " + num2 + (num1 == num2));
		        break;
		      case 2:
		        System.out.println("Is " + num1 + " not equal to " + num2 +  (num1 != num2));
		        break;
		      case 3:
		        System.out.println("Is " + num1 + " greater than " + num2  + (num1 > num2));
		        break;
		      case 4:
		        System.out.println("Is " + num1 + " less than " + num2 +  (num1 < num2));
		        break;
		      case 5:
		        System.out.println("Is " + num1 + " greater than or equal to " + num2 +  (num1 >= num2));
		        break;
		      case 6:
		        System.out.println("Is " + num1 + " less than or equal to " + num2 +  (num1 <= num2));
		        break;
		      default:
		        System.out.println("Invalid choice.");
		    }

		    Scanner.close();
	}
}
