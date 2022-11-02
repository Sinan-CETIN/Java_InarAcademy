package Chapters.chapter_10.exercise_10.exercise10_09;

public class Exercise10_09 {
    public static void main(String[] args) {
        Course course = new Course("Data Structure");
        String[] students = {"Ali", "Veli", "Kemal", "Mali", "Ahmet", "Sinan", "Serhat"};

        addStudentsToCourse(course, students);
        System.out.println(course.toString());

        course.dropStudent("Ahmet");
        System.out.println(course.toString());

        course.clear();
        System.out.println(course.toString());

    }


    public static void addStudentsToCourse(Course course, String[] students) {
        for (int i = 0; i < students.length; i++) {
            course.addStudent(students[i]);
        }
    }
}
