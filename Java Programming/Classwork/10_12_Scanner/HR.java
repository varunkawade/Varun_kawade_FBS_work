import java.util.Scanner;

class HR
{
    int id;
    String name;
    double salary;
    double commission;

    HR()
    {
        this.id = 2;
        this.name = "pinkman";
        this.salary = 10222;
        this.commission = 2202;
    }

    HR(int id, String name, double salary, double commission)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.commission = commission;
    }

    void display()
    {
        System.out.println("\nId: " + this.id +"\nName: " + this.name +"\nSalary: " + this.salary +"\nCommission: " + this.commission);
    }

    void setid(int d)
  {  
  this.id = d; 
 }
    void setName(String d) 
 { 
  this.name = d;
  }
    void setSalary(double d) 
 { 
  this.salary = d; 
}
    void setCommission(double d) 
 { 
 this.commission = d; 
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
}//class HR ends here

class TestHR
{
    public static void main(String args[])
    {
        HR hr1, hr2, hr3;

        // Default HR modified using setters
        hr1 = new HR();
        hr1.setid(1);
        hr1.setName("Walter White");
        hr1.setSalary(10000);
        hr1.setCommission(1000);
        hr1.display();

        // Default HR displayed as-is
        hr2 = new HR();
        hr2.display();

        // Scanner input for a new HR
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter HR ID:");
        int id = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.println("Enter HR Name:");
        String name = sc.nextLine();

        System.out.println("Enter HR Salary:");
        double salary = sc.nextDouble();

        System.out.println("Enter HR Commission:");
        double commission = sc.nextDouble();

        hr3 = new HR(id, name, salary, commission);
        hr3.display();

        sc.close();
    }
}//test HR ends
