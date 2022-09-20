import  java.util.Scanner;

public class Exercise05_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lotteryDigit1 = (int) (Math.random() * 9);
        int lotteryDigit2 = (int) (Math.random() * 9);

        while (lotteryDigit2 == lotteryDigit1)
            lotteryDigit2 = (int) (Math.random() * 9);

        System.out.print("Enter guess:");
        int guess = input.nextInt();
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        while (guessDigit1 == guessDigit2) {
            System.out.print("The digit int he guess must be diffirent.Please re-enter your guess:");
            guess = input.nextInt();
            guessDigit1 = guess / 10;
            guessDigit2 = guess % 10;
        }

        System.out.println("Guess is " + guess + " and lottery is " + lotteryDigit1 + lotteryDigit2);

        if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2)
            System.out.println("You win $10000");
        else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1)
            System.out.println("You win &3000");
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2  ||
        guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
            System.out.println("You win &1000");
        else
            System.out.println("Sorry!You lose.");
    }
}
