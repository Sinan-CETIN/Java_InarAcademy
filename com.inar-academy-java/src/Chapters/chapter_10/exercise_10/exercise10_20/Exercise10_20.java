package Chapters.chapter_10.exercise_10.exercise10_20;

import java.math.BigDecimal;

public class Exercise10_20 {
    public static void main(String[] args) {
        displayNumberE();
    }


    public static void displayNumberE() {
        for (int i = 100; i <= 1000; i += 100) {
            BigDecimal sum = new BigDecimal("1");

            for (int j = 1; j <= i; j++) {
                sum = sum.add(new BigDecimal(1 + "").divide(factor(new BigDecimal(j + "")), 25, BigDecimal.ROUND_UP));
            }
            System.out.println(sum);
        }
    }

    public static BigDecimal factor(BigDecimal number) {
        BigDecimal result = BigDecimal.ONE;
        BigDecimal counter = BigDecimal.ONE;


        while (counter.compareTo(number) != 0) {
            result = result.multiply(counter);
            counter.add(BigDecimal.ONE);
        }
        return result;
    }
}
