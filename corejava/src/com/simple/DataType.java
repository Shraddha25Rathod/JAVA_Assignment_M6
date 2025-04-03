package com.simple;

public class DataType 
{	
	 public static void main(String[] args) 
	{
		int i1=10;  //4 byte
		long l1=123213;//8 byte
		float f1=45.65f;//4 byte
		double d1=7887.658d;// 8byte
		byte b1=127;//1 byte
		char c1='T';//2 byte
		boolean bb=true;
		System.out.println("Int is......"+i1);
		System.out.println("Long......"+l1);
		System.out.println("Float is......"+f1);
		System.out.println("Double is......"+d1);
		System.out.println("Byte is......"+b1);
		System.out.println("Char is......"+c1);
		System.out.println("Boolean is......"+bb);
		
		
		System.out.println("Integer is......"+Integer.BYTES);
		System.out.println("Float is......"+Float.BYTES);
		System.out.println("Long is......"+Long.BYTES);
		System.out.println("Double......"+Double.BYTES);
		
	}
}
