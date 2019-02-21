package package02;

public class overriding extends overloading	
{
	public int arthmetic(int x,int y)
	{
		//super.arthmetic(10, 5);
		System.out.println(super.arthmetic(10, 5));
		int z=x-y;
		return z;
	}
	
	public static void main(String[] args) 
	{
		overriding yatin=new overriding();
		//yatin.arthmetic(10, 5);
		System.out.println(yatin.arthmetic(10, 5));
	}

}
