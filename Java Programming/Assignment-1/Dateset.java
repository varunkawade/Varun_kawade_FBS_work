class Date 
{
 int day, month, year;
 String dow;
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
int getday(){
return this.day;
}
}//class Date ends here

class TestDate 
{
 public static void main(String args[]) {
 Date d1,d2;
 d1= new Date();
 d1.setDay(4);
 d1.setMonth(12);
 d1.setYear(2025);
 d1.setDow("thrusday");
 d1.display();

 d2= new Date();
 d2.setDay(5);
 d2.setMonth(12);
 d2.setYear(2025);
 d2.setDow("thrusday");
 d2.display();

 
if(d1.getday()<d1.getday())
{
 System.out.println("d1 is elder");
}else
{
System.out.println("d1 is younger");
}

}
}//test date ends here