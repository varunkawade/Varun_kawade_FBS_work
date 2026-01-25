class Employee
{
	int id;
	String name;
	double salary;
	
	Employee()
	{
		this.id = 4;
		this.name = "Rutik";
		this.salary = 25500;
	}

	Employee(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getSalary() {
		return salary;
	}

	void setSalory(double salary) {
		this.salary = salary;
	}
	
	double calcell(){
		return salary;
	}
	
	void display()
	{
			System.out.println();
			System.out.println(" ID: " + this.id);
     		System.out.println(" NAME: " + this.name);
        	System.out.println(" SALARY: " + this.salary);
	}
}//class Employee end here

class Admin extends Employee
{

	double allowance;

	Admin()
	{
		super();
		this.allowance = 1500;
	}

	Admin(int id, String name, double salary, double allowance)
	{
		super(id, name, salary);
		this.allowance = allowance;
	}

	double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	double calcell(){
		return salary + allowance;
	}

	void display()
	{
		super.display();
		System.out.println(" ALLOWANCE: " + this.allowance);
	}
}//class admin end here

class sales_manager extends Employee
{

	int incentive;
	int target;

	sales_manager()
	{
		super();
		this.incentive = 1500;
		this.target = 2500;
	}

	sales_manager(int id, String name, double salary, int incentive, int target)
	{
		super(id, name, salary);
		this.incentive = incentive;
		this.target = target;
	}

	int getIncentive() {
		return incentive;
	}

	void setIncentive(int incentive) {
		this.incentive = incentive;
	}

	int getTarget() {
		return target;
	}

	void setTarget(int target) {
		this.target = target;
	}
	
	double calcell(){
		return salary + incentive;
	}

	void display()
	{	
		super.display();
		System.out.println(" INCENTIVE: " + this.incentive);
		System.out.println(" TARGET: " + this.target);
	}
}//class sales_manager end here

class HR extends Employee
{
	double commission;

	HR()
	{
		super();
		this.commission = 2356;
	}

	HR(int id, String name, double salary, double commission)
	{
		super(id, name, salary);
		this.commission = commission;

	}

	double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}
	
	double calcell(){
		return salary + commission;
	}

	void display()
	{
		super.display();
		System.out.println(" COMMISSION: " + this.commission);
	}
}//class HR end here

	
class MyTests{
		public static void main(String[] args) {
			Employee e1;
			e1 = new Employee(5,"Pink man",20500);
			e1.display();
			System.out.println("Total Salary: "+e1.calcell());
			
			e1 = new Admin(5,"Walter White", 23500, 1500);
			e1.display();
			System.out.println("Total Salary: "+e1.calcell());
			
			e1 = new sales_manager(5, "Varun", 30000, 1350, 1000);
			e1.display();
			System.out.println("Total Salary: "+e1.calcell());
			
			e1 = new HR(5,"Adbelkhan Pathan", 20500, 1050);
			e1.display();
			System.out.println("Total Salary: "+e1.calcell());
			
		}
		
}//test class end here

