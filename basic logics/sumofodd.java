//Write a program that creates integer array of 10 elements, accepts values of arrays and Find sum of all odd numbers
import java.util.*;
public class sumofodd
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int below18 = 0 , in1860 = 0 , above60 = 0 ;
    System.out.println("Enter 10 elements array : ");
    int arr[] = new int[10];
    for(int i = 0 ; i < arr.length ; i++)
     arr[i] = sc.nextInt() ;
    
    for(int i = 0 ; i < arr.length ; i++ )
    {
      if(arr[i] < 18)
         below18 += 1;
      else if(arr[i]>=18 && arr[i]<60)
        in1860 += 1 ;
      else 
        above60 += 1 ;
    }
    System.out.println("Sum of odd numbers: " + below18);
    System.out.println("Sum of odd numbers: " + in1860);
    System.out.println("Sum of odd numbers: " + above60);
    
    }
}