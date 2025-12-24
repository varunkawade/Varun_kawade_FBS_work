import java.util.Scanner;

class Student
{
    int FRN;
    String name;
    double distance;

    Student()
    {
        this.FRN = 1;
        this.name = "Pinkman";
        this.distance = 122;
    }

    Student(int FRN, String name, double distance)
    {
        this.FRN = FRN;
        this.name = name;
        this.distance = distance;
    }

    void display()
    {
        System.out.println("\nFRN: " + this.FRN + "\nName: " + this.name +"\nDistance: " + this.distance);
    }

    void setFRN(int d) 
{
 this.FRN = d;
 }
    void setName(String d) 
{
 this.name = d;
 }
    void setDistance(double d)
 {
 this.distance = d;
 }

    int getFRN()
 {
 return this.FRN;
 }
    String getName()
 {
 return this.name;
 }
    double getDistance() 
{ 
  return this.distance;
 }
}//classstudent ends here

class TestStudent
{
    public static void main(String args[])
    {
        Student s1, s2,s3;

       
        s1 = new Student();
        s1.setFRN(13);
        s1.setName("Varun");
        s1.setDistance(11);
        s1.display();

        s2=new Student(12,"Adbel",11);
        
      Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter FRN:");
        int FRN = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Distance:");
        double distance = sc.nextDouble();

        s3 = new Student(FRN, name, distance);
        s3.display();

        sc.close();
    }
}
