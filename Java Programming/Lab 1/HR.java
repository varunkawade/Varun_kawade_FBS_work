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
HR hr;
hr=new HR();
hr.id=001;
hr.name="walterwhite";
hr.salary=10000;
hr.commission=1000;
hr.display();
}
}//class testhr ends here


