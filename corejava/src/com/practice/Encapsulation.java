package com.practice;
class Person 
{
    private String name;
    private int age;

    public String getName() 
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        if (age > 0) 
        { 
            this.age = age;
        } else 
        {
            System.out.println("Age must be positive!");
        }
    }
}
public class Encapsulation 
{
	public static void main(String[] args)
	{
		Person person = new Person();

        person.setName("Shraddha");
        person.setAge(21);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        person.setAge(-5); 
	}
}
