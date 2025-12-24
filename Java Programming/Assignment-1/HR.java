class HR
{
 int id;
String name;
double salary;
double commission;

void display()
{
System.out.println("Id:"+this.id);
System.out.println("name:"+this.name);
System.out.println("Salary:"+this.salary);
System.out.println("commission:"+this.commission);
}
}//class Employee ends here

class TestHR
{
public static void main(String args[])
{
HR hr1,hr2;
hr1=new HR();
hr1.id=001;
hr1.name="walterwhite";
hr1.salary=10000;
hr1.commission=1000;
hr1.display();
hr2=new HR();
hr2.display();

}
}//class testhr ends here


