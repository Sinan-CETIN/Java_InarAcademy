package Chapters.chapter_07.exercise_07;

import Chapters.chapter_07.listing_07.Listing07_06;
import Chapters.chapter_07.listing_07.Listing07_07;
import java.util.*;

public class Exercise07_16 {
    public static void main(String[] args) {
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000000);
        }
        Arrays.sort(array);

        long startTime = System.currentTimeMillis();
        Listing07_06.linearSearch(array, (int) (Math.random() * 10000000) );
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("linear search longs " + (executionTime) + " milliseconds.");


        startTime = System.currentTimeMillis();
        Listing07_07.binarySearch(array, 1000);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("binary search longs " + (executionTime) + " milliseconds.");

    }
}
