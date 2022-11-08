package basic_programs.java;

import java.util.Scanner;

//name of the class 
public class LeftTrianglePattern {

	//main method
	public static void main(String[] args) {

		//declaration of variables
		int i, j, row;    
		//create object of scanner class
		Scanner sc=new Scanner(System.in);
		//user input the number of rows
		System.out.println("Enter number of rows: ");
		row=sc.nextInt();
		//Outer loop work for rows  
		for (i=0; i<row; i++)   
		{  
		//inner loop work for space      
		for (j=2*(row-i); j>=0; j--)         
		{  
		//prints space between two stars      
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (j=0; j<=i; j++ )   
		{   
		//prints star      
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   
		//close for scanner class connection
		sc.close();
	}

}
