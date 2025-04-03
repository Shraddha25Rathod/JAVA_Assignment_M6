package com.practice;

public class exceptionhandlingDemo 
{
    public static void main(String[] args) 
    {
        int numerator = 10;
        int denominator = 0; 
        try 
        {
            int result = numerator / denominator; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) 
        {
            System.out.println("Exception caught: Division by zero is not allowed.");
        } finally 
        {
            System.out.println("Finally block executed: Cleaning up resources.");
        }

        System.out.println("Program continues after exception handling.");
}
}
