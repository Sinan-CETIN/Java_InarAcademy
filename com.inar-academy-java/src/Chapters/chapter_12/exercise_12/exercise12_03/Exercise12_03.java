package Chapters.chapter_12.exercise_12.exercise12_03;

import java.util.Scanner;

public class Exercise12_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of int array : ");
        int numberOfSize = input.nextInt();
        int[] array = createRandomIntegerArray(numberOfSize);

        try {
            System.out.print("Enter the index of element you want to see: ");
            int index = input.nextInt();
            System.out.println("Elemennt[" + index + "] is "  + array[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("The index you enter is Out of bounds!!");
        }
    }

    public static int[] createRandomIntegerArray(int size) {
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int)(Math.random() * 100);
        }
        return result;
    }
}
