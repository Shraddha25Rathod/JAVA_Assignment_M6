package com.practice;
class Parent
{
    void displayMessage() 
    {
        System.out.println("Message from the Parent class.");
    }
}

class Child extends Parent 
{
    @Override
    void displayMessage() 
    {
        System.out.println("Message from the Child class.");
    }
}
public class polimorphismDemo
{
	public static void main(String[] args) 
	{
		 Parent obj = new Child(); 
	        obj.displayMessage();  
	}
}
