

import java.util.*;
class MapsInter
{
    public static void main(String[]args)
    {
       Map ob=new HashMap();
           ob.put(1,"prasad");
           ob.put(2,"raju");
           ob.put(3,"suresh");
          //System.out.println(ob);
          
        
          Set ob1;
        ob1 =  (Set) ob.entrySet();
          
         
           Iterator itr=ob1.iterator();
          
          while(itr.hasNext())
          {
            Map.Entry ent=(Map.Entry)itr.next();
              System.out.println(ent.getKey()+" "+ent.getValue());
          }
          
          
         
           
           
           
    }
}