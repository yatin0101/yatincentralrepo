package package2;

public class class9 
{
	public class9() 
	{
		this.method2(5, 5);
		System.out.println("deafult constructor");
		this.method1();
		this.method3(9, 8, 9);
	}
	public void method1() 
	{
		//this.method2(1, 2);
		System.out.println("default method");
	}
	public void method2(int a,int b)
	{
		this.method3(1, 2, 3);
		System.out.println("2 parameterized method");
	}
	public void method3(int a,int b,int c)
	{
		//this.method1();
		System.out.println("3 paramerterized method");
	}
	public static void main(String[] args) 
	{
		class9 monika=new class9();
		
		
	}

}
