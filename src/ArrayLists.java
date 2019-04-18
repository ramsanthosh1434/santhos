
import java.util.*;

public class ArrayLists
        
 {
    public static void main(String[]args)
    {
       List ob=new ArrayList();
       ob.add(10);
       ob.add("prasad");
       ob.add(2,"orange");
     //  ob.remove(0);
     
   //  System.out.println("contains prasad"+ob.contains("prasad"));
     
        
      /*  System.out.println(ob);
        System.out.println("size"+ob.size());

        System.out.println("hashcode"+ob.hashCode());  
     */
      

       List ob1 =new LinkedList();
            ob1.add(10);
            ob1.add("raju");
        
      // ob1.clear();
        //System.out.println(ob1);
        
        
        
            
         System.out.println("containsall"+"  " +ob1.containsAll(ob));
          
             /*  
             System.out.println("retaining"+ob.retainAll(ob1));    
        System.out.println("after retainig"+ob);
             */
           //  ob.addAll(ob1);
             
       //   System.out.println("after adding"+ob);
       
       
     //  ob.removeAll(ob1);
     //    System.out.println("after removing"+ob); 
         
         
         
         
         
         
         
    }
    
}