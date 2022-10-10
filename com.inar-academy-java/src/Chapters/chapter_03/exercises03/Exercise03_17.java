import java.util.Scanner;

public class Exercise03_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("scissor (0), rock (1), paper (2):");
		int guess = input.nextInt();
		int computer = (int)(Math.random() * 3);
		if((guess == 0 && computer == 2) || (guess == 1 && computer == 0) || (guess == 2 && computer == 1)) {
			System.out.print("The computer is ");
			switch(computer) {
			case 0:System.out.print("scissor.");break;
			case 1:System.out.print("rock.");break;	
			case 2:System.out.print("paper.");
			}
			System.out.print(" You are ");
			switch(guess) {
			case 0:System.out.print("scissor.");break;
			case 1:System.out.print("rock.");break;	
			case 2:System.out.print("paper.");
		}
		System.out.println("You won!");
		}
		else if((guess == 0 && computer == 1) || (guess == 1 && computer == 2) || (guess == 2 && computer == 0)) {
			System.out.print("The computer is ");
			switch(computer) {
			case 0:System.out.print("scissor.");break;
			case 1:System.out.print("rock.");break;	
			case 2:System.out.print("paper.");
			}
			System.out.print(" You are ");
			switch(guess) {
			case 0:System.out.print("scissor.");break;
			case 1:System.out.print("rock.");break;	
			case 2:System.out.print("paper.");
			}
			System.out.println("Computer won!");
			}
		else {
			System.out.print("The computer is ");
			switch(computer) {
			case 0:System.out.print("scissor.");break;
			case 1:System.out.print("rock.");break;	
			case 2:System.out.print("paper.");
			}
			System.out.print(" You are ");
			switch(guess) {
			case 0:System.out.print("scissor.");break;
			case 1:System.out.print("rock.");break;	
			case 2:System.out.print("paper.");
			}
			System.out.println("it is a draw.");
		}	
	}

}
