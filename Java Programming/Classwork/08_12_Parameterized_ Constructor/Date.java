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

 
Date(int day ,int month,int year ,String str)
{ 
  this.day=day;
this.month=month;
this.year=year;
this.dow="str";
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
 Date d1,d2 ;
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

d2= new Date(1,1,2025);
 d2.display();


 }
}//test date ends here