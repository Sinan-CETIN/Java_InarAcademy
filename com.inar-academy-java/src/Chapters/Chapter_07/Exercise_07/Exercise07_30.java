package Chapters.Chapter_07.Exercise_07;

import java.util.Scanner;

import static Chapters.Chapter_07.Exercise_07.Exercise07_26.*;

public class Exercise07_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values : ");
        int[] list = createList(input.nextInt(), input);

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
}
