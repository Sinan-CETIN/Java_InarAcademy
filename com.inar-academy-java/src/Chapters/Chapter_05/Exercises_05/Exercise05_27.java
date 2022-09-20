public class Exercise05_27 {
    public static void main(String[] args) {
        int numberOfLeapYear = 0;
        final int  LEAP_PER_LINE = 10;
        for(int year = 101; year <= 2100 ; year++)
            if(((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))) {
                numberOfLeapYear++;
                if (numberOfLeapYear % LEAP_PER_LINE == 0)
                    System.out.println(year);
                else
                    System.out.print(year + " ");
            }






    }
}
