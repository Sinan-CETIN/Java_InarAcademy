import java.sql.SQLOutput;
import  java.util.Scanner;

public class Exercise05_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean computerWin;
        boolean youWin;

        do{
            System.out.print("scissor (0), rock (1), paper (2):");

            int guess = input.nextInt();
            int computer = (int)(Math.random() * 3);
            System.out.print("The computer is ");
            switch(computer) {
                case 0:System.out.print("scissor.");break;
                case 1:System.out.print("rock.");break;
                case 2:System.out.print("paper.");
        }
            System.out.print(" You are ");
            switch(guess) {
                case 0:
                System.out.print("scissor.");
                break;
                 case 1:
                System.out.print("rock.");
                break;
                case 2:
                System.out.print("paper.");
            }
             computerWin = (guess == 0 && computer == 1) || (guess == 1 && computer == 2) || (guess == 2 && computer == 0);
             youWin = (guess == 0 && computer == 2) || (guess == 1 && computer == 0) || (guess == 2 && computer == 1);
            if(!computerWin && !youWin)
                System.out.println("It is a draw.Play again.");
        }while(!computerWin && !youWin);
        if(computerWin)
            System.out.println("Computer Win!");
        else
            System.out.println("You win!");

    }
}
