package Chapters.chapter_08.exercise_08;

import java.util.Scanner;

public class Exercise08_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix --> ");
        int size = input.nextInt();
        int[][] matrix = createRandomMatrix(size);
        display(matrix);

        //index 0 = x coordinates index 1 = y coordinates and index 2 = size
        int[] maximumSquareMatrixStartIndex = findMaximumSquareMatrix(matrix);

        if (maximumSquareMatrixStartIndex[2] > 1) {
            System.out.println("The maximum square submatrix is at (" + maximumSquareMatrixStartIndex[0] +
                    ", " + maximumSquareMatrixStartIndex[1] + ") with size " + maximumSquareMatrixStartIndex[2]);
        } else {
            System.out.println("There is no square matrix.");
        }
    }

    public static int[][] createRandomMatrix(int size) {
        int[][] result = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = (int) (Math.random() * 2);
            }
        }
        return result;
    }

    public static int[] findMaximumSquareMatrix(int[][] matrix) {
        int[] result = new int[3];
        int size = 2;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                while(isSquareMatrix(matrix, i, j, size)) {
                    result[0] = i;
                    result[1] = j;
                    result[2] = size;
                    size++;
                }
            }
        }
        return result;
    }

    public static boolean isSquareMatrix(int[][] matrix, int row, int column, int count) {
        if(column + count > matrix[0].length) {
            return false;
        }

        if(row + count > matrix.length) {
            return false;
        }

        for (int i = row; i < row + count; i++) {
            for (int j = column; j < column + count; j++) {
                if(matrix[i][j] != 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
