import java.util.Scanner;

class Date 
{
 int day, month, year;
 String dow;//day of week

Date()
{
this.day=6;
this.month=12;
this.year=2025;
this.dow="Saturday";
System.out.println("default constructor is called");
}

 
Date(int day ,int month,int year ,String dow)
{ 
  this.day=day;
this.month=month;
this.year=year;
this.dow=dow;
System.out.println("Parameterized constructor is called");

}

void display()
{
 System.out.println("\n" + day + "/" + month + "/" + year+ "\nDay is: "+dow);
}
void setDay(int d)
{
 this.day=d;
}
void setMonth(int d)
{
 this.month=d;
}
void setYear(int d)
{
 this.year=d;
}
void setDow(String d)
{
 this.dow=d;
}

int getDay()
{
 return this.day;
}

int getMonth()
{
 return this.month;
}

int getYear()
{
 return this.year;
}

String getDow()
{
 return this.dow; 	
}

}//class Date ends here

class TestDate 
{
 public static void main(String args[]) {
 Date d1,d2,d3 ;
 d1= new Date();
 d1.setDay(3);
 d1.setMonth(12);
 d1.setYear(2025);
 d1.setDow("Wednesday");
 d1.display();
d1.getDay();
d1.getMonth();
d1.getYear();
d1.getDow();

d2= new Date(1,1,2025,"tuesday");
 d2.display();


Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter Day:");
        int day = sc.nextInt();

        System.out.println("Enter Month:");
        int month = sc.nextInt();

        System.out.println("Enter Year:");
        int year = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.println("Enter Day of Week:");
        String dow = sc.nextLine();

        d3 = new Date(day, month, year, dow);
        d3.display();

        sc.close();

 }
}//test date ends here