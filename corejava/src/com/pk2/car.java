package com.pk2;

public class car 
{
	int cid;
	String cname,model,price;
	public void setData()
	{
		cid=2;
		cname="SUV700";
		model="Sportz";
		price="1800000rs";
	}
	public void display()
	{
		System.out.println("Cid is..."+cid);
		System.out.println("Cname is..."+cname);
		System.out.println("Model is...."+model);
		System.out.println("Price is..."+price);
	}
}
