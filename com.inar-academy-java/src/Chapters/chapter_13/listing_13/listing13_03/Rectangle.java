package Chapters.chapter_13.listing_13.listing13_03;

import Chapters.chapter_13.listing_13.listing13_01.GeometricObject;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    @Override
    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
