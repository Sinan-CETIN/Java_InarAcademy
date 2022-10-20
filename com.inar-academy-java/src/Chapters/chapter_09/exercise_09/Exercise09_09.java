package Chapters.chapter_09.exercise_09;

public class Exercise09_09 {
    public static void main(String[] args) {
        RegularPolygon regularPolygon = new RegularPolygon(6,4);
        RegularPolygon regularPolygon2 = new RegularPolygon(10,4, 5.6, 7.8);

        System.out.println("regularPolygon1 perimeter -->  " + regularPolygon.getPerimeter() + " Area --> " + regularPolygon.getArea());
        System.out.println("regularPolygon2 perimeter -->  " + regularPolygon2.getPerimeter() + " Area --> " + regularPolygon2.getArea());
    }
}
