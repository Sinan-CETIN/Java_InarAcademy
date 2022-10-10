package Chapters.chapter_08.exercise_08;


public class Exercise08_10 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        fillMatrix(matrix);

        int indexOfRow = getIndexOfLargestRow(matrix);
        int indexOfColumn = getIndexOfLargestColumn(matrix);

        display(matrix);
        System.out.println("The largest row index --> " + indexOfRow);
        System.out.println("The largest column index --> " + indexOfColumn);
    }

    private static void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }
    }

    public static int getIndexOfLargestRow(int[][] matrix) {
        int countMax = 0;
        int index = -1;
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length ; j++) {
                if(matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > countMax) {
                countMax = count;
                index = i;
            }
        }
        return index;
    }

    public static int getIndexOfLargestColumn(int[][] matrix) {
        int countMax = 0;
        int index = -1;
        for (int i = 0; i < matrix[0].length; i++) {
            int count = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    count++;
                }
            }
            if(count > countMax) {
                countMax = count;
                index = i;
            }
        }
        return index;
    }
}
