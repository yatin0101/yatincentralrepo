package package02;

import package2.*;

public class class01 extends class8
{
	/*public void testmethod3()
	{
		System.out.println("i m class01 testmethod3 of package02");
	}*/
	
	public class01() 
	{
	super(1,2);
	System.out.println("child default constructor");
	}
	public class01(int a)
	{
	this(1,2);
	System.out.println("child 1 parameterized constructor");
	}
	public class01(int a,int b)
	{
	super(1);//this();
	System.out.println("child 2 parameterized constructor");	
	}
	public class01(int a,int b,int c)
	{
	this(1);	
	System.out.println("child 3 paramerterized constructor");	
	}
	
	public static void main(String[] args) 
	{
	 class01 yatin=new class01(1,2);
	 class01 yatin1=new class01();
	}
}
