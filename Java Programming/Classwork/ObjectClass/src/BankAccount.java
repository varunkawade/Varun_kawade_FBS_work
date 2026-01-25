
class BankAccount {
	long accountNumber;
    String holderName;
    double balance;
    static int count;
    static {
    	
    	count = 0; 
    	}
    
     BankAccount() {
    	this.accountNumber = 0;
    	this.holderName = "NOt Givan";
    	this.balance = 0;
	}

	BankAccount(long accountNumber, String holderName, double balance) 
	{
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}



	long getAccountNumber() {
		return accountNumber;
	}

	void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	String getHolderName() {
		return holderName;
	}

	void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	double getBalance() {
		return balance;
	}

	void setBalance(double balance) {
		this.balance = balance;
	}
    
	double TotalBalance(){
		return balance;
	}
	
	public String toString() {
		return "AccountNumber:"+this.accountNumber+ "\n Name:"+this.holderName+ "\n Balance: "+this.balance;
	}
	static int getCount() 
	{ 
		return count; 
		}
}//class BankAccount ends here;

class SavingsAccount extends BankAccount{
	double interestRate;
	
	 SavingsAccount() {
		
		this.interestRate = 0;
	}

	SavingsAccount(long accountNumber, String holderName, double balance, double interestRate) {
		super(accountNumber, holderName, balance);
		this.interestRate = interestRate;
	}

	double getInterestRate() {
		return interestRate;
	}

	void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	double TotalBalance(){
		return balance - interestRate;
	}	
	
	public String toString() {
		return super.toString()+" InterstRate:"+this.interestRate;
	}
}//class SavingsAccount ends here

class CurrentAccount extends BankAccount{
	double overdraftLimit;
	
	 CurrentAccount() {
		
		this.overdraftLimit = 0;
	}

	CurrentAccount(long accountNumber, String holderName, double balance, double overdraftLimit) {
		super(accountNumber, holderName, balance);
		this.overdraftLimit = overdraftLimit;
	}

	double getOverdraftLimit() {
		return overdraftLimit;
	}

	void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	double TolatBalance() {
		return balance - overdraftLimit;
	}
	public String toString() {
		return super.toString()+" OverdarftLimit:"+this.overdraftLimit;
	}
	
}

class TestBankAccount{
	public static void main(String[] args) {
		BankAccount B1 = new BankAccount(250476140,"Varun Kawade", 35000);
	     System.out.println(B1);
		System.out.println("Total Balance: "+B1.TotalBalance());
		
		B1 = new SavingsAccount(78945612,"Pinkman",25460,4.5);
		System.out.println(B1);
		System.out.println("Total Balance: "+B1.TotalBalance());
		
		B1 =new CurrentAccount(789541224,"Adbel Khan",78521,25000);
		System.out.println(B1);
		System.out.println("Total Balance: "+B1.TotalBalance());
	}
}




