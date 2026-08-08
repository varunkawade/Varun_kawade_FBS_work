package services;

import java.util.List;

import bean.User;

public interface AccountServices 
{
 public	int openAccount(String accType, float amount);
   public  float balEnquiry(int accNo);
   public float deposit(int accNo, float amount);
   public  String printAccountDetails(int accNo);
   List<User> displayAllAccounts();
	
	public void withdraw(int accNo, float amount);
	
	public void transfer(int senderAccNo, int receiverAccNo, double amount);


}
