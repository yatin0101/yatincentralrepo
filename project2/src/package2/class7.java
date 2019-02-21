package package2;

public class class7 
{	static int x,y;
	
	public int sum(int a,int b)
	{
		int c=a+b;
		System.out.println("Addtion of two no. is:"+c);
		return c;
	}
	public int sub(int a,int b)
	{
		int c=a-b;
		System.out.println("Subtraction of two no. is:"+c);
		return c;
	}
	public int mul(int a,int b)
	{
		int c=a*b;
		System.out.println("final result of two no. is:"+c);
		return c;
	}
	public void testmethod()
	{
		System.out.println("i m class7 testmethod of package2");
	}

	public static void main(String[] args) 
	{
		class7 yatin=new class7();
		x=yatin.sum(10, 2);
		y=yatin.sub(10, 2);
		yatin.mul(x, y);
	}

}
