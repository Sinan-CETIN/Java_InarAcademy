package Chapters.chapter_07.exercise_07;

import java.util.Scanner;

import static Chapters.chapter_07.exercise_07.Exercise07_26.createList;

public class Exercise07_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list 1 length then the elements : ");
        int[] list1 = createList(input.nextInt(), input);

        System.out.print("Enter list 2 length then the elements : ");
        int[] list2 = createList(input.nextInt(), input);

        int[] mergedList = merge(list1, list2);
        displayMergedList(mergedList);
    }

    public static int[] merge(int[] list1, int[] list2) {
        bubbleSort(list1);
        bubbleSort(list2);
displayMergedList(list1);
displayMergedList(list2);
        int[] result = new int[list1.length + list2.length];

        int indexOfList1 = 0;
        int indexOfList2 = 0;

        for (int i = 0; i < result.length; i++) {
            if (indexOfList1 >= list1.length) {
                result[i] = list2[indexOfList2++];
                continue;

            }
            if (indexOfList2 >= list2.length) {
                result[i] = list1[indexOfList1++];
                continue;
            }

            if (list1[indexOfList1] < list2[indexOfList2])
                result[i] = list1[indexOfList1++];
            else
                result[i] = list2[indexOfList2++];
        }
        return result;
    }

    public static void bubbleSort(int[] list) {
        for (int i = list.length - 1; i > 0; i--) {
            boolean needNext = false;
            for (int j = i - 1; j >= 0; j--) {
                if (list[i] < list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                    needNext = true;
                }
            }
            if (!needNext)
                break;
        }
    }

    public static void displayMergedList(int[] list) {
        System.out.print("The merged list is ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
