public class InterThreadCom
{
    public static void main(String[]args)
    {
        Customer c=new Customer();
        new Thread()
        {
            public void run()
            {
                c.withDraw(1000);
            }
        }.start();
       new Thread()
       {
           public void run()
           {
               c.deposit(20000);
           }
       }.start();
    }
}
class Customer
{
    int amount=500;
    
    synchronized void withDraw(int amount)
    {
        System.out.println("availablebalance is"+this.amount);
        System.out.println("withdrawable balance is "+amount);
        
    
    if(this.amount<amount)
    {
        System.out.println("waiting for deposit");
        
        
        try{
            wait();
            
        }
        catch(Exception ae)
        {
            ae.printStackTrace();
        }
    }
         this.amount=this.amount-amount;
         
         System.out.println("detected amount is "+amount);
         System.out.println("balanced amount is"+this.amount);
    }
    
    synchronized void deposit(int amount)
    {
      
        System.out.println("going to deposit money is"+amount);
        this.amount=this.amount+amount;
        
        System.out.println("avalable amount is "+this.amount);
             
        notify();
        System.out.println("transaction complete");
        
    }
}
