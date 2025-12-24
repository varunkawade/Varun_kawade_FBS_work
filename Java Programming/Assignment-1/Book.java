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
}//Book class ends here

class TestBook
{
public static void main(String [] args)
{
 Book B1,B2;
 B1 = new Book();
 B1.ISBN = 7856;
 B1.bName = "Three man in Boat";
 B1.author = "Jerome K. Jerome";
 B1.category = "Comedy";
 B1.price = 457.22;
 B1.display();
 B2 = new Book();
B2.display();
 }
}//TestBook class ends here