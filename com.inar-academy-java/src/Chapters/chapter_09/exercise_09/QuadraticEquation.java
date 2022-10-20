package Chapters.chapter_09.exercise_09;

public class QuadraticEquation {
    /*
    ■ Private data fields a, b, and c that represent three coefficients.
    ■ A constructor for the arguments for a, b, and c.
    ■ Three getter methods for a, b, and c.
    ■ A method named getDiscriminant() that returns the discriminant, which is
    b2 - 4ac.
    ■ The methods named getRoot1() and getRoot2() for returning two roots of
    the equation
     */
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(getB(), 2) - (4 * a * c);
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        return (-1 * getB() + Math.sqrt(getDiscriminant())) / 2 * getA();
    }

    public double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        return (-1 * getB() - Math.sqrt(getDiscriminant())) / 2 * getA();
    }

    public String toString() {
        if (getDiscriminant() < 0) {
            return "The equation has no real roots";
        }
        if (getDiscriminant() == 0) {
            return "The equation has one root --> " + getRoot1();
        }
        return "root 1 --> " + getRoot1() + " root 2 --> " + getRoot2();
    }
}
