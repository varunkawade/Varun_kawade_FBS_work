class printer 
{
 void print()
{
System.out.println("hello");
}

void print(int a)
{
System.out.println(a);
}

void print(char c)
{
System.out.println('c');
}

void print(String str)
{
System.out.println(str);
}

}

class Testprinter {

public static void main (String args[])
{

printer p1 = new printer();
p1.print(10);
p1.print('A');
p1.print("FirstBit");
p1.print();
}
}
