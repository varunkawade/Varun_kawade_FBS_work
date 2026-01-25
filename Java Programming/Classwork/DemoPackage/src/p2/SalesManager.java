package p2;

import p1.Employee;

public class SalesManager extends Employee
{
	protected int incentive;
	protected int target;

	public SalesManager()
	{
		super();
		this.incentive = 1500;
		this.target = 2500;
	}

	public SalesManager(int id, String name, double salary, int incentive, int target)
	{
		super(id, name, salary);
		this.incentive = incentive;
		this.target = target;
	}

	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}
	
	public double calcell(){
		return salary + incentive;
	}

	public void display()
	{	
		super.display();
		System.out.println(" INCENTIVE: " + this.incentive);
		System.out.println(" TARGET: " + this.target);
	}
}//class sales_manager end here


