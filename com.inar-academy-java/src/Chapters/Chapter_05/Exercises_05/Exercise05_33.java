public class Exercise05_33 {
    public static void main(String[] args) {
        //find factor
        int number = 2;

        while(number <= 10000){
            int divisor = number / 2;
            int sum = 0;

            while(divisor >= 2){
                if(number % divisor == 0)
                    sum += divisor;
                divisor--;
            }
            sum += 1;
            if(number == sum)
                System.out.print(number + "  ");
            number++;
        }
    }
}
