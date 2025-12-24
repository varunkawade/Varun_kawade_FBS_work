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
void setid(int d)
{
 this.id=d;
}
void setName(String d)
{
 this.name=d;
}
void setSalary(double d)
{
 this.salary=d;
}

int getid()
{
 return this.id;
}

String getName()
{
 return this.name;
}
double getSalary()
{
 return this.salary;
}


}//class Employee ends here

class TestEmployee{

public static void main(String args[])
{
 Employee E1,E2;
E1=new Employee();
E1.setid(1);
E1.setName("rutik");
E1.setSalary(10000);
E1.display();

E2=new Employee();
E2.display();

E1.getid();
E1.getName();
E1.getSalary();

}
}//testEmployee ends here