package weeks.week_10;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number of row and column --> ");
        int row = input.nextInt();
        int column = input.nextInt();
        int[][] array = new int[row][column];

        fill2DArrWithRandomValues(array, 1, 5);
        displayArray(array);

        int index = indexOfMaxRow(array);
        System.out.println("Max row --> " + index);

        index =  indexOfMaxColumn(array);
        System.out.println("Max column --> " + index);

    }

    public static void fill2DArrWithRandomValues(int[][] arr, int start, int limit) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(start + Math.random() * (limit - start));
            }
        }
    }

    public static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("[" + array[i][j] + "]");
            }
            System.out.println();
        }
    }

    public static int indexOfMaxRow(int[][] array) {
        int index = -1;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum > max) {
                max = sum;
                index = i;
            }
        }
        return index + 1;
    }

    public static int indexOfMaxColumn(int[][] array) {
        int index = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j][i];
            }
            if (sum > max) {
                max = sum;
                index = i;
            }
        }
        return index + 1;
    }
}
