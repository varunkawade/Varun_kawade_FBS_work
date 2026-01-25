class Employee{
	int id;
	String name;
	double salary;
	public Employee() 
	{
		this.id=0;
		this.name="Not given";
		this.salary=0;
		
		
	}
	
	
	Employee(int id, String name, double salary) 
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	int getId() 
	{
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
	void setSalary(double salary) {
		this.salary = salary;
	}
	
	void display() {
		
	        System.out.println("\nId: " + this.id +"\nName: " + this.name +"\nSalary: " + this.salary); 
	}
}
class Test {
 public static void main(String[] args) {
	Employee e1;//Reference
	e1=new Employee(101,"Sachin",25000);
	e1.display();
  }
}
//
//abstract class Employee{
//	int id;
//	String Name;
//	double salary;
//
//Employee() 
//{
//	
//	this.id = 0;
//	Name = "not given";
//	salary=0;
//}
//
//Employee(int id, String name, double salary)
//{
//	
//	this.id = id;
//this.Name= name;
//	this.salary=salary;
//}
//
//int getId() {
//	return id;
//}
//
//void setId(int id) {
//	this.id = id;
//}
//
//String getName() {
//	return Name;
//}
//
//void setName(String name) {
//	Name = name;
//}
//
//double getSalary() {
//	return salary;
//}
//
//void setSalary(double salary) {
//	this.salary=salary;
//}
//abstract double calSal();
//
//@Override
//public String toString() {
//	return "Employee [id=" + id + ", Name=" + Name + ", salary=" + salary + "]";
//}
//
//
//
//}//class ends here
//
//
//class Admin extends Employee { 
//    double allowance;
//
//    Admin() {
//        super();
//        allowance = 0;
//    }
//
//    Admin(int id, String name, double salary, double allowance) {
//        super(id, name, salary);
//        this.allowance = allowance;
//    }
//
//    double getAllowance() {
//		return allowance;
//	}
//
//	void setAllowance(double allowance) {
//		this.allowance = allowance;
//	}
//	double calSal(){
//		return salary+allowance;
//	}
//
//	@Override
//	public String toString() {
//		return super.toString() + ", allowance=" + allowance +
//	               ", totalSalary=" + calSal();
//		}
//	
//	
//} // Admin class ends here
//
//
//class HR extends Employee { 
//    double incentive;
//
//    HR() {
//        super();
//        incentive = 0;
//    }
//
//    HR(int id, String name, double salary, double incentive) {
//        super(id, name, salary);
//        this.incentive = incentive;
//    }
//
//    double getIncentive() {
//		return incentive;
//	}
//
//	void setIncentive(double incentive) {
//		this.incentive = incentive;
//	}
//	double calSal(){
//		return salary+incentive;
//	}
//
//	@Override
//	public String toString()
//	{
//		return super.toString()+",incentive="+incentive+", totalSalary="+calSal();
//	}
//
//	
//} // HR class ends here
//
//
//class SalesManager extends Employee { 
//    double incentive;
//    int target;
//
//    SalesManager() {
//        super();
//        incentive = 0;
//        target = 0;
//    }
//
//    SalesManager(int id, String name, double salary,
//                 double incentive, int target) {
//        super(id, name, salary);
//        this.incentive = incentive;
//        this.target = target;
//    }
//
//    double getIncentive() {
//		return incentive;
//	}
//
//	void setIncentive(double incentive) {
//		this.incentive = incentive;
//	}
//
//	int getTarget() {
//		return target;
//	}
//
//	void setTarget(int target) {
//		this.target = target;
//	}
//	double calSal(){
//		return salary+target;
//	}
//
//	@Override
//	public String toString() {
//		return super.toString() + ", incentive=" + incentive +
//	               ", target=" + target + ", totalSalary=" + calSal();
//	}
//	
//}
//class test{
//	public static void main(String[] args) {
//		Employee e1;//refernes
//		e1=new Admin(1,"Varun",75000,1203);
//		System.out.println(e1);
//		
//		e1=new HR(1,"Pinkman",3247,24);
//		System.out.println(e1);
//	}
//		
//	}
//






