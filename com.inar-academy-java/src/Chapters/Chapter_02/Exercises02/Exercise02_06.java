import java.util.Scanner ;

public class Exercise02_06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer between 0 and 1000");
		int number = input.nextInt();
		int number1 = number % 10;
		number /= 10 ;
		int number2 = number % 10 ;
		number /= 10;
		System.out.println("The sum of the digits is " + ( number1 + number2 + number));
	}
}
