import java.util.Scanner;

public class Exercise03_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter r1's center x-, y-coordinates, width, and height:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double width1 = input.nextDouble();
		double height1 = input.nextDouble();
		
		
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double width2 = input.nextDouble();
		double height2 = input.nextDouble();
		
		if(Math.abs(x1 + width1 / 2) > Math.abs(x2 + width2 / 2) && 
		Math.abs(y1 + height1 / 2) > Math.abs(y2 + height2 / 2))
			System.out.println("r2 is inside r1");
		else if(Math.abs(x1 + width1 / 2) > Math.abs(x2 - width2 / 2) && 
				Math.abs(y1 + height1 / 2) > Math.abs(y2 - height2 / 2))
			System.out.println("r2 overlaps r1");
		else
			System.out.println("r2 does not overlaps r1");
	}

} 
