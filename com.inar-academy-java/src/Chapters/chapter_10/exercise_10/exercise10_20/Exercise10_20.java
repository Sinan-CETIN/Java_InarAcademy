package Chapters.chapter_10.exercise_10.exercise10_20;

import java.math.BigDecimal;

public class Exercise10_20 {
    public static void main(String[] args) {
        System.out.println(factor(5));
        displayNumberE();
    }


    public static void displayNumberE() {
        for (int i = 100; i <= 1000; i += 100) {
            BigDecimal sum = BigDecimal.ONE;
            for (int j = 1; j < i; j++) {
                BigDecimal increase = BigDecimal.ONE.divide(factor(i), 25, BigDecimal.ROUND_UP);
                sum = sum.add(increase);
            }
            System.out.println(i + " --> " + sum);
        }
    }

    public static BigDecimal factor(long number) {
        BigDecimal result = BigDecimal.ONE;
        for (int i = 1; i <= number; i++) {
            result = result.multiply(new BigDecimal(i + ""));
        }
        return result;
    }
}
