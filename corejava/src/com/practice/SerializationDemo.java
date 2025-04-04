package com.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable 
{
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() 
    {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
public class SerializationDemo
{
	 public static void main(String[] args) 
	 {
	        String filename = "person.ser"; 

	        Person person = new Person("Shraddha", 21);

	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
	            oos.writeObject(person);
	            System.out.println("Object serialized: " + person);
	        } catch (IOException e) 
	        {
	            System.out.println("Serialization failed: " + e.getMessage());
	        }

	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) 
	        {
	            Person deserializedPerson = (Person) ois.readObject();
	            System.out.println("Object deserialized: " + deserializedPerson);
	        } catch (IOException | ClassNotFoundException e) 
	        {
	            System.out.println("Deserialization failed: " + e.getMessage());
	        }
	    }
}

