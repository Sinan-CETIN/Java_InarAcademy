import java.util.Scanner;

public class Exercise02_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount in int, for example for 11.56 Enter 1156: ");
		int amount = input.nextInt();
		int numberOfOneDollars = amount / 100;
		int remainingAmount = amount % 100;
		int numberOfQuarters =  remainingAmount / 25 ;
		remainingAmount =   remainingAmount % 25;
		int numberOfDimes =  remainingAmount / 10 ;
		remainingAmount =  remainingAmount % 10;
		int numberOfNickels =  remainingAmount / 5;
		remainingAmount =  remainingAmount % 5;
		int numberOfPennies =  remainingAmount;
		System.out.println("Your amount " + amount + " consist of\n    " + numberOfOneDollars + " dollars\n    " + numberOfQuarters + " quarters\n    " + numberOfDimes + " dimes\n"
				+ "    " + numberOfNickels + " nickels\n    " + numberOfPennies + " pennies"); 
	}
}
