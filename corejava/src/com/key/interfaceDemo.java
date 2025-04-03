package com.key;

class result
{
	String grade;
	public void setGrade()
	{
		grade = "A+";
	}
}
class staff extends result implements Student , Admin
{
	String stname,sname;
	public void setStaffData()
	{
		sname="abcd";
		stname="Shraddha";
	}
	@Override
	public void display()
	{
		System.out.println("sno is.."+sno);
		System.out.println("Admin name is.."+aname);
		System.out.println("sname is.."+sname);
		System.out.println("stname is..."+stname);
		System.out.println("Grade is.."+grade);
	}
}
public class interfaceDemo
{
	public static void main(String[] args)
	{
		staff s1=new staff();
		s1.setStaffData();
		s1.setGrade();
		s1.display();
		Student.show();
		
	}
}
