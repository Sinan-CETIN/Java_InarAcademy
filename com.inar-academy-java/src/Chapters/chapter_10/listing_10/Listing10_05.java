package Chapters.chapter_10.listing_10;

public class Listing10_05 {
    public static void main(String[] args) {
        Course course1 = new Course("Date Structures");
        Course course2 = new Course("Database Systems");
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1 : " + course1.getNumberOfStudents());
        System.out.println(course1.toString());
        System.out.println();

        System.out.println("Number of students in course2: " + course2.getNumberOfStudents());
        System.out.println(course2.toString());
        System.out.println();
        course1.dropStudent("Anne Kennedy");
        System.out.println("Number of students in course1 : " + course1.getNumberOfStudents());
        System.out.println(course1.toString());
    }
}
