package com.practice;

public class StudentDemo
{
	private String name;
    private int age;
    private String department;

    public StudentDemo()
    {
        name = "Unknown";
        age = 0;
        department = "Unknown";
    }
    public StudentDemo(String name, int age) 
    {
        this(name, age, "Unknown"); 
    }

    public StudentDemo(String name, int age, String department) 
    {
        this.name = name;          
        this.age = age;
        this.department = department;
    }

    public static void main(String[] args) 
    {
        StudentDemo student1 = new StudentDemo("Bhoomi", 20, "Computer Engineering");
        StudentDemo student2 = new StudentDemo("Shraddha", 21, "Computer Engineering");
        StudentDemo student3 = new StudentDemo("Tisha", 19, "Computer Engineering");

        System.out.println("Student 1:");
        System.out.println("Name: " + student1.name);   
        System.out.println("Age: " + student1.age);
        System.out.println("Department: " + student1.department);
        System.out.println();

        System.out.println("Student 2:");
        System.out.println("Name: " + student2.name);
        System.out.println("Age: " + student2.age);
        System.out.println("Department: " + student2.department);
        System.out.println();

        System.out.println("Student 3:");
        System.out.println("Name: " + student3.name);
        System.out.println("Age: " + student3.age);
        System.out.println("Department: " + student3.department);
    }
}
