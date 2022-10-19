package Chapters.chapter_09.listing_09;

public class TestPassObject {
    public static void main(String[] args) {
        CircleWithPrivateDataFields circle = new CircleWithPrivateDataFields(1);

        //Print areas for radius 1, 2, 3, 4, and 5.
        int n = 5;
        printAreas(circle, n);
        System.out.println("\nRadius is " + circle.getRadius());
        System.out.println("n is " + n);
    }

    public static void printCircle(CircleWithPrivateDataFields circle) {
        System.out.println("The area of the circle of radius "
                + circle.getRadius() + " is " + circle.getArea());
    }

    public static void printAreas(CircleWithPrivateDataFields circle, int number) {
        System.out.println("Radius\t\tArea");
        while (number >= 1) {
            System.out.println(circle.getRadius() + "\t\t" + circle.getArea());
            circle.setRadius(circle.getRadius() + 1);
            number--;
        }
    }
}
