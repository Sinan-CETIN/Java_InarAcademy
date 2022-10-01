package Chapters.Chapter_07.Exercise_07;

public class Exercise07_19 {
    public static void main(String[] args) {
        int[] array = Exercise07_18.creteRandomArray(10);
        boolean sorted = isSorted(array);
        Exercise07_12.disPlayArray(array);
        System.out.println("Array is" + (sorted ? "" : " not") + " a sorted array\n");

        System.out.println("After sorting array:\n");
        Exercise07_18.bubbleSort(array);
        Exercise07_12.disPlayArray(array);
        sorted = isSorted(array);
        System.out.println("Array is" + (sorted ? "" : "not") + " a sorted array");
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]){
                return false;
            }
        }
        return true;
    }
}
