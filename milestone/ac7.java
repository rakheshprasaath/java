import java.util.Scanner;

public class Main

{

	public static void main(String[] args)

	{

	    Scanner s = new Scanner(System.in);

	    System.out.println("if the elements are");

	    int [] arr= new int[6];

	    for (int i=0;i<arr.length;i++)

	    {

	      arr[i]=s.nextInt();

	    }

	    int min=arr[0];

	    for (int i=0;i<arr.length;i++)

	    {

	        if(min>arr[i])

	          min=arr[i];

	    }

	    if(min == 0)

	      System.out.println("result is "+min);
    
	    else

	      System.out.println("the result is"+min-1);

	}

}
