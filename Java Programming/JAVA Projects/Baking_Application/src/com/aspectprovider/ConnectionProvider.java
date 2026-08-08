package com.aspectprovider;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionProvider 
{
	public static Connection createConnection()
	{
	    Connection con = null;

	    try
	    {

	        FileInputStream fis =
	        new FileInputStream(".//Resources//DBConfig.properties");


	        Properties p = new Properties();


	        p.load(fis);


	        String driver = p.getProperty("driver");

	        String url = p.getProperty("url");

	        String username = p.getProperty("username");

	        String password = p.getProperty("password");


	        Class.forName(driver);


	        con = DriverManager.getConnection(
	                url,
	                username,
	                password
	        );


	        System.out.println("Database Connected Successfully");


	    }
	    catch(Exception e)
	    {
	        e.printStackTrace();
	    }


	    return con;
	}
}
