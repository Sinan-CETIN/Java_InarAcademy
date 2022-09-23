package Chapters.chapter_06.Exercise_06;

public class Exercise06_14 {
    public static void main(String[] args) {
        System.out.printf("%-15s%-8s\n", "i", "m(i)");
        System.out.println("---------------------------");
        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-15d%-8.4f\n", i, m(i));
        }
    }

    public static double m(int num) {
        double sum = 0;
        double n1 = num;
        for (int i = 1; i <= num; i++) {
            sum += (Math.pow(-1, i + 1) / (2 * i - 1));
        }
        return 4 * sum;
    }
}
