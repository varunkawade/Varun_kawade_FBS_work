
class Product
{
    int PId;
    String PName;
    int quantity;

        Product()
    {
        this.PId = 435;
        this.PName = "FAN";
        this.quantity = 223;
    }

   
    Product(int PId, String PName, int quantity)
    {
        this.PId = PId;
        this.PName = PName;
        this.quantity = quantity;
    }

    void display()
    {
        System.out.println("\nProduct ID: " + PId +"\nProduct Name: " + PName +"\nQuantity: " + quantity);
    }

    void setPId(int d) { this.PId = d; }
    void setPName(String d) { this.PName = d; }
    void setQuantity(int d) { this.quantity = d; }

    int getPId() { return this.PId; }
    String getPName() { return this.PName; }
    int getQuantity() { return this.quantity; }
}




class TestProduct
{
    public static void main(String [] args)
    {
        Product p1, p2;

       
        p1 = new Product();
        p1.setPId(22);
        p1.setPName("TATA");
        p1.setQuantity(666);
        p1.display();

        
        p2 = new Product(32, "FAN", 234);
        p2.display();

        System.out.println("ID: " + p1.getPId());
        System.out.println("Name: " + p1.getPName());
        System.out.println("Quantity: " + p1.getQuantity());
    }
}
