package com.practice;

import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner Scanner=new Scanner(System.in);
		 System.out.println("Simple Calculator");
		    System.out.println("1. Addition");
		    System.out.println("2. Subtraction");
		    System.out.println("3. Multiplication");
		    System.out.println("4. Division");
		    System.out.println("5. Modulus");

		    System.out.print("Enter your choice: ");
		    int choice = Scanner.nextInt();

		    System.out.print("Enter first number: ");
		    double num1 = Scanner.nextDouble();

		      System.out.print("Enter second number: ");
		      double num2 = Scanner.nextDouble();

		    switch (choice)
		    {
		      case 1:
		        System.out.println("Result: " + add(num1, num2));
		        break;
		      case 2:
		        System.out.println("Result: " + subtract(num1, num2));
		        break;
		      case 3:
		        System.out.println("Result: " + multiply(num1, num2));
		        break;
		      case 4:
		        System.out.println("Result: " + divide(num1, num2));
		        break;
		      case 5:
		        System.out.println("Result: " + modulus(num1, num2));
		        break;
		      default:
		        System.out.println("Invalid choice.");
		    }

		    Scanner.close();
		  }

		  private static double add(double num1, double num2)
		  {
		    return num1 + num2;
		  }

		  private static double subtract(double num1, double num2) 
		  {
		    return num1 - num2;
		  }

		  private static double multiply(double num1, double num2)
		  {
		    return num1 * num2;
		  }

		  private static double divide(double num1, double num2)
		  {
		    if (num2 != 0)
		    {
		      return num1 / num2;
		    } else
		    {
		      System.out.println("Error: Division by zero is not allowed.");
		    }
			return 0;
		  }

		  private static double modulus(double num1, double num2) {
		    if (num2 != 0) 
		    {
		      return num1 % num2;
		    } else 
		    {
		      System.out.println("Error: Modulus by zero is not allowed.");
		    }
			return 0;
		  }
		}
