package Chapters.chapter_13.listing_13.listing13_02;

import Chapters.chapter_13.listing_13.listing13_01.GeometricObject;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() + "\nradius: " + this.radius + "\nArea: " + this.getArea() + "\nPerimbeter: " + this.getPerimeter();
    }
}
