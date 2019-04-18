import java.util.*;
public class ArrayListClas
        {
public static void main(String []args)

{
List ob=new LinkedList();
  

ob.add("prasad");
ob.add("Santhu");
ob.add("gkk");

//System.out.println(ob);


Iterator ob1=ob.iterator();
    
while(ob1.hasNext())
{
    Object entry=ob1.next();
    System.out.println(entry);
}
}
}

   
