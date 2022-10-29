package Chapters.chapter_10.listing_10;

import java.util.Scanner;

public class Listing10_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String s = input.nextLine();


        //Dsiplay result
        System.out.println("Ignoring nonalphanumeric characters, \n"
                + s + " a palindrome ? " + isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String s1 = filter(s);
        String s2 = reverse(s1);
        return s2.equals(s1);
    }

    public static String filter(String s) {
        //Create a string builder
        StringBuilder stringBuilder = new StringBuilder();

        // Examine each char in the string to skip alphanumeric char
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            }
        }
        // Return a new filtered string
        return stringBuilder.toString();
    }

    public static String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
