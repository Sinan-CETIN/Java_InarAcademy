package Chapters.chapter_13.listing_13.listing13_10;

import Chapters.chapter_13.listing_13.listing13_09.ComparableRectangle;

public class SortRectangles {
    public static void main(String[] args) {
        ComparableRectangle[] rectangles = {
                new ComparableRectangle(3.4, 5.4),
                new ComparableRectangle(13.24, 55.4),
                new ComparableRectangle(7.4, 35.4),
                new ComparableRectangle(1.4, 25.4)};

        java.util.Arrays.sort(rectangles);
        for(ComparableRectangle rectangle : rectangles) {
            System.out.print(rectangle + " ");
            System.out.println();
        }
    }
}

