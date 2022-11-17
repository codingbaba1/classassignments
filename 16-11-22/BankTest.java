package oops_concept;

 class Bank1 
{
	 
	int rateOfIntrest()
	{
		return 8;
	}

}
class HDFC extends Bank1
{
	
	int rateOfIntrest()
	{
		return 10;
		//System.out.println("HDFC rateOfIntrest: "+rateOfIntrest);
		
	}
}
class BOI extends Bank1
{
	int rateOfIntrest()
	{
		return 6;
	}
}
public  class BankTest 
{
	public static void main(String[]imran)
	{
		HDFC hdfc=new HDFC();
		System.out.println("Rate of Intrest hdfc: " +hdfc.rateOfIntrest()+"%");
		BOI boi=new BOI();
		System.out.println("Rate of Intrest hdfc: " +boi.rateOfIntrest()+"%");
	}
}
