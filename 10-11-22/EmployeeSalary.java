package oops_concept;

import java.util.Scanner;

public class EmployeeSalary {
	
	Scanner sc=new Scanner(System.in);
	int id;
	String name, designation;
	float salary,anual_salary,ta;
	void emp_details(int id,String name,String designation,float salary)
	{
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.salary=salary;
		
		/*if(designation=manager)
		{
			
			
		}*/

	}
	void calculate()
	{
		float ta=2000;
		anual_salary=salary*12;
		anual_salary=anual_salary+ta;
		
	}
	void display()
	{
		System.out.println("Employee Id: "+id+"\nEmployee Name: "+name+"\nDesignation: "+designation+"\nAnual Salary with travel Allowance: "+anual_salary);
	}
	

}
