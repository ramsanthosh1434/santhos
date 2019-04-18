
import java.util.TreeSet;

class Comparators
{
    int roll;
  String name;
  
    Comparators(int roll,String name)
    {  
        this.roll=roll;
        this.name=name;
        
        
    }
}
public class Comparators
{
    public static void main(String [] args)
    {
        
        
        TreeSet<Comparators>  ts=new TreeSet<Comparators>();
        
             ts.add(new Comparators(10,"prasad"));
       // Student ob=new Student(10,"prasad");
         //Student ob1=new Student(20,"vechalapu");
         // Student ob2=new Student(30,"prabha");
         
         System.out.println(ts);
    }
}