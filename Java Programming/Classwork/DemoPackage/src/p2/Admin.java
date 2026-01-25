package p2;

import p1.Employee;

public class Admin extends Employee
{
	protected double allowance;

	public Admin()
	{
		super();
		this.allowance = 1500;
	}

	public Admin(int id, String name, double salary, double allowance)
	{
		super(id, name, salary);
		this.allowance = allowance;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	public double calcell(){
		return salary + allowance;
	}

	public void display()
	{
		super.display();
		System.out.println(" ALLOWANCE: " + this.allowance);
	}
}//class admin end here


