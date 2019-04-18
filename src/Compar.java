
import java.util.TreeSet;

class Compar
{
    int roll;
  String name;
  
    Compar(int roll,String name)
    {  
        this.roll=roll;
        this.name=name;
        
        
    }
}
public class Compare
{
    public static void main(String [] args)
    {
        
        
        TreeSet<Compar>  ts=new TreeSet<Compar>();
        
             ts.add(new Compar(10,"prasad"));
       // Student ob=new Student(10,"prasad");
         //Student ob1=new Student(20,"vechalapu");
         // Student ob2=new Student(30,"prabha");
         
         System.out.println(ts);
    }
}