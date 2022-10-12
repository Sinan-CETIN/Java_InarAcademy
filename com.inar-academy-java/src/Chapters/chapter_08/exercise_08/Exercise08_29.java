package Chapters.chapter_08.exercise_08;

import java.util.Scanner;

public class Exercise08_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix1 row and column --> ");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] matrix1 = createMatrix(row, column);

        System.out.print("Enter matrix2 row and column --> ");
        row = input.nextInt();
        column = input.nextInt();
        double[][] matrix2 = createMatrix(row, column);

        display(matrix1);
        System.out.println("-------------");
        display(matrix2);

        if (equals(matrix1, matrix2)) {
            System.out.println("matrix 1 and matrix2 are identical");
        } else {
            System.out.println("matrix 1 and matrix2 are not identical");
        }
        display(matrix1);
        display(matrix2);
    }

    public static double[][] createMatrix(int row, int column) {
        Scanner input = new Scanner(System.in);
        double[][] result = new double[row][column];
        System.out.println("Enter values -->");
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = input.nextInt();
            }
        }
        return result;
    }

    public static void display(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean equals(double[][] matrix1, double[][] matrix2) {
        sort(matrix1);
        sort(matrix2);
        boolean result = isIdentical(matrix1, matrix2);
        return result;
    }

    public static boolean isIdentical(double[][] matrix1, double[][] matrix2) {
        // checking whether matrix 1 and matrix 2 has same number of row
        if(matrix1.length != matrix2.length) {
            return false;
        }

        for (int i = 0; i < matrix1.length; i++) {
            // checking whether matrix 1 and matrix 2 has same number of column
            if(matrix1[i].length != matrix2[i].length) {
                return false;
            }
            // checking matrix 1 and matrix 2 has same values
            for (int j = 0; j < matrix1[i].length; j++) {
                if(matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }

        }
        return true;
    }

    public static void sort(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                for (int k = i; k < matrix.length; k++) {
                    for (int l = j + 1; l < matrix[k].length; l++) {
                        if(matrix[i][j] > matrix[k][l]) {
                            double temp = matrix[i][j];
                            matrix[i][j]= matrix[k][l];
                            matrix[k][l] = temp;
                        }

                    }

                }
            }
        }
    }
}
