package Chapters.Chapter_07.Exercise_07;

import javafx.scene.effect.Light;

import java.util.*;

public class Exercise07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten integers : ");
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        System.out.print("First list  is : ");
        printArray(list);
        System.out.println();

        int[] distinctList = createDistinctList(list);

        System.out.println("Number of distincts : " + distinctList.length);
        System.out.print("The distinct numbers are : ");
        printArray(distinctList);
    }

    public static void printArray(int[] distinctList) {
        for (int i = 0; i < distinctList.length; i++) {
            System.out.print(distinctList[i] + " ");
        }
    }

    public static int[] createDistinctList(int[] list) {
        int[] distinctList = new int[list.length];
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            if(!contains(distinctList,list[i])){
                distinctList[count++] = list[i];
            }
        }
        int[] temp = new int[count];
        System.arraycopy(distinctList,0, temp, 0, count);
        distinctList = temp;
        return distinctList;
    }

    public static boolean contains(int[] list, int number) {
        for(int i = 0; i < list.length; i++) {
            if (list[i] == number) {
                return true;
            }
        }
        return false;
    }
}


