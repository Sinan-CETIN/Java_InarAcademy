package Chapters.chapter_12.exercise_12.exercise12_15;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12_15 {
    public static void main(String[] args) throws IOException {
        System.out.print("Write a path of a file in which you write integers randomly --> ");
        String path = new Scanner(System.in).nextLine();
        File file = new File(path);

        if (file.exists()) {
            System.out.println("The file you choose is already exist!");
            System.exit(1);
        }

        try (PrintWriter output = new PrintWriter(file);) {
            for (int i = 0; i < 100; i++) {
                output.print((int) (Math.random() * 100) + " ");
            }
        }

        int[] array = getArrayFromFile(file);
        sort(array);
        display(array);
    }

    public static int[] getArrayFromFile(File file) throws IOException {
        int[] result = new int[100];
        Scanner input = new Scanner(file);
        int index = 0;
        while (input.hasNext()) {
            result[index++] = input.nextInt();
            System.out.println(result[index - 1]);
        }
        return result;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.println(arr[i]);
            } else {
                System.out.printf("%-3d", arr[i]);
            }
        }
    }
}
