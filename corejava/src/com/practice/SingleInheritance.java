package com.practice;

class Animal 
{
    public void voice() 
    {
        System.out.println("This animal voice...");
    }

	
}

class Dog extends Animal 
{
    public void bhowbhow() 
    {
        System.out.println("The dog bhow bhow...");
    }
}
class Cat extends Animal
{
	public void meawmeaw()
	{
		System.out.println("The cat meawmeaw...");
	}
}
public class SingleInheritance
{
	public static void main(String[] args) 
	{
		 Dog dog = new Dog();
		 Cat cat = new Cat();

	        
	        
	}
}
