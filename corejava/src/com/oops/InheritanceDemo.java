package com.oops;


class student1
{
	int sid;
	String sname,city;
	public student1()
	{
		System.out.println("This is stdentclass");
	}
	public void setstudentData()
	{
		sid=1;
		sname="shraddha";
		city="Ahemdabad";
	}
}
class sport1 extends student1
{
	String spname;
	public sport1()
	{
		System.out.println("This is stdentclass");
	}
	public void setstudentData()
	{
		spname="cricket";
	}
	public void display()
	{
		System.out.println("Sid is..."+sid);
		System.out.println("Sname is..."+sname);
		System.out.println("City is..."+city);
		System.out.println("Spname is..."+spname);
	}
	class result extends sport1
	{
		String grade;
		public result()
		{
			System.out.println("This is resultClass");
		}
		public void setresultData()
		{
			grade="A+";
		}
		public void display()
		{
			System.out.println("Sid is..."+sid);
			System.out.println("Sname is..."+sname);
			System.out.println("City is..."+city);
			System.out.println("Spname is..."+spname);
			System.out.println("Grade is..."+grade);
		}
	}
}
public class InheritanceDemo
{
	public static void main(String[] args)
 {
		result1 s1=new result1();
		s1.setstudentData();
		s1.setsportData();
		s1.setResultData();
		s1.display();
		
	}
}

