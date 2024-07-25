import java.io.*;
class Array2
{
  public static void main(String args[]) throws IOException
  {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("How many subjects? ");
      int n = Integer.parseInt(br.readLine());
      
      int marks[] = new int[n];

      for(int i=0 ; i<n ; i++)
      {
       System.out.print("Enter marks: ");
       marks[i] = Integer.parseInt(br.readLine());
      }   
       //find total marks
       int tot = 0;
       for(int i=0 ; i<n ; i++)
       tot = tot + marks[i];
       System.out.println("Total Marks =" + tot);
       
       float percent = (float)tot / n ;
       System.out.println("Percentage = " + percent); 
  }
}