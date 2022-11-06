package Chapters.chapter_10.exercise_10.exercise10_21;

import java.math.BigInteger;

public class Exercise10_21 {
    public static void main(String[] args) {
        displayFirstTenNumberBiggerThan50DecimalDivisible5Or6(Long.MAX_VALUE + "");

    }

    public static void displayFirstTenNumberBiggerThan50DecimalDivisible5Or6(String s) {

        BigInteger number = new BigInteger(s);
        BigInteger divisor2 = new BigInteger("5");
        BigInteger divisor3 = new BigInteger("6");
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
