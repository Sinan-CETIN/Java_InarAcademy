package Chapters.chapter_11.listing_11;

import java.util.Scanner;
import java.util.ArrayList;

public class Listing11_09 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (input ands with 0):");
        int value;
        do {
            value = input.nextInt();
            if(!list.contains(value) && value != 0) {
                list.add(value);
            }
        } while (value != 0);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
