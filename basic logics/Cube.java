import java.util.Scanner;
public class Cube
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int a[] = new int[3];
       int cube[] = new int[3];
       
       for(int i = 0 ; i < a.length ; i++)
       {
         System.out.println("Enter Array Elements : ");
         a[i] = sc.nextInt();
        }
      
       System.out.print("Cubes of numbers: ");
       for(int i = 0 ; i < a.length ; i++)
      {
        cube[i] = a[i] * a[i] * a[i] ;
        System.out.println("Cube of" +  a[i]+ "is" + cube[i]);
      }
    }
}