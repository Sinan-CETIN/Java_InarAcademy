package Chapters.chapter_10.exercise_10.exercise10_04;

public class Exercise10_04 {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(2.5, 3.5);
        MyPoint point2 = new MyPoint(2.5, 2.5);
        double x = 1.5;
        double y = 3.5;
        System.out.println(point1.distance(point2));
        System.out.println(point1.distance(x, y));
        System.out.println(point2.distance(x, y));

        System.out.println(point1.getX());
        point1.setX(1.5);
        System.out.println(point1.distance(point2));
        System.out.println(point1.getX());

        //Exercise10_04
        System.out.println();
        MyPoint myPoint = new MyPoint(); // --> point (0, 0)
        MyPoint myPoint1 = new MyPoint(10, 30.5);
        System.out.println(myPoint.distance(myPoint1));
    }
}
