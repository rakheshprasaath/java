import java.util.Scanner;
public class prg1 {

	/**
	 * @convert farenheit to celcious
	 */
	public static void main(String[] args)
	{
		double c,f;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit:");
        f = s.nextDouble();
        c = (f-32)*(0.555);
        System.out.println("Temperature in Celsius:"+c);    
	}

}
