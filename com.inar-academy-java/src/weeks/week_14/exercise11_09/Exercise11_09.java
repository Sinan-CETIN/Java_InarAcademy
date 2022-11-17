package weeks.week_14.exercise11_09;

import java.util.ArrayList;

public class Exercise11_09 {
    public static void main(String[] args) {
        int[][] array = createArray(4);
        ArrayList<Integer> countNumberOFOneInARow = countRow(array);
        ArrayList<Integer> countNumberOFOneInColumn = countColumn(array);
        displayArray(array);
        System.out.print("The largest row index --> ");
        rowIndex(countNumberOFOneInARow);
        System.out.print("The largest column index --> ");
        maxColumnIndeces(countNumberOFOneInColumn);
    }

    public static int[][] createArray(int numberOfSize) {
        int[][] result = new int[numberOfSize][numberOfSize];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (int) (Math.random() * 2);
            }
        }
        return result;
    }

    public static ArrayList<Integer> countRow(int[][] array) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int count = 0;

            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] == 1) {
                    count++;
                }
            }
            result.add(count);
        }
        return result;
    }

    public static ArrayList<Integer> countColumn(int[][] array) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < array[0].length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j][i] == 1) {
                    count++;
                }
            }
            result.add(count);
        }
        return result;
    }
    public static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rowIndex(ArrayList<Integer> list) {
        int max = java.util.Collections.max(list);
        for (int i = 0; i < list.size(); i++) {
            if(max == list.get(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void maxColumnIndeces(ArrayList<Integer> list) {
        int max = java.util.Collections.max(list);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) == max) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
