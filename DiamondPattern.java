package basic_programs.java;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variable declared 
		int row, i, j, space=1;  
		//enter the rows from user
		System.out.print("Enter the number of rows you want to print: ");  
		Scanner sc = new Scanner(System.in);  
		row = sc.nextInt();  
		space = row - 1;  
		//outer loop work for row
		for (i = 1; i<= row; i++)  
		{  
			//inner loop work for space
			for (j = 1; j<= space; j++)  
			{  
				System.out.print(" ");  
			}  
			space--;  
			//inner loop work for * print
			for (j = 1; j <= 2 * i - 1; j++)  
			{  
				//print *
				System.out.print("*");  
			}  
			//print next line
			System.out.println("");  
		}  
		space = 1;  
		for (i = 1; i<= row - 1; i++)  
		{  
			for (j = 1; j<= space; j++)  
			{  
				System.out.print(" ");  
			}  
			space++;  
			for (j = 1; j<= 2 * (row - i) - 1; j++)  
			{  
				System.out.print("*");  
			}  
			System.out.println("");  
		} 
		sc.close();
	}

}
