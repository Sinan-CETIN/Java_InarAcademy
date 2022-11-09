package Chapters.chapter_11.listing_11.listing11_03;

import Chapters.chapter_11.listing_11.listing11_01.SimpleGeometricObject;

public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject {
    private double width;
    private double height;

    public RectangleFromSimpleGeometricObject() {

    }

    public RectangleFromSimpleGeometricObject(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public RectangleFromSimpleGeometricObject(double width, double height, String color, boolean filled) {
        this(width, height);
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }
}

