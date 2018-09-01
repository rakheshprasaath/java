package filehandling;

import java.io.FileOutputStream;  
public class simple
{  
    public static void main(String args[])
    {    
           try{    
             FileOutputStream fp=new FileOutputStream("file.txt");    
             fp.write(65);
             fp.write(66);
             fp.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  