import java.util.*;

import java.io.*;
public class File2
{
    public static void main(String[]args) throws IOException
    {
        File f=new File("D://prasad//prasad1.txt");
        
     //  boolean status=  f.mkdir();
       //System.out.println(status);
      if(f.createNewFile())
      {
          System.out.println("succes");
      }
        else
      {
          System.out.println("fail");
     
      }
     
    }
}