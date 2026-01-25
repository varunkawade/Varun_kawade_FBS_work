import java.util.ArrayList;

public class Student   {
	int rollno;
	String Name;
	int getRollno() {
		return rollno;
	}
	void setRollno(int rollno) {
		this.rollno = rollno;
	}
	String getName() {
		return Name;
	}
	void setName(String name) {
		Name = name;
	}
	Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		Name = name;
	}
	Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
class DemoStudent{
	public static void main(String[] args) {
		Student s1= new Student(10,"Sachin");
		Student s2= new Student(7,"Dhoni");
		Student s3= new Student(18,"Virat");
		ArrayList<Student> Slist=new ArrayList<Student>();
		Slist.add(s1);
		Slist.add(s2);
		Slist.add(s3);
		for(Student s :Slist) {
			System.out.println(s);
		}
		if(Slist.contains(new Student(7,"Dhoni")))
				{
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
		
	}
}
