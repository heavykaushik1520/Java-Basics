import java.util.Scanner;
public class FourDigit
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int a[] = new int[5];
    for(int i = 0 ; i < a.length ; i++)
    {
      System.out.print("Enter numbers : ");
      a[i] = sc.nextInt();
   }
   System.out.println("Four digits numbers are: ");
   for(int i = 0 ; i < a.length ; i++)
   {
    if(a[i] > 999 && a[i] < 10000)
    System.out.println(a[i] + " ");
   }
   } 
}