package package02;

public class class04 
{
	static int a;
	public void increment()
	{
		a=a+1;
		
	}
	
	public static void method1()
	{
		System.out.println("static method");
	}
	
	public static void main(String[] args) 
	{
		class04 yatin1=new class04();
		class04 yatin2=new class04();
		yatin1.increment();
		System.out.println(yatin1.a);
		yatin2.increment();
		System.out.println(yatin2.a);
		class04.method1();
	}
}
