package filehandling;

import java.io.FileInputStream;  
public class file2 {  
     public static void main(String args[]){    
          try{    
            FileInputStream fp=new FileInputStream("file.txt");
            int i=0;    
            while((i=fp.read())!=-1){ 
            char a=(char)i;
            int b=Character.getNumericValue(a);  
            if(b!=-1) {
             System.out.print(b);    
            }
            break;
            }    
            fp.close();    
          }catch(Exception e){System.out.println(e);}    
         }
}