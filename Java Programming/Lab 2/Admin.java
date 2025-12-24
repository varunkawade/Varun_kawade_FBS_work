class Admin
{
int id;
String name;
double salary,allowance;
void display()
{
System.out.println("\nAdmin id is:"+id+"\nName is: "+name+"\nSalary: "+salary + "\nAllowance: "+allowance);
}
void setid(int d)
{
 this.id=d;
}
void setName(String d)
{
 this.name=d;
}
void setSalary(double d)
{
 this.salary=d;
}
void setAllowance(double d)
{
 this.allowance=d;
}


int getid()
{
 return this.id;
}

String getName()
{
 return this.name;
}
double getSalary()
{
 return this.salary;
}

double getAllowance()
{
return this.allowance;
}

}// Admin class ends here
	
class TestAdmin
{
 public static void main (String [] args)
{
 Admin A1,A2; 
 A1 = new Admin ();
 A1.setid(1);
 A1.setName("walterwhite");
 A1.setSalary(17322);
 A1.setAllowance(1396);
 A1.display();
 A2 = new Admin ();
 A2.display();

A1.getid();
A1.getName();
A1.getSalary();
A1.getAllowance();

}
}// TestAdmin class ends here