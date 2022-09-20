import java.util.Scanner;

public class Exercise04_23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name:");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week:");
        double hour = input.nextDouble();
        System.out.print("Enter hourly pay rate:");
        double hourlyPay = input.nextDouble();
        System.out.print("Enter federal tax withholding rate:");
        double federalTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate:");
        double stateTax = input.nextDouble();

        double groosPay = (hour * hourlyPay);

        System.out.println("Employee Name:" + name +
                "\nHours worked:" + hour +
                "\nPay Rate:" + hourlyPay +
                "\nGross Pay:"+ groosPay +
                "\nDeductions:" +
                "\n  Federal Withholding (" + federalTax * 100.0  + "%):" + (groosPay *  federalTax) +
                "\n  State Withholding (" + stateTax * 100.0 + "%)" + (groosPay * stateTax) +
                "\n  Total Deduction: $" + ((groosPay *  federalTax) + (groosPay * stateTax)) +
                "\nNet Pay: $" + (groosPay - ((groosPay *  federalTax) + (groosPay * stateTax))));
    }

}
