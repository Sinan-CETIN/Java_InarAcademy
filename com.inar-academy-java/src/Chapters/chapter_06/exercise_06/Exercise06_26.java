package Chapters.chapter_06.exercise_06;

public class Exercise06_26 {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        while (count < 100) {
            if (isPrime(number) && isPalindromic(number)) {
                count++;
                if (count % 10 == 0)
                    System.out.println(number);
                else
                    System.out.print(number + " ");

            }
            number++;
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPalindromic(int n) {
        String s = n + "";
        for (int low = 0, high = s.length() - 1; low < high; low++, high--) {
            if (s.charAt(low) != s.charAt(high))
                return false;
        }
        return true;
    }
}
