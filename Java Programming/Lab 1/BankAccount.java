class BankAccount 
{
 double accNo, currentBalance, interestRate;
 String holderName;

void display ()
{
System.out.println ("\nAccount number of user is: "+accNo+"\n Name of user is: "+holderName+"\nBalance: "+currentBalance+"\nInterest Rate: "+interestRate);
}
}// BankAccount class ends here

class TestBankAccount
{
public static void main (String [] args)
{
 BankAccount B1;		
 B1 = new BankAccount ();
 B1.accNo = 23243;
 B1.holderName = "WalterWhite";
 B1.currentBalance = 334354;
 B1.interestRate = 0.43;
 B1.display ();
}
}//TestBankAccount class ends here