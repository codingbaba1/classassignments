package oops_concept;

class Vehicle
{
	static String company;
	int engine;
	String name;
	String model;
	String color;
	double price;
	
	void setDetails(int engine,String name,String model,String color,double price)
	{
		this.engine=engine;
		this.name=name;
		this.model=model;
		this.color=color;
		this.price=price;
	}
	 void getDetails()
	{
			
		System.out.println("Engine : "+engine+" cc");	
		System.out.println("Name   : "+name);	
		System.out.println("Model  : "+model);	
		System.out.println("Color  : "+color);	
		System.out.println("Price  : ₹"+price);	
	}
}
class Car extends Vehicle
{	int sitingCapacity;
	static String company="Suzuki";
	
	void getCar()
	{
		System.out.println("Company Name : "+company);

		
	}
	 
	
}
class Bike extends Vehicle
{
	static String company="Hero";
	void getBike()
	{
		System.out.println("Company Name : "+company);
	}
	
}

public class TestVehicle 
{

	public static void main(String[] args) 
	{
		Car swift=new Car();
		swift.getCar();
		swift.setDetails(1300,"Swift","VXI","Gray",630000);
		swift.getDetails();
		System.out.println("******************************");
		Car ciaz=new Car();
		ciaz.getCar();
		ciaz.setDetails(1150,"Ciaz","VDI","White",8650000);
		ciaz.getDetails();
		
		System.out.println("=================================");
		
		Bike splender=new Bike();
		splender.getBike();
		splender.setDetails(100, "Splender", "SuperSplender", "Black", 95000);
		splender.getDetails();
		System.out.println("******************************");
		
		splender.getBike();
		splender.setDetails(125, "Splender", "splender+", "Red", 85000);
		splender.getDetails();
		

	}

}
