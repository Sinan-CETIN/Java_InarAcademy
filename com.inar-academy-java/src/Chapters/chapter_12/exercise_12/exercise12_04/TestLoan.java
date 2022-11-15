package Chapters.chapter_12.exercise_12.exercise12_04;

public class TestLoan {
    public static void main(String[] args) {
        try {
            Loan loan1 = new Loan(5, 2, 10000);
            Loan loan2 = new Loan(5, 2, 10000);
            loan2.setNumberOfYears(-1);
            Loan loan3 = new Loan(0, 2, 10000);
            Loan loan4 = new Loan(5, 2, 0);
        } catch(IllegalArgumentException ex) {
            System.out.println(ex.getMessage() + "\n");
            StackTraceElement[] stackTraceElements = ex.getStackTrace();
            for (int i = 0; i < stackTraceElements.length; i++) {
                System.out.println(stackTraceElements[i]);

            }
        }
        System.out.println("Total created Loan object --> " +Loan.getNumberOfLoanObject());
    }
}
