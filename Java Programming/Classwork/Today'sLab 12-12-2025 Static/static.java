import java.util.Scanner;

class BankAccount 
{
 double accNo, currentBalance; 
 String holderName;
 static double interestRate;

	BankAccount()
	{
 		this.accNo=2123;
		 this.holderName="marco";
		 this.currentBalance=632343;
		//this.interestRate=0.34;

	}


	BankAccount(double accNo ,String holderName ,double currentBalance,double interestRate)
	{
		 this.accNo=accNo;
		 this.holderName=holderName;
		 this.currentBalance=currentBalance;
		//this.interestRate=interestRate;

	}


	void display ()
	{
		System.out.println ("\nAccount number of user is: "+accNo+"\n Name of user is: "+holderName+"\nBalance: "+currentBalance+"\nInterest Rate: "+interestRate);
	}
	void setAccNo(double d)
	{
		 this.accNo=d;
	}
	void setHolderName(String d)
	{
		 this.holderName=d;
	}
	void setCurrentBalance(double d)
	{
		 this.currentBalance=d;
	}
	void setInterestRate(double d)
	{
		 this.interestRate=d;
	}


	double getAccNo()
	{
		 return this.accNo;
	}

	String getName()
	{
		 return this.holderName;
	}

	double getCurrentBalance()
	{
		 return this.currentBalance;
	}

	double getInterestRate()
	{
		return this.interestRate;
	}

}// BankAccount class ends here

class testBankAccount
{
	public static void main(String args[])
	{
		BankAccount b1 = new BankAccount(122, "Pinkman",213233);
		BankAccount b2 = new BankAccount(132, "swayam", 32154);
		BankAccount b3 = new BankAccount(123, "Sanket", 23435);
		
		b1.display();
		b2.display();
		b3.display();
	}
}