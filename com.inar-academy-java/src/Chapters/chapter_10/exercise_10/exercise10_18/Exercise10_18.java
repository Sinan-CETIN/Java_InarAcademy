package Chapters.chapter_10.exercise_10.exercise10_18;

import java.math.BigInteger;

public class Exercise10_18 {
    public static void main(String[] args) {
        displayTenPrimeNumberLargerThanLongMaxValue();
    }


    public static boolean isPrime(BigInteger number) {
        BigInteger stop = number.divide(new BigInteger("2")).add(BigInteger.ONE);
        BigInteger divisor = new BigInteger("2");
        BigInteger zero = new BigInteger("0");
        while (divisor.compareTo(stop) != 0) {
            if (number.remainder(divisor).compareTo(zero) == 0) {
                return false;
            }
            divisor = divisor.add(BigInteger.ONE);
        }
        return true;
    }

    public static void displayTenPrimeNumberLargerThanLongMaxValue() {
        BigInteger number = new BigInteger(Long.MAX_VALUE + "");
        number = number.add(BigInteger.ONE);
        int count = 0;

        while (count < 5) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }
}
