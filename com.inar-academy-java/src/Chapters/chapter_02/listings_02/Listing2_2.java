import java.util.Scanner;

public class Listing2_2 {
	public static void main(String[] args){
		//Create a Scanner Object
		Scanner input=new Scanner(System.in);

		//Prompt user to enter a radius
		System.out.println("Enter  a number for radius :");
		double radius=input.nextDouble();

		// Compute area and display
		double area=radius * radius * 3.14159;
		
		System.out.println("The area for the circle of radius" + radius + " is " + area );
	}
}
