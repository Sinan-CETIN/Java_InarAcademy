package Chapters.chapter_10.exercise_10.exercise10_11;

public class Exercise10_11 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("Area --> " + c1.getArea());
        System.out.println("Perimeter --> " + c1.getPerimeter());
        System.out.println("Circle contains (3, 1) --> " + c1.contains(3, 1));
        System.out.println("c1.contains(new Circle2D(4, 5, 10.5)) " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("c1.overlaps(newCircle2D(3, 5, 2.3)) " + c1.overlaps(new Circle2D(3, 5, 2.3)));


        Circle2D c2 = new Circle2D();
        System.out.println(c2.contains(new Circle2D(0.5,0,0.3)));
        System.out.println(c2.overlaps(new Circle2D(2,2,3)));
    }
}
