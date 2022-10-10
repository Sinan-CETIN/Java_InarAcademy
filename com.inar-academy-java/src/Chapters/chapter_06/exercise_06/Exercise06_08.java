package Chapters.chapter_06.exercise_06;

public class Exercise06_08 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s\t|\t%-15s%-10s\n", "Celcius", "Fahrenheit", "Fahrenheit", "Celcius");
        System.out.println("-----------------------------------------------------");
        double celcius = 40.0;
        double fahrenheit = 120.0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.1f%-10.1f\t|\t%-15.1f%-10.2f\n", celcius,
                    celsiusToFahrenheit(celcius), fahrenheit, fahrenheitToCelsius(fahrenheit));
            celcius -= 1.0;
            fahrenheit -= 10.0;
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
