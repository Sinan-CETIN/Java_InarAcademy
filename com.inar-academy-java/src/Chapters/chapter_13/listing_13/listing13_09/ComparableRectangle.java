package Chapters.chapter_13.listing_13.listing13_09;


import Chapters.chapter_13.listing_13.listing13_03.Rectangle;

public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {

    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public int compareTo(ComparableRectangle o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() == o.getArea()) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Width : " + super.getWidth() + " Height : " + super.getHeight() + "Area: " + this.getArea();
    }
}
