class JoinMethods extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread()+" "+i);  
           
                }
        
        try{
            Thread.sleep(1000);
        }
        catch(Exception ae)
        {
            System.out.println(ae);
        }

    }
public static void main(String[ ]args)
{
    JoinMethods ob=new JoinMethods();
      JoinMethods ob1=new JoinMethods();
      // JoinMethods ob2=new JoinMethods();
      // ob.setName("one");
      //  ob1.setName("two");
       //  ob2.setName("three");
    
    
    //System.out.println(ob.getName());
    // System.out.println(ob1.getName());
    //  System.out.println(ob2.getName());
     ob.start();
     ob1.start();
   
   try{
        ob.join();
    }
    catch(Exception ae)
    {
        ae.printStackTrace();
    }
  
    //ob1.setPriority(1);
    //System.out.println(ob1.getPriority());
  //  ob2.start();
}
}