import java.util.Scanner;

public class Exercise02_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and a gratuity rate:");
		double subTotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		double total = (subTotal * gratuityRate / 100 ) + subTotal;
		System.out.println("The gratuity is " + (subTotal * gratuityRate / 100 ) + " and total is " + total);
	}
}
