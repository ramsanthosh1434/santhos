
import java.util.*;

import java.io.*;
public class File1
{
    public static void main(String[]args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("plzz enter the name of the file");
        
       // String name=sc.nextLine();
        
        File f=new File("D://prasad//prasad1.txt");
        
        if(f.exists())
        {
            System.out.println("name is "+f.getName());
            
        }
      
        else 
        {
            System.out.println("no file in this name");
        }
        
        System.out.println(f.length());
        System.out.println(f.getPath());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
    }
}