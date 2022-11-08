package test.java;

import java.util.Scanner;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		//Scanner class object created
		Scanner sc=new Scanner(System.in);
		//take a integer variable to hold an integer value
		int n,evenSum=0;
		
		//input number from the user
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		
		//for loop iterate from 0 to n number
		for(int i=0; i<=n; i++)
		{
			//if number id even then add it
			if(i%2==0)
			{
				evenSum += i;
			}
		}
		//printing result
		System.out.println("Sum of all even numbers 0 to "+n+" = "+evenSum);
		sc.close();
	}

}
