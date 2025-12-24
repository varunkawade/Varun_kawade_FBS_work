class Student
{
  int FRN;
  String name;
  double distance;
void display(){
System.out.println("FRN:"+this.FRN);
System.out.println("NAME:"+this.name);
System.out.println("Distance:"+this.distance);
}
}//class Student ends here 
 
class TestStudent{
 public static void main(String args[])
{
Student s1, s2;
s1=new Student();
s1.FRN=013;
s1.name="varun";
s1.distance=11;
s1.display();

s2=new Student();
s2.display();

}
}//TestStudent ends here
