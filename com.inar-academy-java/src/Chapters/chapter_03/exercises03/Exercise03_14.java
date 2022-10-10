
import java.util.Scanner;

public class Exercise03_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Guess Head or Tail (enter 0 for Head or 1 for Tail):");
		int flip = (int)(Math.random() * 2);
		int guess = input.nextInt();
		
		if(guess == flip)
			System.out.println("Guess is correct.");
		else
			System.out.println("Guess is incorrect.");
			

	}

}
