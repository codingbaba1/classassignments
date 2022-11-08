package test.java;

public class Test {
	
	// 1.take two double variable and print the value.
	public void doub(double a, double b){
		System.out.println("variable a: "+a+"\n"+"variable b: "+b);
	}
	
	
	//2.take one long and one integer value and print the values on the screen.
	public void long_int(long l){
		System.out.println("\nPrint Long value: "+l);
	}
	
	//3.take 3 int variables and do addition and print the result on screen.
	public void add(int a, int b){
		int result = a+b;
		System.out.println("\nSum of a and b is: "+result);
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.doub(858.977d,945.987d);
		t.long_int(7654678767l);
		t.add(10, 20);
	}

}
