import java.util.* ;
public class evenNumbers
{
   public static void main(String[] args )
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 10 element Array");
       int Arr[] = new int[10];
       
       for(int i = 0 ; i < Arr.length ; i++)
       Arr[i] = sc.nextInt();
       
       System.out.println("Even numbers: ");
       for(int i = 0 ; i < Arr.length ; i++)
       {
         if(Arr[i]%2==0)
          {
            System.out.println(Arr[i] + " ");
          }
   }
}
}