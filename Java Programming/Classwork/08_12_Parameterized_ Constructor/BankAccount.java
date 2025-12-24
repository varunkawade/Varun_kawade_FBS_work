class BankAccount 
{
 double accNo, currentBalance, interestRate;
 String holderName;

BankAccount
{
 this.accno=2124;
 this.name="pinkman";
 this.currentbalanace=732343;
this.interestrate=0.33;

}


BankAccount(double accno ,String holdername ,double currentBalace,double interstrate);
{
 this.accno=accno;
 this.name=holdername;
 this.currentbalanace=currentBalance;
this.interestrate=intersetRate;

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
 BankAccount B1,B2;		
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


}
}//TestBankAccount class ends here