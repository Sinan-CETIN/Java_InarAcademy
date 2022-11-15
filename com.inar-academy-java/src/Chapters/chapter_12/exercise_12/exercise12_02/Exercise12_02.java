package Chapters.chapter_12.exercise_12.exercise12_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise12_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers --> ");
        try {
            int number1 = input.nextInt();
            int number2 = input.nextInt();
            System.out.println("sum = " + (number1 + number2));
        } catch (InputMismatchException ex) {
            System.out.println("Input type is wrong.");
        }
        System.out.println("It goes as it should be.");
    }
}
