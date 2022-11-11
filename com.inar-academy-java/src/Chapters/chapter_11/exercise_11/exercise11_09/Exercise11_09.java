package Chapters.chapter_11.exercise_11.exercise11_09;

import java.util.ArrayList;


public class Exercise11_09 {
    public static void main(String[] args) {
        int[][] matrix = createRandomMatrix();
        ArrayList<Integer> numberOfOneInTheRows = new ArrayList<>();
        ArrayList<Integer> numberOfOneInTheColumns = new ArrayList<>();

        fillNumberOfOneInTheRows(numberOfOneInTheRows, matrix);
        fillNumberOfOneInTheColumns(numberOfOneInTheColumns, matrix);

        display(matrix);

        displayAllMaxIndexInRows(numberOfOneInTheRows);
        displayAllMaxIndexInColumns(numberOfOneInTheColumns);

        /*
        System.out.println("The largest row index:" + numberOfOneInTheRows.indexOf(java.util.Collections.max(numberOfOneInTheRows)));
        System.out.println("The largest column index:" + numberOfOneInTheColumns.indexOf(java.util.Collections.max(numberOfOneInTheColumns)));
        */

    }

    private static void displayAllMaxIndexInRows(ArrayList<Integer> list) {
        System.out.print("The largest row index:");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(java.util.Collections.max(list))) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static void displayAllMaxIndexInColumns(ArrayList<Integer> list) {
        System.out.print("The largest column index:");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(java.util.Collections.max(list))) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static int[][] createRandomMatrix() {
        int[][] result = new int[4][4];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (int) (Math.random() * 2);
            }
        }
        return result;
    }

    public static void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillNumberOfOneInTheRows(ArrayList<Integer> list, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            list.add(count);
        }
    }

    public static void fillNumberOfOneInTheColumns(ArrayList<Integer> list, int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            int count = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    count++;
                }
            }
            list.add(count);
        }
    }
}
