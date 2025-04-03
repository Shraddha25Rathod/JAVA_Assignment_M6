package com.oops;

class parent
{
	String pname;
	public void setParentData()
	{
		pname = "Pareshbhai Rathod";
	}
}
class child1 extends parent
{
	String cname;
	public void setChildData()
	{
		cname="Shraddha";
	}
	public void display()
	{
		System.out.println(cname+" "+pname);
	}
}
class child2 extends parent
{
	String cname;
	public void setChildData()
	{
		cname="Shlok";
	}
	public void display()
	{
		System.out.println(cname+"  "+pname);
	}
}


public class hirachical_demo 
{
	public static void main(String[] args) 
	{
		child1 c1= new child1();
		c1.setParentData();
		c1.setChildData();
		c1.display();
		
		child1 c2= new child1();
		c2.setParentData();
		c2.setChildData();
		c2.display();
	}
}
