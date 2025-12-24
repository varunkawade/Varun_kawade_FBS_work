import java.util.Scanner;

class PlacedStudent {
    int frn;
    String name;
    int distance;
    String companyName;
    String designation;

    PlacedStudent() {
        this.frn = 2;
        this.name = "pinkman";
        this.distance = 11;
        this.companyName = "Apple";
        this.designation = "CEO";
    }

    PlacedStudent(int frn, String name, int distance, String companyName, String designation) {
        this.frn = frn;
        this.name = name;
        this.distance = distance;
        this.companyName = companyName;
        this.designation = designation;
    }

    void display() {
        System.out.println("\nFRN: " + this.frn + "\nName: " + this.name + "\nDistance: " + this.distance +  "\nCompany Name: " + this.companyName +"\nDesignation: " + this.designation);
    }

    void setFrn(int d) 
 { 
 this.frn = d;
 }
    void setName(String d)
  { 
 this.name = d; 
  }
    void setDistance(int d)
  { 
 this.distance = d;
  }
    void setCompanyName(String d)
  {
  this.companyName = d;
  }
    void setDesignation(String d)
  { 
 this.designation = d; 
 }

    int getFrn()
  {
  return this.frn;  
  }
    String getName() 
 { 
 return this.name; 
 }
    int getDistance()
  {
  return this.distance; 
  }
    String getCompanyName()
  { 
 return this.companyName;
  }
    String getDesignation() 
 { 
 return this.designation; 
}
}//classPlacedstudent ends here

class TestPlacedStudent {
    public static void main(String args[]) {
        PlacedStudent ps1, ps2, ps3;

        ps1 = new PlacedStudent();
        ps1.setFrn(1);
        ps1.setName("Rutik");
        ps1.setDistance(10);
        ps1.setCompanyName("TCS");
        ps1.setDesignation("Software Developer");
        ps1.display();

        ps2 = new PlacedStudent(2,"Varun",12,"TCS","Software Developer");
        ps2.display();

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter FRN:");
        int frn = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Distance:");
        int distance = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Company Name:");
        String companyName = sc.nextLine();

        System.out.println("Enter Designation:");
        String designation = sc.nextLine();

        ps3 = new PlacedStudent(frn, name, distance, companyName, designation);
        ps3.display();

        sc.close();
    }
}//testplacedStudent ends here
