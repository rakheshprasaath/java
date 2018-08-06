import java.util.Scanner;

public class Main

{

	public static void main(String[] args)

	{

	    Scanner s = new Scanner(System.in);

	    System.out.println("if the elements are");

	    int [] arr= new int[5];

	    for (int i=0;i<5;i++)

	    {

	      arr[i]=s.nextInt();

	    }

	    int [] aarr= new int[25];

	    int [] carr= new int[5];

	    int count=0;

	    for(int i=0;i<5;i++)

	    {

			for(int j=0;j<5;j++)

			{

				aarr[count]=arr[i] + arr[j];

				count=count+1;

			}

	    }

	    for(int i=0;i<5;i++)

	    {

		for(int j=0;j<25;j++)

		{

		 if(arr[i] == aarr[j])

		    carr[i]=1;

		}

		if(carr[i] != 1)

		  carr[i]=0;

	    }

	    int min=arr[0];

	    for(int i=0;i<5;i++)

	    {

		if ((min>arr[i]) && (carr[i]==0))

		{

		  min=arr[i];

		}

	    }

	    System.out.println("value is "+min);

	}

}