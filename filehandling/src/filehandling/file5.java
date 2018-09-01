package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
 
public class file5 
{      
    public static void main(String[] args)
    {    
        BufferedReader reader = null; 
         
        BufferedWriter writer = null;
                 
        //Create an ArrayList object to hold the lines of input file
         
        ArrayList<Integer> lines = new ArrayList<Integer>();
         int a;
        try
        {
            //Creating BufferedReader object to read the input file
             
            reader = new BufferedReader(new FileReader("input.txt"));
             
            //Reading all the lines of input file one by one and adding them into ArrayList
             
            String currentLine = reader.readLine();
             
            while (currentLine != null) 
            {
            	a=Integer.parseInt(currentLine);
                lines.add(a);
                 
                currentLine = reader.readLine();
            }
            
            //Sorting the ArrayList
             
            Collections.sort(lines);
            ArrayList<String> line = new ArrayList<String>(lines.size());
            
    		for (Integer myInt : lines) { 
    		  line.add(String.valueOf(myInt)); 
    		}
             
            //Creating BufferedWriter object to write into output file
             
            writer = new BufferedWriter(new FileWriter("output.txt"));
             
            //Writing sorted lines into output file
             
            for (String lin : line)
            {
                writer.write(lin);
                 
                writer.newLine();
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        finally
        {
            //Closing the resources
             
            try
            {
                if (reader != null)
                {
                    reader.close();
                }
                 
                if(writer != null)
                {
                    writer.close();
                }
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    }    
}