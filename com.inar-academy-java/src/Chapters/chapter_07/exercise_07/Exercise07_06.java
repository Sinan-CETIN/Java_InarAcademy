package Chapters.chapter_07.exercise_07;

public class Exercise07_06 {
    public static void main(String[] args) {
        int[] primeNumbers = new int[50];
        int number = 2;
        int count = 0;
        while (count < primeNumbers.length) {
            if (isPrime(number, primeNumbers, count)) {
                primeNumbers[count++] = number;
            }
            number++;
        }

        displayPrimeNumbers(primeNumbers);
    }

    public static boolean isPrime(int number, int[] primeNumbers, int count) {

        for (int i = 0; i < count; i++){
          int divisor = primeNumbers[i];
          if(divisor > Math.sqrt(number)) break;

          if (number % divisor == 0)
              return false;
          divisor = primeNumbers[i];
      }
      return true;
    }

    public static void displayPrimeNumbers(int[] list) {

        System.out.print("First 50 prime numbers are : \n");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
            if((i + 1) % 10 == 0)
                System.out.println();
        }
    }
}
