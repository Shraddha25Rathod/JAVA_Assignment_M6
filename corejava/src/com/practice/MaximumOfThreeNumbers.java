package com.practice;

class maximumNumber
{
	public static int findMaximum(int num1, int num2, int num3)
	{
        int max = num1; 
        if (num2 > max)
        {
            max = num2;
        }
        if (num3 > max)
        {
            max = num3;
        }
        return max;
    }
}
public class MaximumOfThreeNumbers 
{
	public static void main(String[] args) 
	{
		 int number1 = 45, number2 = 75, number3 = 60;
	        
	        int max = maximumNumber.findMaximum(number1, number2, number3);
	        
	        System.out.println("The maximum of " + number1 + ", " + number2 + ", and " + number3 + " is: " + max);
	}
}
