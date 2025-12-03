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
SalesManager sm;
sm=new SalesManager();
sm.id=02;
sm.name="walterwhite";
sm.salary=20000;
sm.incentive=10000;
sm.target=1000;
sm.display();
}
}//test class ends here