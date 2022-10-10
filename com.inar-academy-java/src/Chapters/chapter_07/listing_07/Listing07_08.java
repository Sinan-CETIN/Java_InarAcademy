package Chapters.chapter_07.listing_07;

public class Listing07_08 {
    public static void main(String[] args) {
        double[] list = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        selectionSort(list);
        displayArray(list);
        System.out.println("\n----------------------------------");
        double[] list1 = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSort(list1);
        displayArray(list1);
    }

    public static void displayArray(double[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");

        }
    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
                if (currentMinIndex != i) {
                    double temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }

            }
        }
    }
}
