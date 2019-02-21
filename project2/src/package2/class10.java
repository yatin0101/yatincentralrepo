package package2;

public class class10 
{
	int a=75;
	public void method1(int b)
	{
		final int a=b;
	}

	public static void main(String[] args) 
	{
		class10 yatin=new class10();
		yatin.method1(57);
		System.out.println(yatin.a);//System.out.println(yatin.method1(57));
	}
}
