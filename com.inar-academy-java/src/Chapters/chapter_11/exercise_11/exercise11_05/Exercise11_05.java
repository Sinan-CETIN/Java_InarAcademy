package Chapters.chapter_11.exercise_11.exercise11_05;

public class Exercise11_05 {
    public static void main(String[] args) {
        Course course = new Course("Data Science");
        System.out.println(course.getCourseName());
        System.out.println(course.getNumberOfStudents());
        course.addStudent("Sinan");
        course.addStudent("Ayse");
        course.addStudent("Keaml");
        System.out.println(course.toString());
        course.dropStudent("Haluk");
        course.dropStudent("Keaml");
        System.out.println(course.getNumberOfStudents());
        System.out.println(course.toString());
    }
}
