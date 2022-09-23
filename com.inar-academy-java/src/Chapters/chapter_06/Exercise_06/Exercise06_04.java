import java.util.Scanner;

public class Exercise06_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println("The number you enter is " + number);
        System.out.print("Reverse of the number you enter is " + Exercise06_03.reverse(number));
        System.out.print("To display reverse number used void method ");
        reverse(number);

    }

    public static void reverse(int num) {
        while (num > 0) {
            System.out.print(num % 10);
            num /= 10;
        }
    }
}
