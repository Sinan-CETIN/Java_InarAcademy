import java.util.Scanner;

public class Exercise03_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°);");
		double fahrenheit = input.nextDouble();
		if (fahrenheit > 41 || fahrenheit < -58) {
			System.out.println("invalid fahrenheit input");
			System.exit(1);
		}
		
		System.out.println("Enter the wind speed (>=2) in miles per hour:");
		double wind = input.nextDouble();
		if (wind < 2) {
			System.out.println("invalid wind input");
			System.exit(2);
		}

		double windChillIndex = 35.74 + 0.6215 * fahrenheit + 0.4275 * Math.pow(wind , 0.16) * fahrenheit - 35.75 * Math.pow(wind , 0.16);
	
		System.out.println("The wind chill index is " + windChillIndex);
	}

}
