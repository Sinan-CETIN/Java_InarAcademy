package Chapters.Chapter_07.Exercise_07;

public class Exercise07_08 {
    public static void main(String[] args) {
        double[] list1 = {1.5, 2.7, 2.8, 10.85 , 45.6};
        System.out.println("Average of double list is :" + average(list1));


        int[] list2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Average of int list is :" + average(list2));
    }

    public static int average(int[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum / list.length;
    }


    public static double average(double[] list) {
        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum / list.length;
    }
}
