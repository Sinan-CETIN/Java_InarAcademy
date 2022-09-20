import java.util.Scanner;

public class Exercise02_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter investment amount:");
		double investmentValue = input.nextDouble();
		System.out.print("Enter annual interest rate in percentage:");
		double interestRate = input.nextDouble();
		System.out.print("Enter number of years:");
		int year = input.nextInt();
		double futureInvestmentValue = investmentValue * Math.pow((1 + (interestRate / 1200)), (year * 12));
		System.out.println("Accumulated value is " + futureInvestmentValue );


	}

}
