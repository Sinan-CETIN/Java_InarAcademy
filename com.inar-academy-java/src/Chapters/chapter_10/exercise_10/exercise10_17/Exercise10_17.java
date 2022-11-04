package Chapters.chapter_10.exercise_10.exercise10_17;

import java.math.BigInteger;

public class Exercise10_17 {
    public static void main(String[] args) {
        long number = findMaxSquareNumber();

        for (int i = 0; i < 10; i++) {
            BigInteger squareNumber = new BigInteger(++number + "");
            System.out.print(squareNumber + " --> ");
            squareNumber = squareNumber.multiply(squareNumber);
            System.out.println(squareNumber);
        }
    }

    public static long findMaxSquareNumber() {
        long number = Long.MAX_VALUE;
        long result = 2;

        while ((long)Math.pow(result, 2) < number){
            result++;
        }

        return --result;
    }
}
