package Chapters.chapter_13.listing_13.listing13_11;

import java.util.Date;

public class House1 implements Comparable<House> {
    private int id;
    private double area;
    private java.util.Date whenBuilt;

    public House1(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new java.util.Date();
    }

    public int getId() {
        return this.id;
    }

    public double getArea() {
        return this.area;
    }

    public Date getWhenBuilt() {
        return this.whenBuilt;
    }

    @Override
    /** Override the protected clone method defined in the Object
     class, and strengthen its accesibility */
    public Object clone() throws CloneNotSupportedException {
        House1 houseClone = (House1)super.clone();
        houseClone.whenBuilt = (java.util.Date)(this.whenBuilt.clone());
        return houseClone;
    }

    @Override //implemnt the compareTo method defined in Comparable
    public int compareTo(House o) {
        if (this.area > o.getArea()) {
            return 1;
        } else if (this.area == o.getArea()) {
            return 0;
        } else {
            return -1;
        }
    }
}
