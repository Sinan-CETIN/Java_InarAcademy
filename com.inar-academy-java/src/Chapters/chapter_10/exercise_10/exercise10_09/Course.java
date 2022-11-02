package Chapters.chapter_10.exercise_10.exercise10_09;

import java.util.Arrays;

public class Course {
    private String courseName;
    private String[] students = new String[5];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents == students.length) {
            String[] temp = new String[students.length * 2 + 1];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
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

    public void clear() {
        students = new String[100];
    }

    public String toString() {
        if (students[0] == null) {
            return "there are no students on the course at the moment!";
        }
        String result = "";
        for (int i = 0; i < numberOfStudents; i++) {

            if (i == numberOfStudents - 1) {
                result += students[i];
            } else {
                result += students[i] + " , ";
            }
        }
        return "{" + result + "}";
    }
}
