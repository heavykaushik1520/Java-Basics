public class ArraySquare
{
  static int A[] = {4 , 5 ,6 , 11 , 10};
  public static void main(String args[])
 {
    System.out.println("Index number \t Element at index \t Sqaure of element ");
    for(int x = 0 ; x < A.length ; x++)
    System.out.println("\t" + x + "\t\t" + A[x] + "\t\t\t" + (A[x] * A[x]) );
}
}