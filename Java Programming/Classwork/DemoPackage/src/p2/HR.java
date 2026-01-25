package p2;

import p1.Employee;

public class HR extends Employee 
{
	protected double commission;

	public HR()
	{
		super();
		this.commission = 2356;
	}

	public HR(int id, String name, double salary, double commission)
	{
		super(id, name, salary);
		this.commission = commission;

	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	public double calcell(){
		return salary + commission;
	}

	public void display()
	{
		super.display();
		System.out.println(" COMMISSION: " + this.commission);
	}
}//class HR end here

