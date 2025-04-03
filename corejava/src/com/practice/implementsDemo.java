package com.practice;
interface FlyingObject
{
    void fly();
}

interface Navigable 
{
    void navigate();
}

class Drone implements FlyingObject, Navigable 
{
    @Override
    public void fly() 
    {
        System.out.println("The drone is flying high in the sky.");
    }

    @Override
    public void navigate()
    {
        System.out.println("The drone is navigating using GPS.");
    }
}
public class implementsDemo
{
	public static void main(String[] args) 
	{
		 Drone drone = new Drone();

	        drone.fly();     
	        drone.navigate(); 
	}
}
