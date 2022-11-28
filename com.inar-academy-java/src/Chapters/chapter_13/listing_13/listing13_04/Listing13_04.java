package Chapters.chapter_13.listing_13.listing13_04;

import Chapters.chapter_13.listing_13.listing13_01.GeometricObject;
import Chapters.chapter_13.listing_13.listing13_02.Circle;
import Chapters.chapter_13.listing_13.listing13_03.Rectangle;

public class Listing13_04 {
    public static void main(String[] args) {
        GeometricObject geoObject1 = new Circle(5);
        GeometricObject geoObject2 = new Rectangle(5, 3);

        System.out.println("The two object have the same area? "+ equalArea(geoObject1, geoObject2));

        // display circle
        displayGeometricObject(geoObject1);

        // display rectangle
        displayGeometricObject(geoObject2);
    }

    public static boolean equalArea(GeometricObject o1, GeometricObject o2) {
        return o1.getArea() == o2.getArea();
    }

    public static void displayGeometricObject(GeometricObject o) {
        System.out.println();
        System.out.println("The area is --> " + o.getArea());
        System.out.println("The perimeter is --> " + o.getPerimeter());
    }
}
