package Chapters.chapter_09.checkpoint_09;

public class Checkpoint09_03 {
    public static void main(String[] args) {
        System.out.println("9.14 How do you create a Date for the current time? How do you display the current time?\n" +
                "9.15 How do you create a Point2D? Suppose p1 and p2 are two instances of Point2D?\n" +
                "How do you obtain the distance between the two points?\n" +
                "9.16 Which packages contain the classes Date, Random, Point2D, System, and Math?");
        System.out.println();
        System.out.println("9.14 --> Date date = new Date(); date.toString();");
        System.out.println("9.15 --> Point2D p1 = new Point2D(x, y); Point2D p2 = new Point2D(x, y);");
        System.out.println("9.16 --> Java API.Date is in the java.util package. Random is in the java.util package. \n" +
                "Point2D is in the javafx.geometry package. System and Math are in the java.lang package.");

        System.out.println("9.17 --> System.out.println(f.i); --> true\n" +
                "System.out.println(f.s); --> true\n" +
                "f.imethod(); --> true\n" +
                "f.smethod(); --> true\n" +
                "System.out.println(F.i); --> false\n" +
                "System.out.println(F.s); --> true\n" +
                "F.imethod(); --> false\n" +
                "F.smethod(); --> true ");

        System.out.println("\nYou can not invoke instance method \nand reference an instance variable from a static methot");
        System.out.println("\nYou can invoke a static method or \nreference a static variable from an instance method");
        System.out.println("You cannot invoke method1() in main method since main method is static and method1() is not.c is a instance variable/n" +
                " and cannot be accessed in static method");


    }
}
