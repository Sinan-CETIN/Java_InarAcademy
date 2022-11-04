package Chapters.chapter_10.exercise_10.exercise10_16;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Exercise10_16 {
    public static void main(String[] args) {
        String s = "1";
        for (int i = 0; i < 49; i++) {
            s += "0";
        }
        System.out.println(s + " | " + s.length());

        displayFirstTenNumberBiggerThan50DecimalDivisibleBoth3And2(s);

    }

    public static void displayFirstTenNumberBiggerThan50DecimalDivisibleBoth3And2(String s) {

        BigInteger number = new BigInteger(s);
        BigInteger divisor2 = new BigInteger("2");
        BigInteger divisor3 = new BigInteger("3");
        BigInteger zero = new BigInteger("0");

        int count = 0;
        while (count < 10) {
            if (number.remainder(divisor2).compareTo(zero) == 0 || number.remainder(divisor3).compareTo(zero) == 0) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }
}
