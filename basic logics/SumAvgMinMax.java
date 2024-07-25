import java.util.*;
class SumAvgMinMax
{
  public static void main(String args[])
   {
     int sum = 0 , min , max ;
     double average ;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter 5 array elements: ");
     int Arr[] = new int[5];
     
     for(int i = 0 ; i < Arr.length ; i++)
     Arr[i] = sc.nextInt();
     System.out.println("Array : ");
     max = Arr[0];
     min = Arr[0];
     for(int j = 0 ; j < Arr.length ; j++)
     {
       if(min > Arr[j])
       {
         min = Arr[j];
       }
       if(max < Arr[j])
       {
         max = Arr[j];
        }
        sum = sum + Arr[j];
     }
      average = (double)sum / Arr.length ;
      System.out.println("Sum : " + sum);
      System.out.println("min : " + min);
      System.out.println("max : " + max);
      System.out.println("Average : " + average);
}
}