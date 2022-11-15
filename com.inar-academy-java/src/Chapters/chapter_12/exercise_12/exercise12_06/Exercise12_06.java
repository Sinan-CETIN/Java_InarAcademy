package Chapters.chapter_12.exercise_12.exercise12_06;

import java.util.Scanner;

public class Exercise12_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a hax value --> ");
            String hex = input.next();
            System.out.println("Hex value is --> " + hex + " Integer value of hex --> " + hex2Dec(hex));
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int hex2Dec(String hex) {
        int result = 0;
        int pow = hex.length() - 1;
        for (int i = 0; i < hex.length(); i++) {
            if (!isLegalHexValue(hex.charAt(i))) {
                throw new NumberFormatException("Illegal hex value !!!");
            } else {
                if (hex.charAt(i) >= 'A') {
                    result += Math.pow(16, pow--) * (hex.charAt(i) - 'A' + 10);
                } else {
                    result += Math.pow(16, pow--) * (hex.charAt(i) - '0');
                }
            }
        }
        return result;
    }

    public static boolean isLegalHexValue(char ch) {
        if (('A' <= ch && ch <= 'F') || ('0' <= ch && ch <= '9')) {
            return true;
        }
        return false;
    }
}
