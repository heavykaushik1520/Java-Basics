//Write a program to take in 10 values and print only those nos which are prime.
import java.util.*;
public class primeArray
{
   public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    int arr[] = new int[10];
    System.out.println("Enter 10 element array: ");
    for(int i = 0 ; i < arr.length ; i++)
    {
     arr[i] = sc.nextInt();
     }
     System.out.println("Prime numbers: ");
    for(int i = 0 ; i < arr.length ; i++)
    {
     int j = 2;
     int p = 1;
     while(j < arr[i])
     {
      if(arr[i] % j == 0)
      {
        p = 0;
        break ;
      }
       j++ ;
    }
    if(p==1)
    System.out.println(" " + arr[i]);
  }
}
}