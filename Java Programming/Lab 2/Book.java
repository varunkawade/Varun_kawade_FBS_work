class Book
{
int ISBN;
String bName;
String author;
String category;
 double price;
	
void display ()
{	
System.out.println("\n ISBN no is: "+ISBN+"\nName of book is: "+bName+"\nAuthor of book is: "+author+"\nCategory: "+category+"\nPrice: "+price);
}
void setISBN(int d)
{
 this.ISBN=d;
}
void setbName(String d)
{
 this.bName=d;
}

void setAuthor(String d)
{
 this.author=d;
}

void setCategory(String d)
{
 this.category=d;
}
void setPrice(double d)
{
 this.price=d;
}


int getISBN()
{
 return this.ISBN;
}

String getbName()
{
 return this.bName;
}

String getAuthor()
{
 return this.author;
}

String getCategory()
{
return this.category;
}

double getPrice()
{
 return this.price;
}
}//Book class ends here

class TestBook
{
public static void main(String [] args)
{
 Book B1,B2;
 B1 = new Book();
 B1.setISBN(7856);
 B1.setbName("Three man in Boat");
 B1.setAuthor("Jerome K. Jerome");
 B1.setCategory("Comedy");
 B1.setPrice(457.22);
 B1.display();
 B2 = new Book();
B2.display();

B1.getISBN();
B1.getbName();
B1.getAuthor();
B1.getCategory();
B1.getPrice();

 }
}//TestBook class ends here