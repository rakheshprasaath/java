import java.util.Scanner;

//reverse the digit
public class Main

{

	public static void main(String[] args)
 
	{

		System.out.println("enter the integer value with two or more digit");

		Scanner s=new Scanner(System.in);

		int i=s.nextInt();

		int reversedNum=0,last_digit=0;

		 while (Integer.toString(i).length() == 1)

                   {
  
                   System.out.println("enter the integer value equal to or more than two digit");

                      i=s.nextInt();

                    }

                while (i != 0)

		{
    
             last_digit = i % 10;

                 if (last_digit != 0)

                   {
     
                reversedNum = reversedNum * 10 + last_digit;



                   }

                 i = i / 10;
 
               } 
               System.out.println("the reversed digit"+reversedNum);
 
	}

}
