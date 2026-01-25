
class Date { 
	int day ,month,year;
	String dow;



Date(){
	this.day=23;
	this.month=12;
	this.year=2025;
	this.dow="Tuesday";
}
Date(int day , int month, int year, String dow){
	this.day=day;
	this.month=month;
	this.year=year;
	this.dow=dow;
	
 }
int getDay() {
	return day;
}
void setDay(int day) {
	this.day = day;
}
int getMonth() {
	return month;
}
void setMonth(int month) {
	this.month = month;
}
int getYear() {
	return year;
}
void setYear(int year) {
	this.year = year;
}
String getDow() {
	return dow;
}
void setDow(String dow) {
	this.dow = dow;
 }
 public String toString() {
	return"day:"+this.day+"\nMonth:"+this.month+"\nYear"+this.year+"\nDow:"+this.dow;
}
}

class Test{
	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1);
		
	}
}