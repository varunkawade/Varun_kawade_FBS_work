package p1;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
 class Student implements Comparable<Student> 
{
	int rollno;
	String name;
	
	
	public Student() 
	{
		
	}

	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return "\n [rollno=" + rollno + ", name=" + name + "]";
	}
	
	public boolean equals(Object o)
	{
		System.out.println("Equals Called");
		Student s2 = (Student) o;
		
		
		if(this.rollno == s2.rollno)
			return true;
		else
			return false;
	}

	public int compareTo(Student s2) {
		// TODO Auto-generated method stub
		//Student s2=(Student)o;//downcasting
		return this.rollno-s2.rollno;
	}

	
	@Override
	public int hashCode() {
 // TODO Auto-generated method stub
		System.out.println("Inside hashcode");
		return this.rollno;
		
	}

}// class Student ends here


 class Demostudent
{
	public static void main1(String[] args) 
	{
		Student s1 = new Student(10,"Sachin");
		Student s2 = new Student(18,"Virat");
		Student s3 = new Student(7,"Dhoni");
		
		ArrayList <Student> sList = new ArrayList<Student> ();
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		if(sList.contains(new Student(7,"Dhoni")))
			System.out.println("Found");
		else
			System.out.println("Not Found");
	
	}
	public static void main2(String[] args) {
		Student s1 = new Student(10,"Sachin");
		Student s2 = new Student(18,"Virat");
		Student s3 = new Student(7,"Dhoni");
		
		TreeSet<Student> ts = new TreeSet<Student>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		System.out.println(ts);
		if(ts.contains(new Student(7,"Dhoni")))
			System.out.println("Found");
		else
			System.out.println("Not Found");
	}
			
	public static void main(String[] args) {

		Student s1 = new Student(10,"Sachin");
		Student s2 = new Student(18,"Virat");
		Student s3 = new Student(7,"Dhoni");
		Student s4 = new Student(45,"Rohit");
		Student s5 = new Student(333,"khris");
		
		
		HashSet<Student>hs=new HashSet<Student>();
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		System.out.println(hs);
		
		if(hs.contains(new Student(7,"Dhoni")))
			System.out.println("Found");
		else
			System.out.println("Not Found");
	}
	
}//class DemoStudent ends here


