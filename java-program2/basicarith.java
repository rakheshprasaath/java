import java.util.Scanner;
public class basicarith {

	/**
	 * @basic operation
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Input 1st integer:");
		int in1=s.nextInt();
		System.out.println("Input 2nd integer:");
		int in2=s.nextInt();
		System.out.println("Sum of two integers:"+(in1+in2));
		System.out.println("Difference of two integers:"+(in1-in2));
		System.out.println("Product of two integers:"+(in1*in2));
		System.out.println("Average of two integers:"+((in1+in2)/2));
		System.out.println("Distance of two integers:"+(in1-in2));
		System.out.println("Max integer:"+Math.max(in1,in2));
		System.out.println("Max integer:"+Math.min(in1,in2));
	}

}
