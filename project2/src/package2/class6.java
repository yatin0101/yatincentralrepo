package package2;

public class class6 
{	int a,b,c,d;
	
	void sum()
	{
		c=a+b;
		System.out.println(c);
	}
	void sub()
	{
		d=a-b;
		System.out.println(d);
	}
	void mul()
	{
		System.out.println(c*d);
	}

	

	public static void main(String[] args) 
	{class6 yatin=new class6();
	yatin.a=10;
	yatin.b=10;
	yatin.sum();
	yatin.sub();
	yatin.mul();
		
	}

}
