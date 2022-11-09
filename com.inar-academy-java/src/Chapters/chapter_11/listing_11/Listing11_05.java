package Chapters.chapter_11.listing_11;

import Chapters.chapter_11.listing_11.listing11_01.SimpleGeometricObject;
import Chapters.chapter_11.listing_11.listing11_02.CircleFromSimpleGeometricObject;
import Chapters.chapter_11.listing_11.listing11_03.RectangleFromSimpleGeometricObject;

public class Listing11_05 {
    public static void main(String[] args) {
        displayObject(new CircleFromSimpleGeometricObject
                (1, "red", false));
        displayObject(new RectangleFromSimpleGeometricObject
                (1, 1, "Black", true));
    }

    public static void displayObject(SimpleGeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() +
                ". Color is " + object.getColor());
    }
}
