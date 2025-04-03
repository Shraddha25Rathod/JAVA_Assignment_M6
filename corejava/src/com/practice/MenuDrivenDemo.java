package com.practice;
import java.util.Scanner;
public class MenuDrivenDemo 
{
	public static void main(String[] args) 
	{
		Scanner  Scanner = new Scanner(System.in);
		while (true) 
		{
		      System.out.println("Simple Menu-Driven Program");
		      System.out.println("1. Addition");
		      System.out.println("2. Subtraction");
		      System.out.println("3. Multiplication");
		      System.out.println("4. Division");
		      System.out.println("5. Exit");
		      System.out.print("Enter your choice: ");
		      int choice = Scanner.nextInt();

		      switch (choice) 
		      {
		        case 1:
		          addition(Scanner);
		          break;
		        case 2:
		          subtraction(Scanner);
		          break;
		        case 3:
		          multiplication(Scanner);
		          break;
		        case 4:
		          division(Scanner);
		          break;
		        case 5:
		          System.out.println("Exiting...");
		          Scanner.close();
		          System.exit(0);
		          break;
		        default:
		          System.out.println("Invalid choice. Please choose again.");
		      }
		    }
		  }

		  private static void addition(Scanner scanner)
		  {
		    System.out.print("Enter first number: ");
		    double num1 = scanner.nextDouble();
		    System.out.print("Enter second number: ");
		    double num2 = scanner.nextDouble();
		    System.out.println("Result: " + (num1 + num2));
		  }

		  private static void subtraction(Scanner scanner)
		  {
		    System.out.print("Enter first number:");
		    double num1 = scanner.nextDouble();
		    System.out.print("Enter second number: ");
		    double num2 = scanner.nextDouble();
		    System.out.println("Result: " + (num1 - num2));
		  }

		  private static void multiplication(Scanner scanner)
		  {
		    System.out.print("Enter first number: ");
		    double num1 = scanner.nextDouble();
		    System.out.print("Enter second number: ");
		    double num2 = scanner.nextDouble();
		    System.out.println("Result: " + (num1 * num2));
		  }

		  private static void division(Scanner scanner)
		  {
		    System.out.print("Enter first number: ");
		    double num1 = scanner.nextDouble();
		    System.out.print("Enter second number: ");
		    double num2 = scanner.nextDouble();
		    if (num2 != 0)
		    {
		      System.out.println("Result: " + (num1 / num2));
		    } else 
		    {
		      System.out.println("Error: Division by zero is not allowed.");
		    }
	}
}
