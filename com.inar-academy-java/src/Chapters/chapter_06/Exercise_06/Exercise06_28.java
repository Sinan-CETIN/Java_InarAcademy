package Chapters.chapter_06.Exercise_06;

public class Exercise06_28 {
    public static void main(String[] args) {
        //print header
        System.out.printf("%-15s%-10s", "p" , "2^p-1");
        System.out.println("-------------------------------");
        int number = 2;
        while (number <= 31) {
            if (isMersennePrime(number)) {
                System.out.printf("%-15d%-15d\n", number, (int)(Math.pow(2, number) -1));
            }
            number++;
        }
    }

    public static boolean isMersennePrime(int number) {
        if (Exercise06_27.isPrime(number) && Exercise06_27.isPrime((int)(Math.pow(2, number) - 1))) {
            return true;
        }
        return false;
    }
}
