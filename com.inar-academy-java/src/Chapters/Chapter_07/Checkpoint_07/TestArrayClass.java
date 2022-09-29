package Chapters.Chapter_07.Checkpoint_07;

import java.util.Arrays;

public class TestArrayClass {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println("1. Index is " +
                java.util.Arrays.binarySearch(list, 11));
        System.out.println("2. Index is " +
                java.util.Arrays.binarySearch(list, 12));
        char[] chars = {'a', 'c', 'g', 'x', 'y', 'z'};
        System.out.println("3. Index is " +
                java.util.Arrays.binarySearch(chars, 'a'));
        System.out.println("4. Index is " +
                java.util.Arrays.binarySearch(chars, 't'));

        int[] list1 = {2, 4, 7, 10};
        int[] list2 = {2, 4, 7, 10};
        int[] list3 = {4, 2, 7, 10};
        System.out.println(java.util.Arrays.equals(list1, list2)); // true
        System.out.println(java.util.Arrays.equals(list2, list3) +"\n\n"); // false

        int[] list4 = {2, 4, 7, 10};
        int[] list5 = {2, 4, 7, 7, 7, 10};
        java.util.Arrays.fill(list4, 5); // Fill 5 to the whole array
        java.util.Arrays.fill(list5, 1, 5, 8); // Fill 8 to a partial array
        System.out.println(Arrays.toString(list4));
        System.out.println(Arrays.toString(list5));

    }
}
