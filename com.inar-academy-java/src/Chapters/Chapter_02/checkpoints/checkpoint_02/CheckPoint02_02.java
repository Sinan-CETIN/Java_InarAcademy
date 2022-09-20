import java.util.*;

public class CheckPoint02_02 {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a double value : ");
		double number = input.nextDouble();
		System.out.println(number);
		/*Exception in thread "main" java.util.InputMismatchException
 *	at java.util.Scanner.throwFor(Scanner.java:864)
 *	at java.util.Scanner.next(Scanner.java:1485)
 * 	at java.util.Scanner.nextDouble(Scanner.java:2413)
 *	at CheckPoint02_02.main(CheckPoint02_02.java:8)
 */
	}
}
		
