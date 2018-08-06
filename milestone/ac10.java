//find surface and area of the cone
import java.util.Scanner;
public class Main
 {

	public static void main(String args[])
       {
	  Scanner sc=new Scanner(System.in);
          System.out.println("Enter the radius and height of cone");
	  double R=sc.nextDouble();
       	  double H=sc.nextDouble();
          System.out.println("Surface area="+(3.14 * R * (R + Math.sqrt(R*R + H*H))));
	  System.out.println("Volume="+(1.0/3.0*3.14*R*R*H));
		
	}

}