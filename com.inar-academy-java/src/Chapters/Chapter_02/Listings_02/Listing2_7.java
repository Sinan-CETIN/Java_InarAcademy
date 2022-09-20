public class Listing2_7 {
	public static void main(String[] args) {
		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();

		// Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000 ;

		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60 ;

		long totalMinutes = totalSeconds / 60 ;
		long currentMinute = totalMinutes % 60 ;

		long totalHours = totalMinutes / 24 ;
		long currentHour = totalHours % 24 ;

		// Display the result
		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
	}
}
