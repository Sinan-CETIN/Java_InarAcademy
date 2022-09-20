import java.util.Scanner;

public class Exercise04_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year:");
        int year = input.nextInt();
        System.out.print("Enter a month(enter only first three letters of the month name):");
        String month = input.next();
        if(month.length() != 3) {
            System.out.println("Enter only three letters of the month!!");
            System.exit(1);
        }
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch(month.toUpperCase()){
            case "JAN": System.out.println(month.toUpperCase() + " " + year +" has 31 days." );break;
            case "FEB": System.out.println(month.toUpperCase() + " " + year + (isLeapYear?" has 28 days.":" has 27 days" ));break;
            case "MAR": System.out.println(month.toUpperCase() + " " + year +" has 31 days." );break;
            case "APR": System.out.println(month.toUpperCase() + " " + year +" has 30 days." );break;
            case "MAY": System.out.println(month.toUpperCase() + " " + year +" has 31 days." );break;
            case "JUN": System.out.println(month.toUpperCase() + " " + year +" has 30 days." );break;
            case "JUL": System.out.println(month.toUpperCase() + " " + year +" has 31 days." );break;
            case "AUG": System.out.println(month.toUpperCase() + " " + year +" has 31 days." );break;
            case "SEP": System.out.println(month.toUpperCase() + " " + year +" has 30 days." );break;
            case "OCT": System.out.println(month.toUpperCase() + " " + year +" has 31 days." );break;
            case "NOV": System.out.println(month.toUpperCase() + " " + year +" has 30 days." );break;
            case "DEC": System.out.println(month.toUpperCase() + " " + year +" has 31 days." );break;
            default :
                System.out.println("Invalid month name!!");
                System.exit(2);
        }

    }
}
