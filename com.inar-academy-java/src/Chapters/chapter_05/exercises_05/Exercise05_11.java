public class Exercise05_11 {
    public static void main(String[] args) {
        final int NUMBER_PER_LINE = 10;
        int number = 100;
        int count = 0;
        while(number <= 1000){
            if(number % 5 == 0  ^ number % 6 == 0){
                count++;
                if(count % NUMBER_PER_LINE == 0)
                    System.out.println(number);
                else
                    System.out.print(number + " ");
            }
            number++;
        }
    }
}