package Chapters.chapter_06.Exercise_06;

public class Exercise06_29 {
    public static void main(String[] args) {
        //print header
        int number = 2;
        while (number < 1000) {
            if (twinPrime(number)) {
                System.out.println("(" + number + ", " + (number + 2) + ")");
            }
            number++;
        }
    }

    public static boolean twinPrime(int number) {
        if (Exercise06_27.isPrime(number) && Exercise06_27.isPrime(number + 2))
            return true;
        return false;
    }
}
