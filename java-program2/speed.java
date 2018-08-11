import java.util.Scanner;
public class speed {

	/**
	 * @calculate speed
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Input distance in meters:");
		double mtrs = s.nextDouble();
		System.out.println("Input hours:");
		double h = s.nextDouble();
		System.out.println("Input minutes:");
		double m = s.nextDouble();
		System.out.println("Input seconds:");
		double se = s.nextDouble();
		double timeSeconds;
		double mps,kph, mph;
		timeSeconds = (h*3600) + (m*60) + se;
		mps = mtrs / timeSeconds;
		kph = ( mtrs/1000.0f ) / ( mtrs/3600.0f );
		mph = kph / 1.609f;
		System.out.println("Your speed in meters/second is "+mps);
		System.out.println("Your speed in km/h is "+kph);
		System.out.println("Your speed in miles/h is "+mph);
	}

}
