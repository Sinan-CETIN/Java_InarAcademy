package Chapters.chapter_07.exercise_07;

import java.util.Scanner;

public class Exercise07_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int length = input.nextInt();

        System.out.println("Array filled random numbers between 0 and 99");
        int[] list = fillArray(length);
        System.out.println("Array before reverse method:");
        disPlayArray(list);
        System.out.println("Array after reverse method:");
        reverseArray(list);
        disPlayArray(list);
    }

    public static int[] fillArray(int lenght) {
        int[] list = new int[lenght];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int)(Math.random() * 100);
        }
        return list;
    }

    public static void disPlayArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
            if((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void reverseArray(int[] list) {
        for (int i = 0, j = list.length -1; i < j; i++, j--) {
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }
}
