package Chapters.chapter_08.checkpoint_08;

public class Checkpoint08_01 {
    public static void main(String[] args) {
        System.out.println("8.1 ---->");
        int[][] matrix = new int[4][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }

        displayTwoDimensionalArray(matrix);
        System.out.println("\n8.2 ---->");
        System.out.println("8.2 Can the rows in a two-dimensional array have different lengths?" +
                "Yes");

        System.out.println("\n8.3 ---->");
        int[][] array = new int[5][6];
        int[] x = {1, 2};
        array[0] = x;
        System.out.println("array[0][1] is " + array[0][1]);

        System.out.println("\n8.4 ----->");
        System.out.println("int[][] r = new int[2]; Invalid\n" +
                "int[] x = new int[]; Invalid\n" +
                "int[][] y = new int[3][]; Valid\n" +
                "int[][] z = {{1, 2}}; Valid\n" +
                "int[][] m = {{1, 2}, {2, 3}}; Valid\n" +
                "int[][] n = {{1, 2}, {2, 3}, }; Invalid");

        System.out.println("\n8.5 ---->");
        int[][] array1 = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = array1.length - 1; i >= 0; i--) {
            for (int j = array1[i].length - 1; j >= 0; j--)
                System.out.print(array1[i][j] + " ");
            System.out.println();
        }

        System.out.println("\n8.6 ---->");
        int[][] array2 = {{1, 2}, {3, 4}, {5, 6}};
        int sum = 0;
        for (int i = 0; i < array2.length; i++)
            sum += array2[i][0];
        System.out.println(sum);

    }


    public static void displayTwoDimensionalArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
