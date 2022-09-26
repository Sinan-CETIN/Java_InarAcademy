package Chapters.chapter_06.Exercise_06;

public class Exercise06_38 {
    public static void main(String[] args) {
        System.out.println("----------------------");

        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) {
                System.out.print("|");
            }
            if ((i + 1) % 10 == 0) {
                System.out.println(Chapters.chapter_06.Listing_06.Listing06_10.getRandomUpperCaseLetter() + "|");
            } else {
                System.out.print(Chapters.chapter_06.Listing_06.Listing06_10.getRandomUpperCaseLetter() + " ");
            }
        }

        System.out.println("----------------------");
        for (int i = 0; i < 100; i++) {
            if (i % 10 == 0) {
                System.out.print("|");
            }
            if ((i + 1) % 10 == 0) {
                System.out.println(Chapters.chapter_06.Listing_06.Listing06_10.getRandomDigitCharacter() + "|");
            } else {
                System.out.print(Chapters.chapter_06.Listing_06.Listing06_10.getRandomDigitCharacter() + " ");
            }
        }
        System.out.println("----------------------");

    }
}
