package Chapters.chapter_10.exercise_10.exercise10_11;

public class Circle2D {
    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this(0, 0, 1);
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return Math.PI * this.radius * 2;
    }

    public boolean contains(double x, double y) {
        return distance(new Circle2D(x, y, 0)) <= getRadius();
    }

    public boolean contains(Circle2D circle) {
        return distance(circle) + circle.getRadius() <= getRadius();
    }

    private double distance(Circle2D circle) {
        return Math.sqrt(Math.pow(getX() - circle.getX(), 2) + Math.pow(getY() - circle.getY(), 2));
    }

    public boolean overlaps(Circle2D circle) {
        return getRadius() + circle.getRadius() >= distance(circle);
    }
}

