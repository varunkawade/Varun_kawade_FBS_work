package p4;

public class Test {
public static void main(String[] args) {
		
		LoginValidation l1 = new LoginValidation("Varun009","Varun@009");
		
		try
		{
			l1.validateUsername("Varun009");
			
			int attempts = 3;
			
			while (attempts > 0)
			{
				try
				{
					l1.validatePassword("Varun@009");
					System.out.println("Login Successfull!!");
					break;
				}
				
				catch (InvalidPasswordException p )
				{
					attempts --;
					System.out.println(p);
					
					if(attempts == 0)
					{
						System.out.println("Account Locked!!");
					}
				}
			}
		}
			
		
		catch (InvalidUsernameException u)
		{
			System.out.println(u);
		}
	}		

}
