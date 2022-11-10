package basic_programs.java;

import java.util.Scanner;

public class PerfectNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,num,sum;
		Scanner sc=new Scanner (System.in);
		System.out.print("enter last number: ");
		num=sc.nextInt();
		System.out.println("All perfect number between 1 to "+num);
		
		for(i=1;i<=num; i++)
		{
			sum=0;
			for(j=1; j<i; j++)
			{
				if(i%j==0){
					sum+=j;
				}
			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}
		sc.close();

	}

}
