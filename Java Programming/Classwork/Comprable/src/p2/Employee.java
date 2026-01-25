package p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
	int id ;
	String name;
	double salary;
	Employee() {
		this.id=0;
	    this.name="not given";
	    this.salary=1120;
		// TODO Auto-generated constructor stub
	}
	Employee(int id, String name, double salary) {
		super();
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

	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "\n [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) {
		
		//return this.id-o.id;
		//return this.name.compareTo(o.name);
		return (int) (this.salary-o.salary);
	}
	

}//class ends here

 class TestAl{
	public static void main(String[] args) {
		Employee e1=new Employee(103,"Sachin",23000);
		Employee e2=new Employee(105,"Rahul",20000);
		Employee e3=new Employee(101,"Rohit",35000);
		List<Employee> al= new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		System.out.println("before Sorting");
		System.out.println(al);
		Collections.sort(al);
		System.out.println("After Sorting");
		System.out.println(al);
	}
}
