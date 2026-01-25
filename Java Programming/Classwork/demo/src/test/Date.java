package test;

public class Date {
	int day,month,year;
	}
	class Test  {
	  public static void main(String args[])
	{
	   Date d1,d2;
	d1= new Date();
	d1.day=2;
	d1.month=12;
	d1.year=2025;
	System.out.println(d1);
	System.out.printf("%d/%d/%d\n",d1.day,d1.month,d1.year);
	d2=new Date();
	System.out.println(d2);
	}
	 
	}




