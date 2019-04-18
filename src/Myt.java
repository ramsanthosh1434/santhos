class Myt1 extends Thread
{

   synchronized  public void run( )
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
            
        }
    }
}
    
 class Myt2 extends Thread
  {
  synchronized  public void run( )
    {
        for(int i=5;i<11;i++)
        {
            System.out.println(i);
            
        }
    }
      
  }

public class Myt
{
    
public static void main(String [] args)
{
    Myt1 ob=new Myt1();
    ob.start();
    Myt2 ob1=new Myt2(); 
    ob1.start();
}
}
