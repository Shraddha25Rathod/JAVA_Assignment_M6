package com.practice;
class Animal1
{
    public void eat() 
    {
        System.out.println("This animal eats food.");
    }

    public void sleep() 
    {
        System.out.println("This animal sleeps.");
    }
}

class Bafelo extends Animal1 
{
    public void grass()
    {
        System.out.println("The eat grass.");
    }
}
public class Inheritance
{
	public static void main(String[] args) 
	{
		Bafelo B = new Bafelo();

        B.eat();  
        B.sleep(); 
        B.grass();
	}
}
