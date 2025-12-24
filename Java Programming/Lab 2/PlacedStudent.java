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
void setFrn(int d)
{
 this.frn=d;
}
void setName(String d)
{
 this.name=d;
}
void setDistance(int d)
{
 this.distance=d;
}
void setCompanyName(String d)
{
 this.companyName=d;
}
void setDesignation(String d)
{
 this.designation=d;
}



double getFrn()
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


}//class PlacedStudent ends here 

class TestPlacedStudent
{

public static void main(String args[])
{

 PlacedStudent ps1,ps2;
 ps1= new PlacedStudent();
 ps1.setFrn(1);
 ps1.setName("Rutik");
 ps1.setDistance(10);
 ps1.setCompanyName("TCS");
 ps1.setDesignation("software developer");
 ps1.display();
 ps2= new PlacedStudent();
 ps2.display();
  
ps1.getFrn();
ps1.getName();
ps1.getDistance();
ps1.getCompanyName();
ps1.getDesignation();

}
}//testPalceStudent ends here