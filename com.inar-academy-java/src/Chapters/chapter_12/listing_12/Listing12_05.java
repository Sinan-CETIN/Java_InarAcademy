package Chapters.chapter_12.listing_12;

import java.util.*;

public class Listing12_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter an integer : ");
                int number = input.nextInt();

                //Display the result
                System.out.println("The number is " + number);

                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Try again. (" +
                        "Incorrect input: an integer is required)");
                input.nextLine();

            }
        }while (continueInput) ;
    }
}
