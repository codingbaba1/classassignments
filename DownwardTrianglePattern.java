package basic_programs.java;

import java.util.Scanner;

public class DownwardTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,rows;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		rows=sc.nextInt();
		//inner loop
		for(i=rows;i>=1;i--)
		{
			//outer loop
			for(j=1;j<=i;j++)
			{
				//print * and space
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
