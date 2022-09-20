
import java.util.Scanner;

public class Exercise03_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your lotter guess :");
		int guess = input.nextInt();
		
		int lottery = (int)(Math.random() * 900) + 100;
		
		int lotteryDigit1 = lottery % 10;
		int lotteryDigit2 = lottery / 10 % 10;
		int lotteryDigit3 = lottery / 100 % 10;
		
		int guessDigit1 = guess %10;
		int guessDigit2 = (guess / 10) % 10;
		int guessDigit3 = guess / 100 % 10;
		
		System.out.println("Lottery number is " + lottery + " your guess is " + guess);
		
		if(guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2 && guessDigit3 	== lotteryDigit3)
			System.out.println("you win §10,000.");
		else if((guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3) && (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3) && 
		(guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3))
			System.out.println("All numbers matched but not in exact order.You win §3,000.");
		else if((guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3) || (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3) ||
				(guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3))
			System.out.println("Only one digit matched.You win §1,000.");
		else
			System.out.println("No matched digit.Sorry you lose.");
		
		
	}

}
