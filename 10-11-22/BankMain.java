package oops_concept;

import java.util.Scanner;

public class BankMain {
	
	public static void main(String[]arg)
	{
		/*int dep=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Yout want to deposit Yes=1 /No=0: ");
		dep=sc.nextInt();*/
		Bank b=new Bank();
		b.deposit();
		b.withdrawn();
		
	}

}
