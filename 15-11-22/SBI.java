package oops_concept;

import java.util.Scanner;

 class BankInheritanceEx 
{
	String bankAddress;
	String customerName,customerAddress;
	Long accountNumber;
	

}
public class SBI extends BankInheritanceEx
{
	static String bankName="SBI Bank";
	
	
	void setData(String bankAddress, String customerName, String customerAddress, long accountNumber )
	{
		//Overwrite the parent class using super keyword
		
		super.bankAddress=bankAddress;
		super.customerName=customerName;
		super.customerAddress=customerAddress;
		super.accountNumber=accountNumber;
		
		
		
		/*this.customerName=customerName;
		this.customerAddress=customerAddress;
		this.amount=amount;*/
	}
	void display()
	{
		System.out.println("=================================");
		System.out.println("bankName: "+bankName);
		System.out.println("bankAddress: "+bankAddress);
		System.out.println("accountNumber: "+accountNumber);
		System.out.println("customerName: "+customerName);
		System.out.println("customerAddress: "+customerAddress);
		//System.out.println("Amount: "+amount);
	}
	public static void main(String[]args)
	{
		
		System.out.println("bankName: "+bankName);
		String bankAddress;
		String customerName,customerAddress;
		Long accountNumber;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter bank address: ");
		bankAddress=sc.nextLine();
		System.out.print("enter bank account no.: ");
		accountNumber=sc.nextLong();
		sc.nextLine();
		System.out.print("enter customerName: ");
		customerName=sc.nextLine();
		System.out.print("enter customer address: ");
		customerAddress=sc.nextLine();
		
		SBI sbi=new SBI();
		sbi.setData(bankAddress, customerName, customerAddress, accountNumber);
		sbi.display();
	}
}
