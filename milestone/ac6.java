import java.util.Scanner;

public class Main

{

	public static void main(String[] args)

	{

	    Scanner s= new Scanner(System.in);

	    System.out.println("enter the numer of student");

            double st = s.nextDouble();

            System.out.println("enter the % of student attend the final");

            double c = s.nextDouble();

            System.out.println("enter the a/b two ratio value to find the total passed");

            double a = s.nextDouble(),b = s.nextDouble();

            double r,x=st*c,y=a/b;

            r=(x*y)/100;

            System.out.println("total students is"+r);

	}

}
