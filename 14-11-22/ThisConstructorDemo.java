package oops_concept;

class A
{
	public A()
	{
		System.out.println("this is default constructor!");
	}
	public A(int a)
	{
		this();//invoke default constructor
		System.out.println("the value of a: "+a);
		
	}
	public A(float b)
	{
		this(10);
		System.out.println("the value of b: "+b);
	}
}
public class ThisConstructorDemo 
{
	public static void main(String []arg)
	{
		@SuppressWarnings("unused")
		A obj =new A(10.35f);
	
	}

}
