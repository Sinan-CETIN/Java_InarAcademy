package Chapters.Chapter_07.Exercise_07;

import java.util.Scanner;

import static Chapters.Chapter_07.Exercise_07.Exercise07_26.*;

public class Exercise07_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list 1 length then the elements : ");
        int[] list1 = createList(input.nextInt(), input);

        System.out.print("Enter list 2 length then the elements : ");
        int[] list2 = createList(input.nextInt(), input);

        sort(list1);
        sort(list2);
        System.out.println("Two list are " + (Exercise07_26.equals(list1, list2) ? "" : "not ") + "identical");
    }

    public static void sort(int[] list) {

        for (int i = 0; i < list.length - 1; i++) {
            int min = list[i];
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (min > list[j]) {
                    min = list[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
        }
    }
}
