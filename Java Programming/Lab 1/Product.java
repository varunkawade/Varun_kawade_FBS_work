class Product
{
int PId;
String PName;
int quantity;
	
void display()
{
 System.out.println("\nProduct id is:"+PId+"\nProduct name is: "+PName+"\nQuantity: "+quantity);
}
}// Product class ends here

class TestProduct
{
 public static void main(String [] args)
{
 Product p1;
	
 p1 = new Product ();
		
 p1.PId = 22;
 p1.PName = "TATA";
 p1.quantity = 666;
 p1.display();
	}
}// TestProduct class ends here