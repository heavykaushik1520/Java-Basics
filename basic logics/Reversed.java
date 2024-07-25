import java.util.Scanner ;
public class Reversed
{
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     int a[] = new int[5];
     
     for(int i = 0 ; i < a.length ; i++)
     {
       System.out.print("Enter the number:  ");
       a[i] = sc.nextInt();
     }
     
     System.out.println("Reverse array is : ");
     for(int i = a.length - 1 ; i>=0 ; i--)
     {
       System.out.println(a[i] + " ");
  }
 }
}
