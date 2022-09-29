package Chapters.Chapter_07.Exercise_07;

public class Exercise07_07 {
    public static void main(String[] args) {
        final int LENGTH = 100;
        int[] array = createRandomArray(LENGTH);
        int[] count = count(array);
        display(count);
    }

    public static int[] createRandomArray(int length) {
        int[] list = new int[length];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int)(Math.random() * 10);
        }
        return list;
    }

    public static int[] count(int[] list) {
        int[] count = new int[10];
        for (int i = 0; i < list.length; i++) {
            count[list[i]]++;
        }
        return count;
    }

    public static void display(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(i + " occurs " + list[i] + " times");

        }
    }
}
