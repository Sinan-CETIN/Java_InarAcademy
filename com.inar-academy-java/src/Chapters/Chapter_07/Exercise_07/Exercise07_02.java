package Chapters.Chapter_07.Exercise_07;

import java.util.Scanner;

public class Exercise07_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Read ten integers
        System.out.print("Enter ten integers : ");
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        displayReverseOrder(list);
    }

    public static void displayReverseOrder(int[] list) {
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.print(list[i] + " ");
        }
    }
}
