package Chapters.chapter_12.exercise_12.exercise12_05;

public class TestTriangleWithIllegalTriangleException {
    public static void main(String[] args) throws IllegalTriangleException {
        Triangle triangle = new Triangle(1, 3, 2);
        Triangle triangle1 = new Triangle(2, 3, 2);
        Triangle triangle2 = new Triangle(5, 8, 6);


        //triangle2.setSide1(15); at Chapters.chapter_12.exercise_12.exercise12_05.Triangle.setSide1(Triangle.java:47)
        //triangle2.setSide2(15); at Chapters.chapter_12.exercise_12.exercise12_05.Triangle.setSide2(Triangle.java:58)
        //triangle.setSide3(15); at Chapters.chapter_12.exercise_12.exercise12_05.Triangle.setSide3(Triangle.java:69)
        //Triangle triangle3 = new Triangle(10, 3, 2); at Chapters.chapter_12.exercise_12.exercise12_05.Triangle.<init>(Triangle.java:16)
        //Triangle triangle4 = new Triangle(0, 1, 2); at Chapters.chapter_12.exercise_12.exercise12_05.Triangle.<init>(Triangle.java:16)

    }
}
