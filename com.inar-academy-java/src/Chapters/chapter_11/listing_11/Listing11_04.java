package Chapters.chapter_11.listing_11;

import Chapters.chapter_11.listing_11.listing11_02.CircleFromSimpleGeometricObject;
import Chapters.chapter_11.listing_11.listing11_03.RectangleFromSimpleGeometricObject;

public class Listing11_04 {
    public static void main(String[] args) {
        CircleFromSimpleGeometricObject circle =
                new CircleFromSimpleGeometricObject(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        RectangleFromSimpleGeometricObject rectangle =
                new RectangleFromSimpleGeometricObject(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " +
                rectangle.getPerimeter());
    }
}
