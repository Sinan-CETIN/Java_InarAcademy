package Chapters.chapter_06.Exercise_06;

import java.util.Scanner;

public class Exercise06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter password: ");
        String p1 = input.next();

        System.out.print("Re-enter password: ");
        String p2 = input.next();

        while (p1.compareTo(p2) != 0 || !validPassword(p1)) {
            System.out.print("invalid input try new password: ");
            p1 = input.next();
            System.out.print("Re-enter password: ");
            p2 = input.next();
        }

        System.out.println(p1 + " is a valid " + p1);
    }

    public static boolean validPassword(String password) {
        if (password.length() < 8)
            return false;

        int count = 0;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i)))
                count++;
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }

        if (count < 2)
            return false;

        return true;
    }
}
