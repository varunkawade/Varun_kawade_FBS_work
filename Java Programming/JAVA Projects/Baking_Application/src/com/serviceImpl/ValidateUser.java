package com.serviceImpl;
import DAOInterface.BankingServices;

import java.util.List;

import com.aspectprovider.ObjectProvider;
import bean.User;
import services.AccountServices;


public class ValidateUser implements services.AccountServices
{

	BankingServices dao = ObjectProvider.createDAOObject();
//	ArrayList<User> list = new ArrayList<User>();
	
	public int openAccount(String accType, float accSal) 
	{
		User user = new User(accType, accSal);
		dao.addAccount(user);
		return user.getAccNo();
	}	

	
	public float balEnquiry(int accNo) 
	{
		User a1 = dao.retireveAccountById(accNo);
		
		if(a1 != null) {
			return a1.getAccNo();
		}
		
		return 0;
	}

	
	public float deposit(int accNo, float amount)
	{
	    boolean result = dao.deposit(accNo, amount);

	    if(result)
	    {
	        User user = dao.retireveAccountById(accNo);
	        System.out.println("Deposit Successful!!");

	        return user.getAccNo();
	    }

	    System.out.println("Account Not Found!!");

	    return 0;
	}
	
	public String printAccountDetails(int accNo) 
	{
		User u = dao.retireveAccountById(accNo);
		
		if(u != null)
		{
			return u.toString();
		}
		
		return "Account not found!! Please Enter Valid Credentials!!";
	}



	public List<User> displayAllAccounts() {
        return dao.getAllAccounts();
    }


	
	public void transfer(int senderAccNo, int receiverAccNo, double amount)
	{

	    boolean result =
	    dao.transfer(senderAccNo, receiverAccNo,(float)amount);


	    if(result)
	    {
	        System.out.println("Transaction Successful");
	    }
	    else
	    {
	        System.out.println("Transaction Failed");
	    }

	}


	@Override
	public void withdraw(int accNo, float amount) {
		 boolean result = dao.withdraw(accNo, amount);

		    if(result)
		    {
		        System.out.println("Withdraw Successful!!");
		    }
		    else
		    {
		        System.out.println("Withdraw Failed!!");
		    }
		
	}

	
}
