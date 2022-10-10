
import java.util.Scanner;

public class Exercise03_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x and y:");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double distance = Math.sqrt(Math.pow(x - 0 + y - 0 , 2));
		if(distance <= 10)
			System.out.println("(" + x + " , "+ y + ") is in the circle its center is (0 , 0) and radius is 10");
		else
			System.out.println("(" + x + " , "+ y + ") is not in the circle its center is (0 , 0) and radius is 10");
	}

}
