import java.io.*;
class User
{
  public static void main(String args[]) throws IOExcpetions
{
   BufferedReader br = new BufferedReader(new SysytemInputReader(System.in));
   System.out.println("Enter the num: ");
   int num = Integer.parseInt(br.readline());
   System.out.print("Number is : " + num);
}
}
