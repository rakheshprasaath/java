import java.util.Scanner;
public class scf8 {

	/**
	 * @suare cube fouth power
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
        System.out.print("Input the side length value: ");
        double val = s.nextDouble();
        System.out.printf("Square: %12.2f\n", val * val);
        System.out.printf("Cube: %14.2f\n", val * val * val);
        System.out.printf("Fourth power: %6.2f\n", Math.pow(val, 4));
	}

}
