class Employee{
int id;
String name;
double salary;
void display()
{
System.out.println("Id:"+this.id);
System.out.println("name:"+this.name);
System.out.println("Salary:"+this.salary);
}
}//class Employee ends here

class TestEmployee{

public static void main(String args[])
{
 Employee E1,E2;
E1=new Employee();
E1.id=001;
E1.name="rutik";
E1.salary=10000;
E1.display();

E2=new Employee();
E2.display();

}
}//testEmployee ends here