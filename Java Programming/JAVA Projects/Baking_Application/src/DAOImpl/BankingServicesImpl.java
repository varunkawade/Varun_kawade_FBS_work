package DAOImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import DAOInterface.BankingServices;
import bean.User;

import com.aspectprovider.ConnectionProvider;


public  class BankingServicesImpl implements DAOInterface.BankingServices
{

Connection con = ConnectionProvider.createConnection();
	
	PreparedStatement pst;
	
	ResultSet rs;
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void addAccount(User a1) {
		 try
		    {
		        pst = con.prepareStatement(
		        "insert into account(acc_type,balance) values (?,?)",
		        java.sql.Statement.RETURN_GENERATED_KEYS);


		        pst.setString(1,a1.getAccType());
		        pst.setFloat(2,a1.getAccNo());


		        pst.executeUpdate();


		        ResultSet rs = pst.getGeneratedKeys();

		        if(rs.next())
		        {
		            a1.setAccNo(rs.getInt(1));
		        }


		        System.out.println("Account Created Successfully");

		    }
		    catch(Exception e)
		    {
		        e.printStackTrace();
		    }
		
	}

	

	@Override
	public bean.User retireveAccountById(int acc_no) {
		// TODO Auto-generated method stub
		try
		{
			pst = con.prepareStatement("select * from account where acc_no = ?");
			
			pst.setInt(1, acc_no);
			
			rs = pst.executeQuery();
			
			if (rs.next()) {
				bean.User user = new bean.User(
					    rs.getInt("acc_no"),
					    rs.getString("acc_type"),
					    rs.getFloat("balance")
					);
	            return user;
	        }
		}
		
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public boolean updateAccountDetails(int accNo)
	{
	    boolean flag = false;

	    try
	    {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Account Type: ");
	        String acc_type = sc.next();


	        pst = con.prepareStatement(
	        "update account set acc_type=? where acc_no=?");


	        pst.setString(1, acc_type);
	        pst.setInt(2, accNo);


	        int count = pst.executeUpdate();


	        if(count > 0)
	        {
	            flag = true;
	        }

	    }
	    catch(Exception e)
	    {
	        e.printStackTrace();
	    }

	    return flag;
	}

	public boolean deleteAccountByAccNo(int acc_no) {
		
              boolean flag = false;
		
		try
		{
			pst = con.prepareStatement("delete from account where acc_no = ?");
			
			pst.setInt(1, acc_no);
			
			int count = pst.executeUpdate();
			
			flag = (count > 0);
			
			System.out.println("Rows deleted: " + count);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return flag;

	}

	public List<bean.User> getAllAccounts() {
		
		List<bean.User> list = new ArrayList<>();

	    try {
	        pst = con.prepareStatement("select * from account");
	        rs = pst.executeQuery();

	        while (rs.next()) {
	            bean.User user = new bean.User(
	            	    rs.getInt("acc_no"),
	            	    rs.getString("acc_type"),
	            	    rs.getFloat("balance")
	            	);

	            	list.add(user);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		return list;

	}
	@Override
	public boolean deposit(int acc_no, float amount)
	{
	    boolean flag = false;

	    try
	    {
	        pst = con.prepareStatement(
	        "update account set balance = balance + ? where acc_no = ?");

	        pst.setFloat(1, amount);
	        pst.setInt(2, acc_no);

	        int count = pst.executeUpdate();

	        if(count > 0)
	        {
	            flag = true;
	        }

	    }
	    catch(Exception e)
	    {
	        e.printStackTrace();
	    }

	    return flag;
	}
	@Override
	public boolean withdraw(int acc_no, float amount)
	{
	    boolean flag = false;

	    try
	    {
	        pst = con.prepareStatement(
	        "update account set balance = balance - ? where acc_no = ?");

	        pst.setFloat(1, amount);
	        pst.setInt(2, acc_no);

	        int count = pst.executeUpdate();

	        if(count > 0)
	        {
	            flag = true;
	        }

	    }
	    catch(Exception e)
	    {
	        e.printStackTrace();
	    }

	    return flag;
	}
	@Override
	public boolean transfer(int sender, int receiver, float amount)
	{
	    boolean flag = false;

	    try
	    {
	        con.setAutoCommit(false);


	        // deduct money from sender

	        pst = con.prepareStatement(
	        "update account set balance = balance - ? where acc_no = ?");

	        pst.setFloat(1, amount);
	        pst.setInt(2, sender);

	        int senderUpdate = pst.executeUpdate();



	        // add money to receiver

	        pst = con.prepareStatement(
	        "update account set balance = balance + ? where acc_no = ?");

	        pst.setFloat(1, amount);
	        pst.setInt(2, receiver);

	        int receiverUpdate = pst.executeUpdate();



	        if(senderUpdate > 0 && receiverUpdate > 0)
	        {
	            con.commit();
	            flag = true;
	        }
	        else
	        {
	            con.rollback();
	        }


	    }
	    catch(Exception e)
	    {
	        try
	        {
	            con.rollback();
	        }
	        catch(Exception ex)
	        {
	            ex.printStackTrace();
	        }

	        e.printStackTrace();
	    }


	    return flag;
	}

	
}
