package Chapters.chapter_07.exercise_07;

import java.util.Scanner;

public class Exercise07_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values : ");
        int numberOfValues = input.nextInt();
        int[] list = createList(numberOfValues, input);

        System.out.println("The list has " + (isConsecutiveFour(list) ? "" : "no ") + "consecutive fours");
    }

    public static boolean isConsecutiveFour(int[] list) {
        int count = 1;
        for(int i = 0; i < list.length - 1; i++) {
            if (list[i] == list[i + 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count == 4) {
                return true;
            }
        }
        return false;
    }

    public static int[] createList(int length, Scanner input) {
        System.out.println("Enter numbers --> ");
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = input.nextInt();
        }
        return result;
    }
}
