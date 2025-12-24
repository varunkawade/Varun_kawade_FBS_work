import java.util.Scanner;

class Admin
{
int id;
String name;
double salary,allowance;
Admin()
{ 
this.id=2;
this.name="varun";
this.salary=200000;
this.allowance=10000;
}
 

Admin(int id , String name,double salary , double allowance)
{ 
this.id=id;
this.name=name;
this.salary=salary;
this.allowance=allowance;
}
 


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
 Admin A1,A2,A3; 
 A1 = new Admin ();
 A1.setid(1);
 A1.setName("walterwhite");
 A1.setSalary(17322);
 A1.setAllowance(1396);
 A1.display();

A1.getid();
A1.getName();
A1.getSalary();
A1.getAllowance();


 A2 = new Admin (2,"pinkman", 10002 , 1500);
 A2.display();
 
Scanner sc=new Scanner(System.in);
System.out.println("Enter an ID");
int id =sc.nextInt();
sc.nextLine();
System.out.println("Enter an Name");
String name=sc.nextLine();

System.out.println("Enter Salary");
double salary=sc.nextDouble();

System.out.println("Enter Allowance");
double allowance=sc.nextDouble();



A3= new Admin(id,name,salary,allowance);
A3.display();

}
}// TestAdmin class ends here