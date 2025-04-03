package com.practice;
abstract class Animal2 
{
    abstract void makeSound();

    void eat() 
    {
        System.out.println("This animal eats food.");
    }
}

class Tiger extends Animal2
{
    @Override
    void makeSound() 
    {
        System.out.println("The Tigher says: aaawww!");
    }
}
public class Absteractclass 
{
	public static void main(String[] args) 
	{
		 Animal2 T = new Tiger();

	        T.makeSound();

	        T.eat();
	}
}
