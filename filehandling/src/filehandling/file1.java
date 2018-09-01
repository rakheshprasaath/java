package filehandling;

import java.io.FileOutputStream;  
public class file1 {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fp=new FileOutputStream("file.txt");    
             String s="hi this is file handling";    
             byte b[]=s.getBytes();//converting string into byte array    
             fp.write(b);    
             fp.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  