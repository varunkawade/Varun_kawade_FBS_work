class PlacedStudent{
 int frn;
String name;
int distance;
String companyName;
String designation;

void display()
{
System.out.println("frn:"+this.frn);
System.out.println("name:"+this.name);
System.out.println("Distance:"+this.distance);
System.out.println("CompanyName:"+this.companyName);
System.out.println("Designation:"+this.designation);

}
}//class PlacedStudent ends here 

class TestPlacedStudent
{

public static void main(String args[])
{

 PlacedStudent ps1,ps2;
 ps1= new PlacedStudent();
 ps1.frn= 01;
 ps1.name= "Rutik";
 ps1.distance=10;
 ps1.companyName= "TCS";
 ps1.designation= "software developer";
 ps1.display();
 ps2= new PlacedStudent();
 ps2.display();


}
}//testPalceStudent ends here