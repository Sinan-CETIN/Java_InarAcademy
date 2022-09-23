package Chapters.chapter_06.Exercise_06;

public class Exercise06_09 {
    public static void main(String[] args) {
        System.out.printf("%-5s%15s\t|\t%-10s%-7s", "Feet", "Meters", "Meters", "Feet");
        System.out.println("\n------------------------------------------------------");
        double feet = 1;
        double meter = 20;
        for (int i = 1; i < 11; i++) {
            System.out.printf("%5.1f%15.3f\t|\t%-10.1f%7.3f\n", feet, footToMeter(feet), meter, meterToFoot(meter));
            feet += 1.0;
            meter += 5.0;
        }
    }

    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}
