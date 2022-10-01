package Chapters.Chapter_07.Exercise_07;

public class Exercise07_18 {
    public static void main(String[] args) {
        int[] array = creteRandomArray(100);
        bubbleSort(array);
        Exercise07_12.disPlayArray(array);
    }

    public static int[] creteRandomArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    public static void bubbleSort(int[] array) {
        boolean needNext = true;
        for (int i = 0; i < array.length && needNext; i++) {
            needNext = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    needNext =true;
                }
            }
        }
    }
}