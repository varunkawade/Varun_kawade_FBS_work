public class Shape {
    double area;

    public Shape() {
        this.area = 0;
    }

    Shape(double area) {
        this.area = area;
    }

    double getArea() {
        return area;
    }

    void setArea(double area) {
        this.area = area;
    }

    double TotalArea() {
        return area;
    }

    void display() {
        System.out.println();
        System.out.println("Area: " + this.area);
    }
}//class shape ends here

class Rectangle extends Shape 
{
    double length;
    double breadth;

    public Rectangle() {
        super();
        this.length = 0;
        this.breadth = 0;
    }

    Rectangle(double length, double breadth) {
        super();
        this.length = length;
        this.breadth = breadth;
    }

    double getLength() {
        return length;
    }

    void setLength(double length) {
        this.length = length;
    }

    double getBreadth() {
        return breadth;
    }

    void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    double TotalArea() {
        area=length * breadth;
    	return area;
    }

    void display() {
        super.display();
        System.out.println("Length: " + this.length);
        System.out.println("Breadth: " + this.breadth);
    }
}//class rectangle ends here

class Circle extends Shape 
{
    double radius;

    public Circle() {
        super();
        this.radius = 0;
    }

    Circle(double radius) {
        super();
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double TotalArea() {
        
		area =3.14 * radius * radius;

    	return area;
        		
    }

    void display() {
        super.display();
        System.out.println("Radius: " + this.radius);
    }
}//class circle ends here

class Triangle extends Shape 
{
    double base;
    double height;

    public Triangle() {
        super();
        this.base = 0;
        this.height = 0;
    }

    Triangle(double base, double height) {
        super();
        this.base = base;
        this.height = height;
    }

    double getBase() {
        return base;
    }

    void setBase(double base) {
        this.base = base;
    }

    double getHeight() {
        return height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    double TotalArea() {
    	area =0.5 * base * height; 
        return area; 
    }

    void display() {
        super.display();
        System.out.println("Base: " + this.base);
        System.out.println("Height: " + this.height);
    }
}//class triangle ends here 

class TestShape
{
    public static void main(String[] args) 
    {

        Shape s = new Shape(10);
        s.display();
        System.out.println("Total Area: " + s.TotalArea());

        s = new Rectangle(10, 5);
        s.display();
        System.out.println("Total Area: " + s.TotalArea());

        s = new Circle(7);
        s.display();
        System.out.println("Total Area: " + s.TotalArea());

        s = new Triangle(8, 6);
        s.display();
        System.out.println("Total Area: " + s.TotalArea());
    }
}//class test ends here
