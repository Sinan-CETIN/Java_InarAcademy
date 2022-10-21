package Chapters.chapter_09.exercise_09;

public class Exercise09_11 {
    public static void main(String[] args) {
        LinearEquation equation = new LinearEquation(9.0, 4.0, 3.0, -5.0, -6.0, -21.0);
        LinearEquation equation1 = new LinearEquation(1.0, 2.0, 2.0, 4.0, 4.0, 5.0);


        display(equation);
        System.out.println("----------------------");
        display(equation1);
    }

    public static void display(LinearEquation equation) {
        if (equation.isSolveble()) {
            System.out.println("Equation" +" x --> " + equation.getX() + "  |  y -->"  + equation.getY());
        } else {
            System.out.println("The equation has no solution");
        }
    }
}
