package p1;

	import java.util.ArrayList;
    import java.util.HashSet;
    import java.util.TreeSet;
	 class Student implements Comparable 
	{
		int rollno;
		String name;
		private Object s2;
		
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
			return "Student [rollno=" + rollno + ", name=" + name + "]";
		}
		
		public boolean equals(Object o)
		{
			Student s2 = (Student) o;
			System.out.println(this.name +"---"+s2.name);
			if(this.rollno == s2.rollno)
				return true;
			else
				return false;
		}
		
		@Override
		public int hashCode() {
	 // TODO Auto-generated method stub
			System.out.println("Inside hashcode");
			return this.rollno;
			
		}

		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			Student s2=(Student)o;//downcasting
			return this.rollno-s2.rollno;
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
			
			TreeSet<Integer> t1 = new TreeSet<Integer>();
			t1.add(10);
			t1.add(30);
			t1.add(20);
			System.out.println(t1);
			
			
			if(sList.contains(new Student(7,"Dhoni")))
				System.out.println("Found");
			else
				System.out.println("Not Found");
		}
		public static void main(String[] args) {

			Student s1 = new Student(10,"Sachin");
			Student s2 = new Student(18,"Virat");
			Student s3 = new Student(7,"Dhoni");
			
			ArrayList <Student> sList = new ArrayList<Student> ();
			sList.add(s1);
			sList.add(s2);
			sList.add(s3);
			HashSet<Integer>hs=new HashSet<Integer>();
			hs.add(10);
			hs.add(30);
			hs.add(20);
			System.out.println(hs);
		}
		
	}//class DemoStudent ends here


