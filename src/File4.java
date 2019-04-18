
    
import java.util.*;

import java.io.*;
public class File4
{
    public static void main(String[]args) throws IOException
    {
        Scanner sc =new Scanner(System.in);
       
        {
        System.out.println("plzz enter the path");
         String name=sc.nextLine();
FileInputStream f=new FileInputStream(name);


 int i,i1=0,vowels=0;
         char ch[]=new char[1000];
       while((i=f.read())!=-1)
       { 
           ch[i1]=(char)i;
    i1++;
     
          if( (ch[i1]=(char)i)=='a'|| (ch[i1]=(char)i)=='e'|| (ch[i1]=(char)i)=='i'|| (ch[i1]=(char)i)=='o'||(ch[i1]=(char)i)=='u')
           {
               
             //  System.out.println("vowels"+ch[i1]);
               vowels++;
           }
           
       } 
            System.out.println(vowels);
             
       
       
       
        
        }
       
       
       
       
       
}
    }


