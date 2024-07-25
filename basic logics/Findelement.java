//Write a program that creates integer array of 10 elements, accepts values of arrays and Search for a number in an array of 10
import java.util.*;
public class Findelement
{
   public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
     int flag = 0 , x;
     System.out.println("Enter 10 elements of array");
     int arr[] = new int[10];
     for(int i = 0 ; i < arr.length ; i++)
     arr[i] = sc.nextInt();
     
     System.out.println("Enter the number that you want to find ");
     x = sc.nextInt();
 //    System.out.println(" " + x);
     int getarrIndex = 0 ;
     for(int j = 0 ; j < arr.length ; j++)
     {
       if(arr[j] == x)
       {
           flag = 1 ;
           getarrIndex = j ;
           break ;
       }
       else 
       flag = 0 ;
      }
      if(flag ==1)
      System.out.println("Elements found at position: " + getarrIndex );
      
      else
      System.out.println("Element not found");
}
}