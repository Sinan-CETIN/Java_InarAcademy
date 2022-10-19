package Chapters.chapter_09.listing_09;

public class TestCircleWithStaticMembers {
    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("The number of Circle Object is " +
                CircleWithStaticMembers.numberOfObjects);


        //Create circle1
        CircleWithStaticMembers c1 = new CircleWithStaticMembers();

        //display c1  BEFORE c2 created
        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius(" + c1.radius + ") and number of Circle objects (" +
                c1.numberOfObjects + ")");

        // create c2
        CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
        //modify c1
        c1.radius = 9;

        System.out.println("\nAfter creating c2 and modifying c1:");
        System.out.println("c1: radius(" + c1.radius + ") and number of Circle objects (" +
                c1.numberOfObjects + ")");
        System.out.println("c1: radius(" + c2.radius + ") and number of Circle objects (" +
                c2.numberOfObjects + ")");
    }
}
