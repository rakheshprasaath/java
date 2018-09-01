package filehandling;

import java.io.*;  
public class file4{    
 public static void main(String args[]){    
  try{    
    FileInputStream fp=new FileInputStream("file.txt");    
    BufferedInputStream bp=new BufferedInputStream(fp);    
    int i;    
    while((i=bp.read())!=-1){    
     System.out.print((char)i);    
    }    
    bp.close();    
    fp.close();    
  }catch(Exception e){System.out.println(e);}    
 }
}