package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo 
{
	public static void main(String[] args) 
	{
		HashMap h1=new HashMap();
		System.out.println("Default size is..."+h1.size());
		System.out.println("Default value is.."+h1);
		h1.put(1, "shraddha");
		h1.put("shraddha", 1);
		h1.put("Tops", "Technologies..");
		h1.put("shraddha", "Rathod");
		System.out.println("Now size is..."+h1.size());
		System.out.println("Now value is.."+h1);
		h1.remove(1);
		System.out.println("Now size is..."+h1.size());
		System.out.println("Now value is.."+h1);
		
		Set set=h1.entrySet();
		Iterator i1=set.iterator();
		while(i1.hasNext())
		{
//		    Map.Entry me=(Map.Entry)i1.next();
	//		System.out.println("Key is.."+me.getKey());
		//	System.out.println("Key is..."+me.getValue());
			//System.out.println();
			
			String[] s=i1.next().toString().split("=");
			System.out.println("Key is.."+s[0]);
			System.out.println("value is.."+s[1]);
			System.out.println();
	  }
	}	

}
