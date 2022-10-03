package Chapters.Chapter_07.Exercise_07;

import java.util.Scanner;

import static Chapters.Chapter_07.Exercise_07.Exercise07_26.createList;

public class Exercise07_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers : ");
        int[] list = createList(10, input);

        displayListAll2Combination(list);
    }

    public static void displayListAll2Combination(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                System.out.print("(" + list[i] + ", " + list[j] +")"+ " ");
            }
            System.out.println();
        }
    }
}
