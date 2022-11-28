package Chapters.chapter_13.checkpoint_13;

import Chapters.chapter_13.listing_13.listing13_01.GeometricObject;
import Chapters.chapter_13.listing_13.listing13_02.Circle;

public class Test13_26 {
    public static void main(String[] args) {
        GeometricObject x = new Circle(3);
        GeometricObject y = new Circle(3);
        System.out.println(x == y);
    }
}
