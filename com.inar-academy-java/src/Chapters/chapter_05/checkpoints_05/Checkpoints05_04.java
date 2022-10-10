
public class Checkpoints05_04 {
    public static void main(String[] args) {
        //5.21
        System.out.println("no, it will not throws an exception");
        System.out.println();

        //5.22
        System.out.println("Yes");
        System.out.println();

        //5.24
        int balance = 10;
        while (true) {
            if (balance < 9)
                break;
            balance = balance - 9;
        }
        System.out.println("Balance is "
                + balance);

        balance = 10;

        /** while (true) {
            if (balance < 9)
                continue;
            balance = balance - 9;
        }
        System.out.println("Balance is "
                + balance); is infinite loop */
        System.out.println();

        //5.25
        System.out.println("in while loop code will never terminate when go inside the if statement." +
        "to fix this add i++ in if statements");
        System.out.println();

        //5.26
        int sum = 0;
        int number = 0;
        boolean br = true;
        while(number < 20 && br){
            number++;
            sum += number;
            if(sum >= 100)
                br = false;
        }
        System.out.println(number + "   " + sum);
        System.out.println();

        sum = 0;
        number = 0;
        while(number < 20){
            number++;
            if(number != 11 || number != 12)
                sum += number;
        }
        System.out.println(number + "  " + sum);
        System.out.println();

        //5.26
        System.out.println("5.27a)System.out.println(i);");
        System.out.println("5.27b)j++;");
    }
}


