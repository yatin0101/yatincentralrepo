package package02;

public class class03 extends class02
{
    public void method2()
    {
    	super.var=57;
    	int r=super.method1();
    	System.out.println(r);
    	System.out.println("i am a child method");
    }
	
    public static void main(String[] args) 
	{
	class03 yatin=new class03();
	yatin.method2();
	System.out.println(yatin.var);

	}

}
