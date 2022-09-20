import java.util.Scanner;

public class Listing2_6 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		System.out.print("Enter a degree in Fahrenheit");
		double fahrenheit = input.nextDouble();

		// Convert Fahrenheit to Celcius 
		double celcius = (fahrenheit - 32) * (5.0 / 9);
		System.out.println("Fahrenheit " + fahrenheit +	 " is " + celcius + " in Celcius");
	}
}
