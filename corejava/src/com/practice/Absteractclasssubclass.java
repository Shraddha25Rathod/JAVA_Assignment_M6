package com.practice;
abstract class Creature 
{
    public abstract void makeSound();

    
    public void rest() {
        System.out.println("Resting...");
    }
}

class Canine extends Creature
{
    @Override
    public void makeSound()
    {
        System.out.println("Woof!");
    }
}

class Feline extends Creature 
{
    @Override
    public void makeSound() 
    {
        System.out.println("Meow!");
    }
}
public class Absteractclasssubclass 
{
	 public static void main(String[] args)
	 {
	        
	        Creature canine = new Canine();
	        Creature feline = new Feline();

	        canine.makeSound(); 
	        canine.rest();     
	        
	        feline.makeSound(); 
	        feline.rest();      
	    }
}
