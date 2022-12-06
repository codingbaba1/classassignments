package shoppingKartusingarray;

import java.util.Scanner;

public class ProductService {
static Product product[]=new Product[10];
static Scanner sc=new Scanner(System.in);
static int index=0;

//this method is responsible to add product to add product in the array
public static void createProduct()
{
	System.out.println("Enter Product Id");
	int id=sc.nextInt();
	
	sc.nextLine();   //it will consume the \n character

	System.out.println("Enter Product Name:");
	String name=sc.nextLine();
	System.out.println("Enter Product Brand:");
	String brand=sc.nextLine();
    System.out.println("Enter Product Price:");
	double price=sc.nextDouble();
	System.out.println("Enter Product Quantity:");
	int quantity=sc.nextInt();
	
	//will insert in an array
	product[index]=new Product(id,name,brand,price,quantity);
	index++; 
	System.out.println("\nProduct added successfully!!");
}

//this method is responsible to retrieve product details
public static void getAllProduct()
{
	for(int i=0;i<index;i++)
	{
		System.out.println("Product Id:"+product[i].getId());
		System.out.println("Product Name:"+product[i].getName());
		System.out.println("Product Brand:"+product[i].getBrand());
		System.out.println("Product Quantity:"+product[i].getQuantity());
		System.out.println("=========================================");
	}
}

//this method is responsible to retrieve product details by id 
public static void getProductById()
{
	boolean f=false;
	System.out.println("Enter Id to Search Product:");
	int id=sc.nextInt();
	System.out.println("=========================================");
	for(int i=0;i<index;i++)
	{
		if(product[i].getId()==id)
		{
			System.out.println("Product Id:"+product[i].getId());
			System.out.println("Product Name:"+product[i].getName());
			System.out.println("Product Brand:"+product[i].getBrand());
			System.out.println("Product Quantity:"+product[i].getQuantity());
			System.out.println("=========================================");
			f=true;
			break;
		}
	}
	if(f==false)
	{
		System.out.println("Product Id not Found.");
		System.out.println("=========================================");
	}
}
}