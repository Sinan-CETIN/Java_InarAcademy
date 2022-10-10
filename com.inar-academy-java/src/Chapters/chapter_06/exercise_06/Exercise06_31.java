package Chapters.chapter_06.exercise_06;

import java.util.Scanner;

public class Exercise06_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number : ");
        long card = input.nextLong();
        System.out.println(card + " is " + (isValid(card) ? "" : "in") + "valid");
    }

    public static boolean isValid(long card) {
        if (getSize(card) > 16 && getSize(card) < 13) {
            return false;
        }

        int prefix = getPrefix(card);
        if (!validPrefix(prefix))
            return false;


        int sumOfDoubleEvenPlace = sumOfEvenDoublePlace(card);

        int sumOfDigitRightToLeft = sumOfDigitRightToLeft(card);
        int sum = sumOfDoubleEvenPlace + sumOfDigitRightToLeft;

        if (sum % 10 == 0) {
            return true;
        }
        return false;


    }

    public static int getSize(long number) {
        String n = number + "";
        return n.length();
    }

    public static int sumOfEvenDoublePlace(long number) {
        String s = number + "";
        int sum = 0;
        int n;
        for (int i = 0; i < s.length(); i += 2) {
            n = (s.charAt(i) - '0') * 2;
            if (n >= 10) {
                n = (n % 10) + (n / 10);
            }
            sum += n;
        }
        return sum;
    }

    public static int sumOfDigitRightToLeft(long card) {
        String s = card + "";
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i -= 2) {
            sum += s.charAt(i) - '0';
        }
        return sum;
    }

    public static int getPrefix(long card) {
        int size = getSize(card);
        int prefix = (int) (card / (Math.pow(10, size - 1)));
        if (prefix == 3) {
            prefix *= 10;
            int prefix2 = (int) (card / Math.pow(10, size - 2) % 10);
            prefix += prefix2;
        }
        return prefix;
    }

    public static boolean validPrefix(int prefix) {
        if (prefix == 37 || prefix == 4 || prefix == 5 || prefix == 6) {
            return true;
        }
        return false;
    }
}
