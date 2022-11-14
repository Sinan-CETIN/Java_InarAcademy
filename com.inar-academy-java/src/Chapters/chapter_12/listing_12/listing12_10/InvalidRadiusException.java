package Chapters.chapter_12.listing_12.listing12_10;

public class InvalidRadiusException extends Exception {
    private double radius;

    public InvalidRadiusException(double radius) {
        super("Invalid radius " + radius);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
}
