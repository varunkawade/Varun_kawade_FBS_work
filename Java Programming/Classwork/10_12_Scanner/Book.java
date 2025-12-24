import java.util.Scanner;

class Book
{
    int ISBN;
    String bName;
    String author;
    String category;
    double price;

    Book() // default constructor
    {
        this.ISBN = 435;
        this.bName = "In Search of Lost Time";
        this.author = "Marcel Proust";
        this.category = "Classic";
        this.price = 134.3;
    }

    Book(int ISBN, String bName, String author, String category, double price) 
    {
        this.ISBN = ISBN;
        this.bName = bName;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    void display()
    {
        System.out.println("\nISBN no is: " + ISBN +"\nName of book is: " + bName + "\nAuthor of book is: " + author + "\nCategory: " + category + "\nPrice: " + price);
    }

    void setISBN(int d) 
 { 
  this.ISBN = d;
 }
    void setbName(String d) 
{ 
 this.bName = d; 
}
    void setAuthor(String d)
 { 
 this.author = d; 
 }
    void setCategory(String d) 
 { 
 this.category = d; 
 }
    void setPrice(double d)
 { 
 this.price = d;
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
}//book class ends here

class TestBook
{
    public static void main(String[] args)
    {
        Book B1, B2, B3;

        B1 = new Book();
        B1.setISBN(7856);
        B1.setbName("Three Men in a Boat");
        B1.setAuthor("Jerome K. Jerome");
        B1.setCategory("Comedy");
        B1.setPrice(457.22);
        B1.display();

        B2 = new Book();
        B2.display();

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter ISBN:");
        int ISBN = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter Book Name:");
        String bName = sc.nextLine();

        System.out.println("Enter Author:");
        String author = sc.nextLine();

        System.out.println("Enter Category:");
        String category = sc.nextLine();

        System.out.println("Enter Price:");
        double price = sc.nextDouble();

        B3 = new Book(ISBN, bName, author, category, price);
        B3.display();
    }
}//test Book ends here
