public class Listing06_07 {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n");
        printPrimeNumbers(50);
    }

    public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PER_LINE = 10;
        int count = 0;
        int number = 2;

        while (count < numberOfPrimes) {
            //Print the prime number and increase the count
            if (isPrime(number)) {
                count++;
                if (count % NUMBER_OF_PER_LINE == 0)
                    System.out.println(number);
                else
                    System.out.printf("%-5s", number);
            }
            number++;
        }
    }
        public static boolean isPrime(int number){
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0)
                    return false;
             }
            return true;
         }
}

