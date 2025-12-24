class SalesManager{
int id;
String name;
double salary;
double incentive;
int target;
void display()
{
System.out.println("Id: "+ this.id);
System.out.println("name: "+ this.name);
System.out.println("Salary: "+ this.salary);
System.out.println("Incentive: "+ this.incentive);
System.out.println("Target:" + this.target);
}
}//class SalesManager ends here 

class TestSalesManager {
 public static void main(String args[])
{
SalesManager sm1 ,sm2;
sm1=new SalesManager();
sm1.id=02;
sm1.name="walterwhite";
sm1.salary=20000;
sm1.incentive=10000;
sm1.target=1000;
sm1.display();

sm2=new SalesManager();
sm2.display
}
}//test class ends here