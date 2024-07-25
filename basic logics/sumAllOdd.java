import java.util.*;
public class sumAllOdd
{
   public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int sumOdd = 0;
       System.out.println("Enter 5 elements array");
       int Arr[] = new int[5] ;
       
       for(int i = 0 ; i < Arr.length ; i++)
       Arr[i] = sc.nextInt();
      
       for(int i = 0 ; i < Arr.length ; i++)
         {
            if(Arr[i]%2 != 0)
             {
               sumOdd = sumOdd + Arr[i];
             }
        }
        System.out.println("Sum of odd numbers =" + sumOdd);
    }
 }