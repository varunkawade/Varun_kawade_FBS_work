package p3;

import p1.Employee;
import p2.Admin;
import p2.HR;
import p2.SalesManager;

public class Test
{
	public static void main(String[] args) {
		Employee e1;
		//e1 = new Employee(5,"Pink man",20500);
		//e1.display();
		//System.out.println("Total Salary: "+e1.calcell());
		
		e1 = new Admin(5,"Walter White", 23500, 1500);
		e1.display();
		System.out.println("Total Salary: "+e1.calcell());
		
		e1 = new SalesManager(5, "Varun", 30000, 1350, 1000);
		e1.display();
		System.out.println("Total Salary: "+e1.calcell());
		
		e1 = new HR(5,"Adbelkhan Pathan", 20500, 1050);
		e1.display();
		System.out.println("Total Salary: "+e1.calcell());
		
	}
	
}//test class end here



