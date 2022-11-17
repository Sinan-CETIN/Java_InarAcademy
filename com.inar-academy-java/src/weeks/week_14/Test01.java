package weeks.week_14;

import java.math.BigInteger;

public class Test01 {
    public static void main(String[] args) {
        fivePrimesBiggerLongMaxvalue();
    }
    public static void fivePrimesBiggerLongMaxvalue() {
        BigInteger number = new BigInteger(String.valueOf(Long.MAX_VALUE));
        int count = 0;
        while (count < 5) {

            System.out.println(number.nextProbablePrime());
            number = number.nextProbablePrime();
            count++;
        }
    }
}