import java.util.Scanner;

public class Listing2_5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);

		// Prompt user for input
		System.out.println("Enter an integer for seconds: ");
		int seconds=input.nextInt();

		int minutes=seconds / 60;
		int remainingSeconds=seconds %  60 ;
		System.out.println(seconds + " seconds is " + minutes + " minutes and " +  remainingSeconds + " seconds");
	}
}
