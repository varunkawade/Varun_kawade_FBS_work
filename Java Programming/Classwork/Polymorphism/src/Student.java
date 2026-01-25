public class Student {
    int rollNo;
    String name;
    double marks;

    public Student() {
        this.rollNo = 0;
        this.name = "Not Given";
        this.marks = 0;
    }

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    int getRollNo() {
        return rollNo;
    }

    void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    double getMarks() {
        return marks;
    }

    void setMarks(double marks) {
        this.marks = marks;
    }

    double TotalMarks() {
        return marks;
    }

    void display() {
        System.out.println();
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("Marks: " + this.marks);
    }
}

class ScienceStudent extends Student {
    double practicalMarks;

    public ScienceStudent() {
        super();
        this.practicalMarks = 0;
    }

    ScienceStudent(int rollNo, String name, double marks, double practicalMarks) {
        super(rollNo, name, marks);
        this.practicalMarks = practicalMarks;
    }

    double getPracticalMarks() {
        return practicalMarks;
    }

    void setPracticalMarks(double practicalMarks) {
        this.practicalMarks = practicalMarks;
    }

    double TotalMarks() {
        return marks + practicalMarks;
    }

    void display() {
        super.display();
        System.out.println("Practical Marks: " + this.practicalMarks);
    }
}
class CommerceStudent extends Student {
    double internalMarks;

    public CommerceStudent() {
        super();
        this.internalMarks = 0;
    }

    CommerceStudent(int rollNo, String name, double marks, double internalMarks) {
        super(rollNo, name, marks);
        this.internalMarks = internalMarks;
    }

    double getInternalMarks() {
        return internalMarks;
    }

    void setInternalMarks(double internalMarks) {
        this.internalMarks = internalMarks;
    }

    double TotalMarks() {
        return marks + internalMarks;
    }

    void display() {
        super.display();
        System.out.println("Internal Marks: " + this.internalMarks);
    }
}

class TestStudent {
	
	
    public static void main(String[] args) {

        Student s = new Student(1, "Varun", 70);
        s.display();
        System.out.println("Total Marks: " + s.TotalMarks());

        s = new ScienceStudent(2, "Pinkman", 65, 20);
        s.display();
        System.out.println("Total Marks: " + s.TotalMarks());

        s = new CommerceStudent(3, "Adbel", 68, 15);
        s.display();
        System.out.println("Total Marks: " + s.TotalMarks());
    }
}
