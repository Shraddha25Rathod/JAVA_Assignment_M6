package com.practice;


class CustomException extends Exception
{
    public CustomException(String message) 
    {
        super(message);
    }
}
public class CustomExceptionDemo 
{
	public static void main(String[] args)
	{
		try {
            validateAge(17); 
        } catch (CustomException e)
		{
            System.out.println("Caught Custom Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    public static void validateAge(int age) throws CustomException
    {
        if (age < 18) 
        {
            throw new CustomException("Age must be 18 or above!");
        } else 
        {
            System.out.println("Age is valid.");
        }
	}
}
