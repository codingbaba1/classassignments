package oops_concept;

class Calculate
{
	int add(int a,int b)
	{
		return a+b;
	}
	float add(float a,float b)
	{
		return a+b;
	}
	float add(int a,float b)
	{
		return a+b;
	}
	float add(float a, int b)
	{
		return a+b;
	}
	String add(String a, String b)
	{
		return a+b;
	}
	
}

public class MethodOverLoading 
{
	public static void main(String []arg)
	{
		Calculate calc=new Calculate();
		System.out.println("method1 "+calc.add(10,20));
		System.out.println("method2 "+calc.add(10.2f,20f));
		System.out.println("method3 "+calc.add(10,25.5f));
		System.out.println("method4 "+calc.add(20.80f,20));
		System.out.println("method5 "+calc.add("Atul","Anup"));
		
		
	}

}
