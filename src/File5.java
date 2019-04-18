import java.io.*;

public class File5 
{
    public static void main(String[]args) throws FileNotFoundException, IOException
    {
        
        
        
        
        Writer f1=new FileWriter("D://prasad//prasad1.txt");
             //f1.write(78);
             f1.write("rama chandra pra");
             
             f1.close();
    System.out.println("write success");
    
    Reader f=new FileReader("D://prasad//prasad1.txt");
    
                   int data=f.read();
                   
                   while(data!=-1)
                   {
                       System.out.print((char)data);
                        data=f.read();
                   }
                   
                    System.out.println("read success");
                   
                   
                   

     
    }
}

    