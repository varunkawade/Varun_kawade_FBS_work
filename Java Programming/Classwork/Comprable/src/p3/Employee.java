//linklist
package p3;



import java.util.Collections;
import java.util.LinkedList;
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
		List<Employee> l1 ;
        l1= new LinkedList<Employee>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		System.out.println("before Sorting");
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println("After Sorting");
		System.out.println(l1);
	}
}
