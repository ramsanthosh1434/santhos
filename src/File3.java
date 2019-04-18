import java.util.*;
import java.io.FileOutputStream; 
import java.io.*;
public class File3
{
    public static void main(String[]args) throws IOException
    {
        Scanner sc =new Scanner(System.in);
        try
        {
        System.out.println("plzz enter the path");
         String name=sc.nextLine();
         
     FileOutputStream f=new FileOutputStream(name);
         
     f.write(68);
     f.write(69);
     
     String s="vechalapu Rama chandra prasad, miracle software";
     
     byte b[]=s.getBytes();
     
     f.write(b);
     
     f.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        } 
     
    }
}    
    