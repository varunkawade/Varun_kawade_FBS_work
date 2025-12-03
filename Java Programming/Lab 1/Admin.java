class Admin
{
int id;
String name;
double salary,allowance;
void display()
{
System.out.println("\nAdmin id is:"+id+"\nName is: "+name+"\nSalary: "+salary + "\nAllowance: "+allowance);
	}
}// Admin class ends here
	
class TestAdmin
{
 public static void main (String [] args)
{
 Admin A1; 
 A1 = new Admin ();
 A1.id = 001;
 A1.name = "walterwhite";
 A1.salary = 17322;
 A1.allowance = 1396;
 A1.display();
}
}// TestAdmin class ends here