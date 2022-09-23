package Chapters.chapter_06.Exercise_06;

public class Exercise06_27 {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        while (count < 100) {
            if (isEmirp(number)) {
                count++;
                if (count % 10 == 0)
                    System.out.println(number);
                else
                    System.out.print(number + " ");
            }
            number++;
        }
        System.out.println("\n" + getReverse(2));
    }

    public static boolean isEmirp(int number) {
        int reverse = getReverse(number);
        if (isPrime(number) && isPrime(reverse) && !Exercise06_26.isPalindromic(number)) {
            return true;
        }
        return false;
    }

    public static int getReverse(int number) {
        int n = 0;

        while (number > 0) {
            n = (n * 10) + (number % 10);
            number /= 10;
        }

        return n;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
