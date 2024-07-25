import java.util.*;
class arrayReverse
{
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter 5 array elememts:");
     int Arr[] = new int[5];
      
     for(int i=0 ; i<Arr.length ; i++)
     //System.out.println("Original Array : ");
     Arr[i] = sc.nextInt();
    // System.out.println("Original Array : ");

     for(int j = 0 ; j < Arr.length ; j++)
     System.out.println(Arr[j]);

     System.out.println("Reverse Array : ");
     for(int k = Arr.length - 1 ; k >= 0 ; k--)
     System.out.print(Arr[k] + " ");
    }
}
    
     
