package test.java;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number to check perfect number or not! ");
		n=scan.nextInt();//6
		for(int i=1; i<n; i++)//i=1<6t i=2<6t i=3<6t i=4<6t i=5<6t i=6<6f
		{
			if(n%i==0)//6%5 = 1==0f
			{
				sum=sum+i; //3+3=6 sum=6
			}
		}
		if(n==sum)
		{
			System.out.println(n+" is perfect number");
		}
		else
		{
			System.out.println(n+" is not perfect number");
		}
		scan.close();
		
	}

}
