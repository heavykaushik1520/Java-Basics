import java.util.Scanner;
public class Pallindrome
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter 5 elemements array:");
      int arr[] = new int[5];
      
      for(int i = 0 ; i < arr.length ; i++ )
      {
         arr[i] = sc.nextInt();
      }
      System.out.println("Palindrome numbers are : ");
     
     for(int i = 0 ; i < arr.length ; i++)
      {
        int no = arr[i];
        int sum = 0 ;
        while(no != 0)
        {
          int d = no % 10 ;
           sum  = sum*10 + d ;
            no  = no / 10 ;
        }
       if(sum == arr[i])
      System.out.println(arr[i] + "  " );
}
}
}