package Chapters.chapter_12.exercise_12.exercise12_10;

import Chapters.chapter_10.exercise_10.exercise10_04.MyPoint;
import Chapters.chapter_10.exercise_10.exercise10_12.Triangle2D;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise12_10 {
    public static void main(String[] args) throws OutOfMemoryError {
        Scanner input = new Scanner(System.in);
        ArrayList<Triangle2D> list = new ArrayList<>();

        try {
            while (true) {
                MyPoint myPoint1 = new MyPoint((int) (Math.random() * 10), (int) (Math.random() * 10));
                MyPoint myPoint2 = new MyPoint((int) (Math.random() * 10), (int) (Math.random() * 10));
                MyPoint myPoint3 = new MyPoint((int) (Math.random() * 10), (int) (Math.random() * 10));
                list.add(new Triangle2D(myPoint1, myPoint2, myPoint3));
            }
        } catch (OutOfMemoryError ex) {
            System.out.println(ex);
        }

    }
}
