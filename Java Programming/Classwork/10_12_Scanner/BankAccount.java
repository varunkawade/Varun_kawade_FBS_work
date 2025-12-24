import java.util.Scanner;

class BankAccount 
{
 double accNo, currentBalance; 
 String holderName;
Static double interestRate;
BankAccount()
{
 this.accNo=2123;
 this.holderName="marco";
 this.currentBalance=632343;
this.interestRate=0.34;

}


BankAccount(double accNo ,String holderName ,double currentBalance,double interestRate)
{
 this.accNo=accNo;
 this.holderName=holderName;
 this.currentBalance=currentBalance;
this.interestRate=interestRate;

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

class TestBankAccount
{

public static void main (String [] args)
{
 BankAccount B1,B2,B3;		
 B1 = new BankAccount ();
 B1.setAccNo(23243);
 B1.setHolderName("WalterWhite");
 B1.setCurrentBalance(334354);
 B1.setInterestRate(0.43);
 B1.display ();
 B1.getAccNo();
 B1.getName();
 B1.getCurrentBalance();
 B1.getInterestRate();


 B2 = new BankAccount (122, "Pinkman",213233,0.5);
 B2.display ();
 	

Scanner sc = new Scanner(System.in);

 System.out.println("Enter Account Number:");
 
double accNo = sc.nextDouble();

 sc.nextLine(); 

System.out.println("Enter Holder Name:");

String holderName = sc.nextLine();

System.out.println("Enter Balance:");

double balance = sc.nextDouble();

System.out.println("Enter Interest Rate:");

double interest = sc.nextDouble();

 B3 = new BankAccount(accNo, holderName, balance, interest);
        B3.display();

}
}//TestBankAccount class ends here




