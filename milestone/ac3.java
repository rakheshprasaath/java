// lexical order of the given array
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        String arr[]=new String[10];
        System.out.print("enter the 10 arrays");
        for(int i=0;i<10;i++)
         arr[i]=s.nextLine();
        for(int i = 0; i < 9; ++i) 
        {
            for (int j = i + 1; j < 10; ++j) 
            {
                if (arr[i].compareTo(arr[j]) > 0)
                {
                    // swap words[i] with words[j]
                   String temp = arr[i];
                   arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("In lexicographical order:");
       for(int i = 0; i < 10; i++)
         {
            System.out.println(arr[i]);
        }
    }
}