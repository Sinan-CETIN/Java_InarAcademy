package Chapters.chapter_11.exercise_11.exercise11_16;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        ArrayList<Integer> list = new ArrayList<>();
        int result = -1;
        do {
            System.out.println("What is " + number1 + " - " + number2 + " ? ");
            result = input.nextInt();
            if (result != (number1 - number2)) {
                if (!list.contains(result)) {
                    System.out.println("Wrong answer. Try again. What is " + number1 + " - " + number2 + " ? ");
                    list.add(result);
                } else {
                    System.out.println("You already entered " + result);
                }
            }
        } while (result != (number1 - number2));
        System.out.println("You got it!");
    }
}
