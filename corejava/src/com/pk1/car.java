package com.pk1;

public class car 
{
	int cid;
	String cname,model,price;
	public void setData()
	{
		cid=1;
		cname="scorpio";
		model="Sport";
		price="1200000rs";
	}
	public void display()
	{
		System.out.println("Cid is..."+cid);
		System.out.println("Cname is..."+cname);
		System.out.println("Model is...."+model);
		System.out.println("Price is..."+price);
	}
}
