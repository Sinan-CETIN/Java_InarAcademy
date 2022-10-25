package Chapters.chapter_10.listing_10;
import java.math.*;
public class Listing10_09 {
    public static void main(String[] args) {
        System.out.println("50! is \n" + factorial(50));

    }

    public static BigInteger factorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
     return result;
    }
}
