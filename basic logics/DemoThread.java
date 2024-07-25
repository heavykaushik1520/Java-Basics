class Mythread implements Runnable
{
 public void run()
{
 System.out.print("Kaushik");
}
}
class DemoThread
{
  Mythread ob = new Mythread();
  //Thread t = new Thread(ob);
  //t.start();
ob.start();
 }