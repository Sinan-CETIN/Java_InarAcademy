package Chapters.chapter_10.exercise_10.exercise10_12;

import Chapters.chapter_10.exercise_10.exercise10_04.MyPoint;

import java.math.BigDecimal;

public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2D() {
        this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(2, 5));
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public MyPoint getP1() {
        return this.p1;
    }

    public MyPoint getP2() {
        return this.p2;
    }

    public MyPoint getP3() {
        return this.p3;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s *
                (s - p1.distance(p2)) *
                (s - p2.distance(p3)) *
                (s - p3.distance(p1)));
    }
    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    public boolean contains(MyPoint p) {
        return (getArea() == new Triangle2D(p1, p, p2).getArea() + new Triangle2D(p2, p, p3).getArea() + new Triangle2D(p1, p, p3).getArea());
    }

    public boolean contains(Triangle2D triangle2D) {
        return (contains(triangle2D.getP1()) && contains(triangle2D.getP2()) && contains(triangle2D.getP3()));
    }

    public boolean overLaps(Triangle2D triangle2D) {
        return (contains(triangle2D.getP1()) || contains(triangle2D.getP2()) || contains(triangle2D.getP3()));
    }

}
