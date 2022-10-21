package Chapters.chapter_09.exercise_09;

public class Exercise09_13 {
    public static void main(String[] args) {
        double[][] arr = createArray(10, 10);
        Location location = locateLargest(arr);
        display(arr);
        System.out.println("--------------------------------");
        System.out.println(location.toString());
    }

    public static double[][] createArray(int row, int column) {
        double[][] result = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j] = (int) ((10 + (Math.random() * 90)) * 100) / 100.0;
            }
        }
        return result;
    }

    public static Location locateLargest(double[][] a) {
        double max = Double.MIN_VALUE;
        int row = -1;
        int col = -1;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new Location(row, col, max);
    }

    public static void display(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
