package test.java;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		int n,rem,reverse=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr numbers: ");
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
		}
		System.out.println("reverse of the "+temp+" is: "+reverse);
		/*if(temp==reverse)
		{
			System.out.println(temp+" is a palindrome number");
		}
		else
		{
			System.out.println(temp+" is not a palindrome number");
		}*/
		sc.close();
		
	}

}
