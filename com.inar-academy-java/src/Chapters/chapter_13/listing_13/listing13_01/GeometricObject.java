package Chapters.chapter_13.listing_13.listing13_01;

import Chapters.chapter_11.checkpoint_11.test1.D;

import java.util.Date;

public abstract class GeometricObject {
    private String color = "White";
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject() {
        this.dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled) {
        this.dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    /**
     * return Color
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    @Override
    public String toString() {
        return "created on: " + this.dateCreated + "\ncolor: " + this.color + " and filled: " + this.filled;
    }

    /**
     * Abstract method getArea
     */
    public abstract double getArea();

    /**
     * Abstract method getPerimeter
     */
    public abstract double getPerimeter();
}

