
import java.util.*;

class Employee
{
    int id;
    String name;
    Employee(int id,String name)
    {
        this.id=id;
        this.name=name;
        
    }
}

  
    
public class Set
{
    public static void main(String[]args)
    {
         
         
    Employee ob1=new Employee(10,"prasad");
     Employee ob2=new Employee(20,"pavan");
      Employee ob3=new Employee(30,"sunil");
    
      List<Employee> ob=new ArrayList<Employee>();
          ob.add(ob1);
          ob.add(ob2);
          ob.add(ob3);
         Iterator itr=ob.iterator();  
    
  while(itr.hasNext()){  
    Employee st=(Employee)itr.next();  
    System.out.println(st.id+" "+st.name);  


         
    }
}

    Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}