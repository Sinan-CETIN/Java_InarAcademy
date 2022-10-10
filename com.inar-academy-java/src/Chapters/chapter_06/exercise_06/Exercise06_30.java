package Chapters.chapter_06.exercise_06;

public class Exercise06_30 {
    public static void main(String[] args) {
        int dice1 = rollDice();
        int dice2 = rollDice();

        if (normalWin(dice1 + dice2)) {
            System.out.println("You rolled " + dice1 + " and " + dice2 +
                    "\nYou win");
        } else if (normalLose(dice1 + dice2)) {
            System.out.println("You rolled " + dice1 + " and " + dice2 +
                    "\n You lose");
        } else {
            System.out.println("You rolled " + dice1 + " and " + dice2 +
                    "\nThe point is " + (dice1 + dice2));
            System.out.println("-------------------");
            int roll = dice1 + dice2;
            do {
                dice1 = rollDice();
                dice2 = rollDice();
                System.out.println("You rolled " + dice1 + " and " + dice2 +
                        "\nThe point is " + (dice1 + dice2));
                if (win(roll, (dice1 + dice2)))
                    System.out.println("You win");
                if (lose(dice1 + dice2))
                    System.out.println("You lose");
                System.out.println("-------------------");
            } while (!win(roll, (dice1 + dice2)) && !lose(dice1 + dice2));

        }
    }


    public static boolean normalWin(int roll) {
        if (roll == 7 || roll == 11)
            return true;
        return false;
    }

    public static boolean normalLose(int roll) {
        if (roll == 2 || roll == 3 || roll == 12)
            return true;
        return false;
    }

    public static int rollDice() {
        return 1 + (int) (Math.random() * 6);
    }

    public static boolean win(int roll1, int roll2) {
        if (roll1 == roll2) {
            return true;
        }
        return false;
    }

    public static boolean lose(int roll) {
        if (roll == 7)
            return true;
        return false;
    }
}
