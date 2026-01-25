package p1;

public abstract class Employee 
{
	protected int id;
	protected String name;
	protected double salary;
	
	public Employee()
	{
		this.id = 4;
		this.name = "Rutik";
		this.salary = 25500;
	}

	public Employee(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalory(double salary) {
		this.salary = salary;
	}
	
	public double calcell(){
		return salary;
	}
	
	public void display()
	{
			System.out.println();
			System.out.println(" ID: " + this.id);
     		System.out.println(" NAME: " + this.name);
        	System.out.println(" SALARY: " + this.salary);
	}
}//class Employee end here

