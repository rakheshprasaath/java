import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	   	Scanner s = new Scanner(System.in);
	   	String st;
	   	char c;
	    System.out.println("enter the character to search");
	    c = s.nextLine().charAt(0);
	   	System.out.println("enter the string");
	   	st=s.nextLine();
	    int count=0;
	    int [] p= new int[5];
	   	for(int i=0;i<(st.length());i++)
	   	 {
	   	   if(st.charAt(i) == c)
	   	   {
	   	      p[count]=i;
	   	      count=count+1;
	   	   }
	   	 }
	   	System.out.println("the position are");
	   	for(int i=0;i<count;i++)
	       System.out.println(p[i]);
	   	System.out.println("counts are"+count);
	   
	   
	}
}
