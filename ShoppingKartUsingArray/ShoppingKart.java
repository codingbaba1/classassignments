package shoppingKartusingarray;

import java.util.Scanner;

public class ShoppingKart {
 
    static Scanner sc=new Scanner(System.in); 
    
    
	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		//ProductService productService=new ProductService();
		do {
			System.out.println("~ Welcome To Shopping Kart~");
			System.out.println("============================================");
		System.out.println("Enter 1. for Add Product\nEnter 2. for display All product Details\n"
				+ "Enter 3. for quit");
		
		System.out.println("============================================");
		choice=sc.nextInt();
		 System.out.println("============================================");
		
		 switch(choice)
		{
		case 1:
		     	ProductService.createProduct();
		       System.out.println("============================================");
		       break;
		case 2:
			ProductService.getAllProduct();
		System.out.println("============================================");
		break;
		
		case 3:break;
		}
		}//do
		while(choice!=3);
	}

}