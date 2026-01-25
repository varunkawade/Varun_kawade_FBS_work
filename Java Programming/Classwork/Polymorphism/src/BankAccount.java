
public class BankAccount {
	long accountNumber;
    String holderName;
    double balance;
    
    public BankAccount() {
		// TODO Auto-generated constructor stub
    	this.accountNumber = 0;
    	this.holderName = "NOt Givan";
    	this.balance = 0;
	}

	BankAccount(long accountNumber, String holderName, double balance) {
		super();
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
	
	void display()
	{
		System.out.println();
		System.out.println("Account Number: " +this.accountNumber);
		System.out.println("Account Number: " +this.holderName);
		System.out.println("Balance: " +this.balance);
	}
}

class SavingsAccount extends BankAccount{
	double interestRate;
	
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
		super();
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
	
	void display()
	{
		super.display();
		System.out.println("Interest Rate: " +this.interestRate);
	}
}

class CurrentAccount extends BankAccount{
	double overdraftLimit;
	
	public CurrentAccount() {
		// TODO Auto-generated constructor stub
		super();
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
	void display()
	{
		super.display();
		System.out.println("Overdraft Limit: " +this.overdraftLimit);
	}
}

class TestBankAccount{
	public static void main(String[] args) {
		BankAccount B1 = new BankAccount(250476140,"Varun Kawade", 35000);
		B1.display();
		System.out.println("Total Balance: "+B1.TotalBalance());
		
		B1 = new SavingsAccount(78945612,"Pinkman",25460,4.5);
		B1.display();
		System.out.println("Total Balance: "+B1.TotalBalance());
		
		B1 =new CurrentAccount(789541224,"Adbel Khan",78521,25000);
		B1.display();
		System.out.println("Total Balance: "+B1.TotalBalance());
	}
}