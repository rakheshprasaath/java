import java.util.Scanner;
public class breakdigit {

	/**
	 * @break the digit
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
        System.out.print("Input six non-negative digits: ");
        int digit=s.nextInt();
        int last_digit=0,i;
        int c;
        c = Integer.toString(digit).length();
        int[] arr=new int[c];
        for( i=c;i >= 0;i++)
        {
        	last_digit = digit % 10;
        	arr[i] = last_digit;
        	digit = digit / 10;
        }
        System.out.println("");
        i=0;
        while ( i < c)
        {   
        	 System.out.print(arr[i]);
             i++;
        } 
        
	}

}
