package Chapters.chapter_12.exercise_12.exercise12_08;

import java.util.Scanner;

public class TestHexFormatException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter an hex value -> ");
            String hexString = input.nextLine();
            check(hexString);
            System.out.println("Hex value is -> " + hexString);
        } catch (HexFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void check(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!isLegalHexValue(s.charAt(i))) {
                throw new HexFormatException(s);
            }
        }
    }

    public static boolean isLegalHexValue(char ch) {
        return ('A' <= ch && ch <= 'F') || ('0' <= ch && ch <= '9');
    }
}
