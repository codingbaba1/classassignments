//this is constructor chaining and constructor reusing 
package oops_concept;

import java.util.Scanner;

class User
{
	int userId;
	String userName,passWord,firstName,lastName,address;
	long phoneNo;
	
	public User(int userId, String firstName,String lastName)
	{
		this.userId=userId;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public User(int userId, String firstName, String lastName, String address, long phoneNo)
	{
		this(userId,firstName,lastName);
		this.address=address;
		this.phoneNo=phoneNo;
		
	}
	public User(int userId, String firstName, String lastName, String address, long phoneNo,String userName,String passWord)
	{

		this(userId,firstName, lastName,address,phoneNo);
		this.userName=userName;
		this.passWord=passWord;
	}
	/*public User() 
	{
		// TODO Auto-generated constructor stub
	}*/

	/*void display()
	{
		System.out.println("UseId : "+this.userId);
		
	}*/
	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
}

public class ConstructorOverloadingEx 
{

	public static void main(String[] args) 
	{
		/*int userId;
		String userName,passWord,firstName,lastName,address;
		long phoneNo;
		User user=new User();
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter userId: ");
		userId = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter userName: ");
		userName = sc.nextLine();
		System.out.print("Enter Password: ");
		passWord = sc.nextLine();
		System.out.print("Enter firstName: ");
		firstName = sc.nextLine();
		System.out.print("Enter lastName: ");
		lastName = sc.nextLine();
		System.out.print("Enter address: ");
		address = sc.nextLine();
		System.out.print("Enter phoneNo: ");
		phoneNo = sc.nextLong();
		sc.close();*/
	
		User user=new User(101,"Imran", "Khan");
		System.out.println("userId: "+user.getUserId());
		System.out.println("firstName: "+user.getFirstName());
		System.out.println("lastName: "+user.getLastName());
		
		System.out.println("=======================================");
		User user1=new User(102,"Imran","Khan", "Noida", 8645123202l);
		System.out.println("userId: "+user1.getUserId()+"\nfirstName: "+user1.getFirstName()+"\nlastName: "+user1.getLastName()+"\nAddress: "+user1.getAddress()+"\nPhone No.: "+user1.getPhoneNo());
		
	}

}
