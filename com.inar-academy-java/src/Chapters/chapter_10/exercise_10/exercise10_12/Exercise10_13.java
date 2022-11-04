package Chapters.chapter_10.exercise_10.exercise10_12;

import Chapters.chapter_10.exercise_10.exercise10_04.MyPoint;

import javax.security.sasl.RealmCallback;
import java.math.BigDecimal;

public class Exercise10_13 {
    public static void main(String[] args) {
        Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
        System.out.println("Area --> " + t1.getArea());
        System.out.println("Perimeter --> " + t1.getPerimeter());
        System.out.println("Contains (3, 3) --> " + t1.contains(new MyPoint(3, 3)));
        System.out.println("Contains triangle(2.9, 2), (4. 1), (1, 3.4)" +
                t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
        System.out.println("OverLaps triange(2, 5.5), (4. -3), (2, 6.5)" +
                t1.overLaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5))));


        MyPoint p1 = new MyPoint(0,0);
        MyPoint p2 = new MyPoint(3,0);
        MyPoint p3 = new MyPoint(1.5,3);
        MyPoint p = new MyPoint(1.5,1.5);

        Triangle2D t2 = new Triangle2D(new MyPoint(0, 0), new MyPoint(3, 0), new MyPoint(1.5, 3));
        System.out.println(t2.contains(new MyPoint(1.5, 1.5)));
        double area1 = new Triangle2D(p1,p,p2).getArea();
        double area2 = new Triangle2D(p2,p,p3).getArea();
        double area3 = new Triangle2D(p3,p,p1).getArea();
        double area4 = new Triangle2D(p1,p2,p3).getArea();
        System.out.println(area1);
        System.out.println(area2);
        System.out.println(area3);
        System.out.println(area1 + area2 + area3);
        System.out.println(area4);

    }
}
