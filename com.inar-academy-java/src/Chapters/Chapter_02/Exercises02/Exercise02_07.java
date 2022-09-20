import java.util.Scanner ;

public class Exercise02_07 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();
		int hour = minutes / 60 ;
		int day = hour / 24 ;
		int year = day / 365 ;
		int remainingDay = day % 365;
		System.out.println(minutes + "minutes is approximately " + year + " years and " +  remainingDay + " days");
	}
}
