import java.util.Scanner;
public class sumthedigit3 {

	/**
	 * @sum the digit
	 */
	public static void main(String[] args)
	{
		System.out.println("enter a integer between 10 to 1000");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		int last_digit=0,sum=0;
        while (i != 0)
         {   
           last_digit = i % 10;
           if (last_digit != 0)
             {
               sum = sum + last_digit;
             }
           i = i / 10;
         } 
       System.out.println("the sum of the digit is"+sum);

	}

}
