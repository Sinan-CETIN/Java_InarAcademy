package Chapters.chapter_12.listing_12;

import Chapters.chapter_12.listing_12.listing12_10.InvalidRadiusException;

public class Listing12_11 {
    public static void main(String[] args) {
        try {
            new CircleWithCustomException(5);
            new CircleWithCustomException(-5);
            new CircleWithCustomException(0);
        } catch (InvalidRadiusException ex) {
            System.out.println(ex);
        }

        System.out.println("Number of Objects created : " +
                CircleWithCustomException.getNumberOfObjects());
    }
}

class CircleWithCustomException {
    private double radius;
    private static int numberOfObjects = 0;

    public CircleWithCustomException() throws InvalidRadiusException {
        this(1.0);
    }

    public CircleWithCustomException(double radius) throws InvalidRadiusException {
        setRadius(radius);
        this.numberOfObjects++;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) throws InvalidRadiusException {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            throw new InvalidRadiusException(radius);
        }
    }

    /**
     * Return numberOfObjects
     */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /**
     * Return the area of this circle
     */
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
