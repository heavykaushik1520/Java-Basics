import java.io.*;
class Person
{
 private String name;
 private int age;
 public void accept() throws IOException
{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Enter the name : ");
 name = br.readLine();
 System.out.print("Enter the age: ");
 age = Integer.parseInt(br.readLine());
 }
 public void check()
 {
   if(age<=30)
   System.out.println(name + "is young");
   else if(age<=50)
   System.out.println(name + "is middle age");
   else
   System.out.println(name + "is older");
  }
 }
 class Demo
{
  public static void main(String args[]) throws IOException
   {
     Person p = new Person();
    
    p.accept();
    p.check();
}
}