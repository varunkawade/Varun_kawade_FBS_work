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
Student s1;
s1=new Student();
s1.FRN=013;
s1.name="varun";
s1.distance=11;
s1.display();
//System.out.print.ln( "\n" + s1.FRN + "\n" + s1.name + "\n" + s1.distance);

}

}//TestStudent ends here
