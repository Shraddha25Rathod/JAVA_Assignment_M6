package com.practice;
class Vehicle 
{
    public void start() 
    {
        System.out.println("Vehicle is starting...");
    }
}

class FourWheeler extends Vehicle 
{
    public void drive() 
    {
        System.out.println("Four-wheeler is being driven...");
    }
}

class Car extends FourWheeler 
{
    public void park() 
    {
        System.out.println("Car is being parked...");
    }
}
public class MultilevelInheritance 
{
	public static void main(String[] args)
	{
		Car car = new Car();

        car.start();  
        car.drive();  
        car.park();
      }
}
