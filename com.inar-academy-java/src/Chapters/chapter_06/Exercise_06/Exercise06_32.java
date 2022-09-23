package Chapters.chapter_06.Exercise_06;

public class Exercise06_32 {
    public static void main(String[] args) {
        int countWin = 0;
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
            if (playCrap()) {
                countWin++;
            }
        }
        System.out.println(countWin +" win in 10000 games.");
    }

    public static boolean playCrap() {
        int dice1 = Exercise06_30.rollDice();
        int dice2 = Exercise06_30.rollDice();

        if (Exercise06_30.normalWin(dice1 + dice2)) {
            System.out.println("You rolled " + dice1 + " and " + dice2 +
                    "\nYou win");
            return true;
        } else if (Exercise06_30.normalLose(dice1 + dice2)) {
            System.out.println("You rolled " + dice1 + " and " + dice2 +
                    "\n You lose");
            return false;
        } else {
            System.out.println("You rolled " + dice1 + " and " + dice2 +
                    "\nThe point is " + (dice1 + dice2));
            System.out.println("-------------------");
            int roll = dice1 + dice2;
            do {
                dice1 = Exercise06_30.rollDice();
                dice2 = Exercise06_30.rollDice();
                System.out.println("You rolled " + dice1 + " and " + dice2 +
                        "\nThe point is " + (dice1 + dice2));
                if (Exercise06_30.win(roll, (dice1 + dice2))) {
                    System.out.println("You win");
                    return true;
                }
                if (Exercise06_30.lose(dice1 + dice2)) {
                    System.out.println("You lose");
                    return false;
                }
                System.out.println("-------------------");
            } while (!Exercise06_30.win(roll, (dice1 + dice2)) && !Exercise06_30.lose(dice1 + dice2));
        }
        return true;
    }
}
