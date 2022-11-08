package basic_programs.java;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		int i, j, row;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		row=sc.nextInt();
		//Outer loop work for rows  
		for (i=1; i<=row; i++)   
		{  
		//inner loop work for space      
		for (j=row-i; j>=1; j--)   
		{  
		//prints space between two stars  
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (j=1; j<=i; j++ )   
		{   
		//prints star      
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   
		sc.close();
	}

}
