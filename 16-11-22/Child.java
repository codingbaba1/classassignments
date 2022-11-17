package oops_concept;

class Person
{
	int id;
	String name,address;
	public Person(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void distplay()
	{
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		
	}
}
class StudentDetails extends Person
{
	
	int marks;
	long phone;
	public StudentDetails(int id,String name,String address,int marks,long phone)
	{
		super(id,name,address);
		this.marks=marks;
		this.phone=phone;
	}
	void display()
	{
		super.distplay();
		System.out.println("Marks: "+marks);
		System.out.println("phone: "+phone);
	}
}

public class Child
{

	public static void main(String[] args) 
	{
		StudentDetails st=new StudentDetails(101,"priya", "UP",85,652145452l);
		st.display();
		System.out.println("============================");
		
		StudentDetails st1=new StudentDetails(102,"Rupesh", "Haryana",55,582145452l);
		st1.display();
		
		
	}

}
