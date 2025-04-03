package com.key;

abstract class ADemo
{
	int no;
	String name;
	public abstract void setData();
	public void display()
	{
		System.out.println("No is ..."+no);
		System.out.println("Sname is ..."+name);
	}
}
abstract class Demo extends ADemo
{
}
class Demo1  extends ADemo 
{
	@Override
	public void setData()
	{
		no=123;
		name="Shraddha";
	}
}
public class AbstractDemo
{
	public static void main(String[] args)  
	{
		ADemo a1=new Demo1();
		a1.setData();
		a1.display();
	}
}
