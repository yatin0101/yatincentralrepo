package package02;

public class overloading 
{
	public int arthmetic(int x,int y)
	{
		int c=x+y;
		return c;
		
	}
	
	public int arthmetic(int a,int b,int c)
	{
		int d=a+b+c;
		return d;
	}
	public static void main(String[] args) 
	{
		overloading yatin=new overloading();
		int y=yatin.arthmetic(11, 11);
		int z=yatin.arthmetic(11, 11);
		System.out.println(y);
		System.out.println(z);
		
	}
}
