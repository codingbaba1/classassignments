package oops_concept;

import java.util.Scanner;

class Student 
{
	Scanner sc=new Scanner(System.in);
	int id;
	String name,address,course;
	float fees;
	long contact;
	
	//method for set student data
	void setData(int i, String n,String add,long con,String c,float f)
	{
		
		
		id=i;
		name=n;
		address=add;
		contact=con;
		course=c;
		fees=f;
		
	}
	//display method use show/display student data
	void displayData()
	{
		System.out.println("Id: "+id+"\n"+"Name: "+name+"\n"+"Address: "+address+"\n"+"Contact No.: "+contact+"\n"+"Course: "+course+"\n"+"Fees: "+fees);
		
	}
}