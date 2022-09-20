import java.util.Scanner;

public class Exercise05_02 {
    public static void main(String[] args) {
        final int NUMBER_OF_QESTIONS = 10; // number of questions in quiz
        int correctCount = 0; // Count the number of correct answers
        int count = 0; // Count the number of questions
        long startTime = System.currentTimeMillis();
        String output = " "; // output string is initially empty
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QESTIONS) {
            // 1. Generate two random single-digit integers
            int number1 = (int) (Math.random() * 15);
            int number2 = (int) (Math.random() * 15);

            // 2. If number1 < number2, swap number1 with number2
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            // 3. Prompt the student to answer "What is number1 – number2?"
            System.out.print("What is " + number1 + " - " + number2 + "?");
            int answer = input.nextInt();

            if (number1 - number2 == answer) {
                System.out.println("You are correct");
                correctCount++; // Increase the correct answer count
            } else
                System.out.println("Your answer is wrong.\n" + number1
                        + " - " + number2 + " should be " + (number1 - number2));

            //Increase the question count
            count++;

            output += "\n" + number1 + "-" + number2 + "=" + answer +
                    ((number1 - number2 == answer) ? " correct" : " wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctCount +
                "\nTest time is " + testTime / 1000 + " seconds\n" + output);

    }
}
