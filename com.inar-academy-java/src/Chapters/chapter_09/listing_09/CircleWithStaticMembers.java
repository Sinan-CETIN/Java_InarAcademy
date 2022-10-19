package Chapters.chapter_09.listing_09;

public class CircleWithStaticMembers {
    double radius;
    /**
     * The number of objects created
     */
    static int numberOfObjects = 0;

    /**
     * Construct a circle with radius 1
     */
    CircleWithStaticMembers() {
        radius = 1;
        numberOfObjects++;
    }

    CircleWithStaticMembers(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    /**
     * Construct a circle with a specified radius
     * CircleWithStaticMembers(double newRadius) {
     * radius = newRadius;
     * numberOfObjects++;
     * }
     * /** Return numberOfObjects
     */
    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /**
     * Return the area of this circle
     */
    double getArea() {
        return radius * radius * Math.PI;
    }

    double getRadius(){
        return radius;
    }
}

