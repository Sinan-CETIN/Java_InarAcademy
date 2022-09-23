package Chapters.chapter_06.Exercise_06;

import java.util.Scanner;

public class Exercise06_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = input.nextLine();
        System.out.print("Enter the char you want to count : ");
        String ch = input.next();
        System.out.println(count(s, ch.charAt(0)) + " '" + ch.charAt(0) + "' in the string " + s);
    }

    public static int count(String s, char ch) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch)
                count++;
        }
        return count;
    }
}
