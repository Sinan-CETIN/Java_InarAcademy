import java.util.Scanner;

public class Exercise03_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Triang's points (x1 , y1 , x2 , y2 , x3 , y3):");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double side1 = Math.sqrt(Math.pow(x1 - x2 , 2) + Math.pow(y1 -y2 , 2));
		double side2 = Math.sqrt(Math.pow(x1 - x3 , 2) + Math.pow(y1 -y3 , 2));
		double side3 = Math.sqrt(Math.pow(x3 - x2 , 2) + Math.pow(y3 -y2 , 2));
		
		if((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2))
			System.out.println("The perimeter of the triangle is " + (side1 + side2 + side3));
		else
			System.out.println("Input is invalid.");
		

	}

}
