package com.practice;

import com.Assignment.AccessModifiers1;

class AccessModifiers1
{
    private void privateMethod() 
    {
        System.out.println("Private method: Accessible only within this class.");
    }

    void defaultMethod() 
    {
        System.out.println("Default method: Accessible within the same package.");
    }

    protected void protectedMethod()
    {
        System.out.println("Protected method: Accessible within the same package and through inheritance in other packages.");
    }

    public void publicMethod() 
    {
        System.out.println("Public method: Accessible from everywhere.");
    }

    public void testAccessWithinClass() 
    {
        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }
}
public class SamPackageDemo 
{
	public static void main(String[] args) 
	{
		 AccessModifiers1 obj = new AccessModifiers1();

	        obj.defaultMethod();    
	        obj.protectedMethod();  
	        obj.publicMethod();
	}
}
