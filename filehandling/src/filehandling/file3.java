package filehandling;

import java.io.*;  
public class file3{    
public static void main(String args[])throws Exception{    
     FileOutputStream fp=new FileOutputStream("file.txt");    
     BufferedOutputStream bp=new BufferedOutputStream(fp);    
     String s="hi this is file handling.";    
     byte b[]=s.getBytes();    
     bp.write(b);    
     bp.flush();    
     bp.close();    
     fp.close();    
     System.out.println("success");    
}    
}  