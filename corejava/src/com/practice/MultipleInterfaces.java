package com.practice;
interface Animals
{
    void makeSound();
}

interface Pet 
{
    void play();
}
class Lion implements Animals, Pet
{
    @Override
    public void makeSound() 
    {
        System.out.println("The Lion says: aawww!");
    }

    @Override
    public void play() 
    {
        System.out.println("The Lion loves to play fetch!");
    }
}
public class MultipleInterfaces 
{
	public static void main(String[] args) 
	{
		Lion L = new Lion();
		
		L.makeSound();
		L.play();
	}
}
