package Chapters.chapter_10.exercise_10.exercise10_02;

public class Exercise10_02 {
    public static void main(String[] args) {
        BMI sinan = new BMI("Sinan" , 26, 94,5,11);
        System.out.println(sinan.getStatus());

        BMI sinan1 = new BMI("Sinan", 26, 94,181);
        System.out.println(sinan1.getStatus());

        System.out.println(sinan.getBMI());
        System.out.println(sinan1.getBMI());
        BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is " +
                bmi1.getBMI() + " " + bmi1.getStatus());
    }
}
