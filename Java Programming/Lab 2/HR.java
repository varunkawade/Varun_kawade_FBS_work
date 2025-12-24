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
void setCommission(double d)
{
 this.commission=d;
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

double getCommission()
{
return this.commission;
}

}//class Employee ends here

class TestHR
{
public static void main(String args[])
{
HR hr1,hr2;
hr1=new HR();
hr1.setid(1);
hr1.setName("walterwhite");
hr1.setSalary(10000);
hr1.setCommission(1000);
hr1.display();
hr2=new HR();
hr2.display();

hr1.getid();
hr1.getName();
hr1.getSalary();
hr1.getCommission();
}
}//class testhr ends here


