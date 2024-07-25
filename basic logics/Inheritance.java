class Kaushik
{
  void display()
{
 System.out.print("Super Class");
}
}
class A extends Kaushik
{
 void display()
{
 System.out.println("Sub Class");
 super.display();
}
}
class Inheritance
{
public static void main(String args[])
{
 //Kaushik k = new Kaushik();
  A a = new A();
 a.display();
}
}