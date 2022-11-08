
package test.java;

import java.util.Scanner;

public class Rows {

	
	public static void main(String[] args) {
		int i,j,rows;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of row you want! ");
		rows=sc.nextInt();
		for(i=1; i<=rows; i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
		sc.close();
	}

}
