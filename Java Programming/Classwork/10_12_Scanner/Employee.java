import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee() 
   {
        this.id = 2;
        this.name = "pinkman";
        this.salary = 20000;
    }

    Employee(int id, String name, double salary) 
  {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() 
    {
        System.out.println("\nId: " + this.id +"\nName: " + this.name +"\nSalary: " + this.salary);
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
}//Employee class ends here

class TestEmployee {
    public static void main(String args[]) {
        Employee E1, E2, E3;


        E1 = new Employee();
        E1.setid(1);
        E1.setName("Rutik");
        E1.setSalary(10000);
        E1.display();

        
        E2 = new Employee(2,"Walterwhite",12343);
        E2.display();

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter Employee ID:");
        int id = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter Employee Name:");
        String name = sc.nextLine();

        System.out.println("Enter Employee Salary:");
        double salary = sc.nextDouble();

        E3 = new Employee(id, name, salary);
        E3.display();

        
    }
}//test employee ends here
