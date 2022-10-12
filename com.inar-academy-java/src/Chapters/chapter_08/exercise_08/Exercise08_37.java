package Chapters.chapter_08.exercise_08;

import java.util.Scanner;

public class Exercise08_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] capitals = getCapitals();

        int countCorrect = askQuestins(capitals);

        System.out.println("The correct count is " + countCorrect);
    }

    public static int askQuestins(String[][] questions) {
        Scanner input = new Scanner(System.in);

        int correctCount = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.print("What is the capital of " + questions[i][0] + " ?");
            String answer = input.nextLine();
            if (isCorrect(answer, questions[i][1])) {
                correctCount++;
                System.out.println("Your answer is correct");
            } else {
                System.out.println("The correct answer should be " + questions[i][1]);
            }
        }
        return correctCount;
    }

    public static boolean isCorrect(String s1, String s2) {
        return s1.toUpperCase().equals(s2.toUpperCase());
    }

    public static String[][] getCapitals() {
        String[][] result = {{"Alabama", "Montgomery"},
                {"Alaska", "Juneau"},
                {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"},
                {"California", "Sacramento"},
                {"Colorado", "Denver"},
                {"Connecticut", "Hartford"},
                {"Delaware", "Dover"},
                {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"},
                {"Georgia", "Atlanta"},
                {"Idaho", "Boise"},
                {"Illinois", "Springfield"}};
        return result;
    }
}
