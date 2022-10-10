package Chapters.chapter_06.exercise_06;

public class Exercise06_13 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-7s\n--------------------\n", "i", "m(i)");

        for (int i = 1; i < 21; i++) {
            System.out.printf("%-10d%-7.4f\n", i, m(i));
        }
    }

    public static double m(double num) {
        double sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += (i * 1.0 / (i + 1));
        }
        return sum;
    }
}
