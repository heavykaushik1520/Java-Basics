import java.util.Scanner;
class Marks
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int r_No[] = new int[3];
    int m1[] = new int[3];
    int m2[] = new int[3];
    int m3[] = new int[3];
    int total[] = new int[3];
    double avg[] = new double[3];
  
    for(int i = 0 ; i < r_No.length ; i++)
    {
      System.out.println(" Enter roll no: ");
      r_No[i] = sc.nextInt();
      System.out.println(" Enter marks 1: ");
      m1[i] = sc.nextInt();
      System.out.println(" enter marks 2: ");
      m2[i] = sc.nextInt();
      System.out.println(" Enter marks 3: ");
      m3[i] = sc.nextInt();
      }
     
     for(int i = 0 ; i < r_No.length ; i++)
     {
      total[i] = m1[i] + m2[i] + m3[i];
      avg[i]= total[i] / 3.0 ;
     }
     for(int i = 0 ; i < r_No.length ; i++)
     {
      System.out.println(r_No[i] + " ");
      System.out.println(total[i] + "total marks ");
      System.out.println(avg[i] + "percetnage ");
    }
  }
}