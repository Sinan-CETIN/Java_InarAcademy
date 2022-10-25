package Chapters.chapter_10.listing_10;

public class Course {

    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents == students.length) {
            System.out.println("Course is full");
        }
        students[numberOfStudents++] = student;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String name) {
        int index = findIndex(name, students);
        //left the students after index one space left

        for (int i = index; i < numberOfStudents; i++) {
            students[i] = students[i + 1];
        }
        numberOfStudents--;
    }


    private static int findIndex(String name, String[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }
    public String toString() {
        String result = "";
        for (int i = 0; i < numberOfStudents; i++) {
            result += students[i] + " , ";
        }
        return "{" + result + "}";
    }
}
