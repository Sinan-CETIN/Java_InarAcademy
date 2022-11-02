package Chapters.chapter_10.exercise_10.exercise10_06;

import Chapters.chapter_10.listing_10.StackOfInteger;

public class Exercise10_06 {
    public static void main(String[] args) {
        int number = 2;
        StackOfInteger stack = new StackOfInteger();

        while (number < 120) {
            if (isPrime(number)) {
              stack.push(number);
            }
            number++;
        }

        display(stack);
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void display(StackOfInteger stack) {
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
