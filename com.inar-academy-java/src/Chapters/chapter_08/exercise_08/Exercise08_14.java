package Chapters.chapter_08.exercise_08;

import java.util.Scanner;

public class Exercise08_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size for the matrix : ");
        int size = input.nextInt();

        int[][] randomMatrix = createRandomMatrix(size, size);
        display(randomMatrix);

        System.out.println();
        printSameRow(randomMatrix);
        printSameColumn(randomMatrix);
        printSameMajorDiagonal(randomMatrix);
        printSameSubDiagonal(randomMatrix);

    }



    public static int[][] createRandomMatrix(int row, int column) {
        int[][] result = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = (int) (Math.random() * 2);
            }
        }
        return result;
    }

    public static void display(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%-2d", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void printSameRow(int[][] matrix) {
        int count = 0; // count how many row has same numbers
        for (int i = 0 ; i < matrix.length; i++) {
            int number = matrix[i][0];
            boolean allSameInRow = true;
            for (int j = 1; j < matrix[i].length; j++) {
                if(number != matrix[i][j]) {
                    allSameInRow = false;
                    break;
                }
            }
            if(allSameInRow) {
                count++;
                System.out.println("All "+ number + "s on row " + i);
            }
        }
        if (count == 0) {
            System.out.println("No same number in a row.");
        }

    }

    public static void printSameColumn(int[][] matrix) {
        int count = 0; //count how many column has same numbers
        for (int i = 0; i < matrix[0].length; i++) {
            int number = matrix[0][i];
            boolean allSameInColumn = true;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] != number) {
                    allSameInColumn = false;
                    break;
                }
            }
            if(allSameInColumn) {
                count++;
                System.out.println("All " + number + "s on column " + i);
            }
        }

        if (count == 0) {
            System.out.println("No same number in a column.");
        }
    }
    
    public static void printSameMajorDiagonal(int[][] matrix) {
        int number = matrix[0][0];
        boolean allSameOnMajorDiagonal = true;
        for (int i = 1; i < matrix.length; i++) {
            if (number != matrix[i][i]) {
                allSameOnMajorDiagonal =false;
                break;
            }
        }
        if (allSameOnMajorDiagonal) {
            System.out.println("Major diagonal has same number --> " + number);
        } else {
            System.out.println("No same number on major diagonal");
        }
    }
    public static void printSameSubDiagonal(int[][] matrix) {
        int number = matrix[0][matrix.length - 1];
        boolean allSameOnSubDiagonal = true;
        for (int i = 1, j = matrix.length - 2 ;i < matrix.length && j >= 0; i++, j--) {
            if (number != matrix[i][i]) {
                allSameOnSubDiagonal =false;
                break;
            }
        }
        if (allSameOnSubDiagonal) {
            System.out.println("Major diagonal has same number --> " + number);
        } else {
            System.out.println("No same number on major diagonal");
        }
    }

}
