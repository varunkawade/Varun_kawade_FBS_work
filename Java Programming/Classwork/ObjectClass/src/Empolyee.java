abstract class Employee { 
    int id;
    String name;
    double salary;
	public char[] calsale;
	public char[] getName;
    static int count;

    static {
        count = 0;
    }

    Employee() {
        this.id = 0;
        this.name = "Not Given";
        this.salary = 0;
        count++;
    }

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        count++;
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

	void setSalary(double salary) {
		this.salary = salary;
	}
	abstract double calSal();

	public String toString() {
        return "ID: " + this.id + "\nNAME: " + this.name + "\nSALARY: " + this.salary + "\n";
    }

    static int getCount() {
        return count;
    }
} // Employee class ends here


class Admin extends Employee { 
    double allowance;

    Admin() {
        super();
        allowance = 0;
    }

    Admin(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        this.allowance = allowance;
    }

    double getAllowance() {
		return allowance;
	}

	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	double calSal(){
		return salary+allowance;
	}
	
	public String toString() {
        return super.toString() + "ALLOWANCE: " + this.allowance + "\n";
    }
} // Admin class ends here


class HR extends Employee { 
    double incentive;

    HR() {
        super();
        incentive = 0;
    }

    HR(int id, String name, double salary, double incentive) {
        super(id, name, salary);
        this.incentive = incentive;
    }

    double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	double calSal(){
		return salary+incentive;
	}

	public String toString() {
        return super.toString() + "INCENTIVE: " + this.incentive + "\n";
    }
} // HR class ends here


class SalesManager extends Employee { 
    double incentive;
    int target;

    SalesManager() {
        super();
        incentive = 0;
        target = 0;
    }

    SalesManager(int id, String name, double salary,
                 double incentive, int target) {
        super(id, name, salary);
        this.incentive = incentive;
        this.target = target;
    }

    double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	int getTarget() {
		return target;
	}

	void setTarget(int target) {
		this.target = target;
	}
	double calSal(){
		return salary+target;
	}
	public String toString() {
        return super.toString() + "INCENTIVE: " + this.incentive + "\nTARGET: " + this.target + "\n";
    }
} // SalesManager class ends here


class EmployeeTest {
    public static void main(String[] args) {
            Employee e1;//reference
//            e1= new Employee(100,"Yuvi",2000);
//            System.out.println(e1.calsale);
//            System.out.println();
        e1= new Admin(1, "Varun", 50000, 800);
        System.out.println();
         e1= new HR(2, "Amit", 40000, 60);
        System.out.println(e1);
         e1 = new SalesManager(3, "Sachin", 55000, 600, 100);
        System.out.println(e1);

    }
}
class test{
	public static void main(String[] args) 
	{
		test.getSalaryHike(new SalesManager(3,"Sachin",55000,7000,100));
		test.getSalaryHike(new Admin(1,"Varun",4000,6000));
	}

static void getSalaryHike(Employee e1) 
{ 
	
	System.out.println(e1.getName());
 if (e1 instanceof SalesManager )
 {
	 SalesManager s1=(SalesManager)e1;
	 s1.setIncentive(5000);
	 System.out.println(s1.getIncentive());
  }
 if (e1 instanceof Admin) {
	 Admin a1=(Admin)e1;
	 a1.setAllowance(2000);
	 System.out.println(a1.getAllowance());
  }
 }
}
