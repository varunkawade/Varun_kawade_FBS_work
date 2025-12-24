import java.util.Scanner;

class SalesManager {
    int id;
    String name;
    double salary;
    double incentive;
    int target;

    
    SalesManager() {
        this.id = 1;
        this.name = "pinkman";
        this.salary = 123434;
        this.incentive = 22432;
        this.target = 3434;
    }

    
    SalesManager(int id, String name, double salary, double incentive, int target) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.incentive = incentive;
        this.target = target;
    }

    void display() {
        System.out.println("\nId: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Incentive: " + this.incentive);
        System.out.println("Target: " + this.target);
    }
}//class Salesmanager ends here

class TestSalesManager {
    public static void main(String args[]) {

        SalesManager sm1, sm2, sm3;

        
        sm1 = new SalesManager();
        sm1.id = 1;
        sm1.name = "Walter White";
        sm1.salary = 20000;
        sm1.incentive = 10000;
        sm1.target = 1000;
        sm1.display();

        
        sm2 = new SalesManager(2, "VARUN", 24343, 34343, 5000);
        sm2.display();

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Salary:");
        double salary = sc.nextDouble();

        System.out.println("Enter Incentive:");
        double incentive = sc.nextDouble();

        System.out.println("Enter Target:");
        int target = sc.nextInt();

        
        sm3 = new SalesManager(id, name, salary, incentive, target);
        sm3.display();

        sc.close();
    }
}testSalesManager ends here
