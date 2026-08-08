package com.aspectprovider;

import java.io.FileInputStream;
import java.util.Properties;
import services.AccountServices;

import DAOImpl.BankingServicesImpl;

public class ObjectProvider 
{
	static Properties p = new Properties();

	static 
	{
		
		try 
		{
			FileInputStream fis = new FileInputStream(".//Resources//info.properties");
			p.load(fis);
		}

		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
	
	public static services.AccountServices createAccServiceObject()
	{
		
		services.AccountServices a = null;
		
		try
		{
			String className = p.getProperty("BusinessClass");
			
			a =(services.AccountServices)Class.forName(className).getDeclaredConstructor().newInstance();;
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return a;
		
	}
	
	public static BankingServicesImpl createDAOObject()
	{
		BankingServicesImpl b = null;
		
		try
		{
			String className = p.getProperty("DAOClass");

			b =(BankingServicesImpl)Class.forName(className).getDeclaredConstructor().newInstance();;
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return b;
	}
	
}
