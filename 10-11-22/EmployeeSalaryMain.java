package oops_concept;

import java.util.Scanner;

public class EmployeeSalaryMain {

	public static void main(String[] args) {
		int id;
		String name,designation;
		float salary;
		Scanner sc=new Scanner(System.in);
		EmployeeSalary emp=new EmployeeSalary();
		System.out.print("enter employee id: ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.print("enter employee name: ");
		name=sc.nextLine();
		System.out.print("enter employee designation: ");
		designation=sc.nextLine();
		System.out.print("enter employee salary: ");
		salary=sc.nextFloat();
		System.out.println("=============================");
		emp.emp_details(id, name, designation, salary);
		emp.calculate();
		emp.display();
		sc.close();

	}

}
