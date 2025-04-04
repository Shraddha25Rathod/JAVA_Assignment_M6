package com.practice;

public class MultipleCatchDemo 
{
	public static void main(String[] args)
	{
		 try {
	            int[] numbers = {1, 2, 3};
	            System.out.println(numbers[5]); 
	            int invalidNumber = Integer.parseInt("abc"); 

	        } catch (ArrayIndexOutOfBoundsException e) 
		 {
	            System.out.println("Exception caught: Invalid array index accessed.");

	        } catch (NumberFormatException e) 
		 {
	            System.out.println("Exception caught: Invalid number format.");

	        } catch (Exception e) 
		 {
	            System.out.println("Exception caught: General exception occurred.");
	        } finally 
		 {
	            System.out.println("Finally block executed: Cleaning up resources.");
	        }

	        System.out.println("Program continues after exception handling.");
	}
}
