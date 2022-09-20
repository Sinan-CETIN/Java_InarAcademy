import java.util.Scanner;

public class Exercise03_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the exchange rate from dollars to RMB:");
		double rate = input.nextDouble();
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa:");
		int convert = input.nextInt();
		if(convert == 0) {
			System.out.print("Enter the dollar amount:");
			double amount = input.nextDouble();
			double yuan = amount * rate;
			System.out.println("§" + amount + " is " + yuan + " yuan");
		}
		else {
			System.out.print("Enter the RMB amount:");
			double amount = input.nextDouble();
			double dollar = amount / rate;
			System.out.println(amount + " yuan is §" + (int)(dollar * 100) / 100.0);
		}
			
		

	}

}
