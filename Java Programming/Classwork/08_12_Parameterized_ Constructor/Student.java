class Student
{
  int FRN;
  String name;
  double distance;
void display(){
System.out.println("FRN:"+this.FRN);
System.out.println("Name:"+this.name);
System.out.println("Distance:"+this.distance);
}
void setFRN(int d)
{
 this.FRN=d;
}
void setName(String d)
{
 this.name=d;
}
void setDistance(int d)
{
 this.distance=d;
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

Student()
{
this.FRN=1;
this.name="Pinkman";
this.distance=122;

}

}//class Student ends here 
 
class TestStudent{
 public static void main(String args[])
{
Student s1;
s1=new Student();
s1.setFRN(13);
s1.setName("varun");
s1.setDistance(11);

s1.getFRN();
s1.getName();
s1.getDistance();
s1.display();
}

}//TestStudent ends here
