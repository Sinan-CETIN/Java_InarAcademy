public class Listing05_15 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;

        int count = 0;
        int number = 2;

        System.out.println("The first 50 prime number are \n");

        //Repeatedly find prime number
        while(count < NUMBER_OF_PRIMES){
            // Assume the number is prime
            boolean isPrime = true;

            //Test whether number is prime
            for(int divisor = 2; divisor <= number / 2; divisor++){
                if(number % divisor == 0){ //if true , number is not prime
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                count++;
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0)
                    System.out.print(number + "\n");
                else
                    System.out.print(number + " ");
            }
            number++;
        }
    }
}
