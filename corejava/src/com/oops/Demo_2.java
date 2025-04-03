package com.oops;


class Employee
{
	int eid,salary,da,hra,pf;
	String ename;
	public void setAssignedValue()
	{
		eid=1;
		ename="Shraddha";
		salary=100000;
		da=6000;
		hra=6000;
		pf=2500;
	}
	public int calc()
	{
		return (salary+da+hra-pf);
	}
	public void display()
	{
		System.out.println("Eid is..."+eid);
		System.out.println("Ename is..."+ename);
		System.out.println("salary is..."+salary);
		System.out.println("Da is..."+da);
		System.out.println("HRA is..."+hra);
		System.out.println("PF is..."+pf);
		System.out.println("nestsalary is..."+calc());
	}
}
public class Demo_2 
{
   public static void main(String[] args)
   {
	 Employee e1=new Employee();
	 e1.setAssignedValue();
	 e1.calc();
	 e1.display();
   }
}
