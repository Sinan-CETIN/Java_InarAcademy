
import java.util.Scanner;

public class Exercise03_05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter today's day:");
		int day = input.nextInt();
		System.out.print("Enter the number of days elapsed since today:");
		int futureDay = input.nextInt();
		int result = (day + futureDay) % 7;
		System.out.print("Today is ");
		switch(day) {
		case 0:System.out.print("Sunday");break;
		case 1:System.out.print("Monday");break;
		case 2:System.out.print("Tuesday");break;
		case 3:System.out.print("Wednesday");break;
		case 4:System.out.print("Thursday");break;
		case 5:System.out.print("Friday");break;
		case 6:System.out.print("Saturday");break;
		}
		System.out.print(" and the future day is ");
		switch(result) {
		case 0:System.out.println("Sunday");break;
		case 1:System.out.println("Monday");break;
		case 2:System.out.println("Tuesday");break;
		case 3:System.out.println("Wednesday");break;
		case 4:System.out.println("Thursday");break;
		case 5:System.out.println("Friday");break;
		case 6:System.out.println("Saturday");break;
		}
		}
		


}
