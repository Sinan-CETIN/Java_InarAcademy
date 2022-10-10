package Chapters.chapter_06.exercise_06;

public class Exercise06_11 {
    public static void main(String[] args) {
        System.out.printf("%-15s%-10s", "Sales Amount", "Commision");
        System.out.println("\n-----------------------------");
        for (int i = 10000; i <= 100000; i += 5000) {
            System.out.printf("%-15d%7.1f\n", i, computeCommision(i));
        }
    }

    public static double computeCommision(double salesAmount) {
        return 5000 * 0.08 + 5000 * 0.10 + (salesAmount - 10000) * 0.12;
    }
}
