import java.io.*;
class Person
{
 //instance variable
 private String name;
 private int age;
 //parameterized constructor
 Person(String s,int i)
 {
   name = s;
   age = i;
 }
 public void check()
 {
   if(age<=30)
   System.out.println(name + "is young");
   else if(age<=50)
   System.out.println(name + "is middled age");
   else
   System.out.println(name + "is older" );
   }
}
class Demoo
{
  public static void main(String args[]) throws IOException
{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  String s = args[0];
  int i=Integer.parseInt(args[1]);
  
  Person p = new Person(s,i);
  p.check();
 }
}