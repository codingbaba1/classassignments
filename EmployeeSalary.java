package test.java;
import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int emp_id, net_salary,salary,it,pf;
		String emp_name;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Employee id: ");
		emp_id=scan.nextInt();
		System.out.println("Enter Employee name: ");
		emp_name=scan.next();
		System.out.println("Enter salary: ");
		salary=scan.nextInt();
		System.out.println("Enter income tax: ");
		it=scan.nextInt();
		System.out.println("Enter provident fund: ");
		pf=scan.nextInt();
		
		it=it*(salary/100);
		pf=pf*(salary/100);
		net_salary = salary-it-pf;
		System.out.println("Employee id: "+emp_id);
		System.out.println("Employee Name: "+emp_name);
		System.out.println("NetSalary: "+net_salary);
		
	}

}

