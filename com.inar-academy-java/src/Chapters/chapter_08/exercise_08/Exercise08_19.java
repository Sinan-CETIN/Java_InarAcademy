package Chapters.chapter_08.exercise_08;


import java.util.Scanner;

public class Exercise08_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of row --> ");
        int row = input.nextInt();
        ;
        System.out.print("Enter the number of column --> ");
        int column = input.nextInt();

        int[][] matrix = createRandomMatrix(row, column);

        displayArray(matrix);
        System.out.println(hasConsecutiveFour(matrix));
    }

    public static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] createRandomMatrix(int row, int column) {
        int[][] result = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = (int) (Math.random() * 3);
            }
        }
        return result;
    }

    public static String hasConsecutiveFour(int[][] matrix) {
        String result = "";
        boolean hasConsecutiveFour = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (hasConsecutiveFourInRow(matrix, i, j)) {
                    result = "Matrix has consecutive four in a row. Start on row --> " + i + " and column --> " + j;
                    hasConsecutiveFour = true;
                    break;

                }
                if (hasConsecutiveFourInColumn(matrix, i, j)) {
                    result = "Matrix has consecutive four in a column. Start on row --> " + i + " and column --> " + j;
                    hasConsecutiveFour = true;
                    break;
                }
                if (hasConsecutiveFourInDiagonal(matrix, i, j)) {
                    result = "Matrix has consecutive four in a diagonal. Start on row --> " + i + " and column --> " + j;
                    hasConsecutiveFour = true;
                    break;
                }
                if (!hasConsecutiveFour)
                    result = "Matrix has not consecutive four";

            }
            if (hasConsecutiveFour) {
                break;
            }
        }
        return result;
    }

    public static boolean hasConsecutiveFourInRow(int[][] matrix, int row, int column) {
        if (column >= matrix[row].length - 3) {
            return false;
        }

        for (int i = column; i < column + 4; i++) {
            if (matrix[row][column] != matrix[row][i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasConsecutiveFourInColumn(int[][] matrix, int row, int column) {
        if (row >= matrix.length - 3) {
            return false;
        }

        for (int i = row; i < row + 4; i++) {
            if (matrix[row][column] != matrix[i][column]) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasConsecutiveFourInDiagonal(int[][] matrix, int row, int column) {
        // check right diagonal
        if (hasRightDiagonal(matrix, row, column)) {
            return true;
        }
        if (hasLeftDiagonal(matrix, row, column)) {
            return true;
        }
        return false;
    }

    private static boolean hasRightDiagonal(int[][] matrix, int row, int column) {
        if (row >= matrix.length - 3) {
            return false;
        }
        if (column >= matrix[row].length - 3) {
            return false;
        }

        for (int i = row, j = column; i < row + 4; i++, j++) {
            if (matrix[row][column] != matrix[i][j]) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasLeftDiagonal(int[][] matrix, int row, int column) {
        if (row >= matrix.length - 3) {
            return false;
        }
        if (column < 3) {
            return false;
        }


        for (int i = row, j = column; i < row + 4; i++, j--) {
            if (matrix[row][column] != matrix[i][j]) {
                return false;
            }
        }
        return true;
    }
}




