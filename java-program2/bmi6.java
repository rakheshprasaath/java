import java.util.Scanner;
public class bmi6 {

	/**
	 * @BMI rate
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("Input weight in pounds: ");
        double weight = s.nextDouble();
        System.out.print("Input height in inches: ");
        double inches = s.nextDouble();
        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.print("Body Mass Index is " + BMI+"\n");

	}

}
