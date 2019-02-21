package package2;

public class class8 
{

	public class8() 
	{
	this(1,2,3);	
	System.out.println("default constructor");
	}
	public class8(int a)
	{
	//this();
	System.out.println("1 parameterized constructor");
	}
	public class8(int a,int b)
	{
	//this(1);
	System.out.println("2 parameterized constructor");	
	}
	public class8(int a,int b,int c)
	{
		
	System.out.println("3 paramerterized constructor");	
	}
	
	public static void main(String[] args) 
	{class8 yatin=new class8(1,2);
		
	}
	
}
