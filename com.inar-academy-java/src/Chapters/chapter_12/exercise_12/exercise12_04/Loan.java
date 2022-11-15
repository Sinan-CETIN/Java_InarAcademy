package Chapters.chapter_12.exercise_12.exercise12_04;

public class Loan {
    private static int numberOfLoanObject = 0;
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    /** Default constructor */
    public Loan() throws IllegalArgumentException {
        this(2.5, 1, 1000);
    }

    public Loan (double annualInterestRate, int numberOfYears,
                double loanAmount) throws IllegalArgumentException{
        if (annualInterestRate <= 0 || numberOfYears <= 0 || loanAmount <= 0) {
            if (annualInterestRate <= 0) {
                throw new IllegalArgumentException("Illegal annual interest rate -> " + annualInterestRate);
            } else if (numberOfYears <= 0) {
                throw new IllegalArgumentException("Illegal number of years -> " + numberOfYears);
            } else {
                throw new IllegalArgumentException("Illegal annual interest rate -> " + annualInterestRate);
            }
        }

        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
        numberOfLoanObject++;
    }

    /** Return annualInterestRate */
    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    /** Set a new annualInterestRate */
    public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException{
        if (annualInterestRate <= 0) {
            throw new IllegalArgumentException("Illegal annual interest rate -> " + annualInterestRate);
        }
        this.annualInterestRate = annualInterestRate;
    }

    /** Return numberOfYears */
    public int getNumberOfYears() {
        return this.numberOfYears;
    }

    /** Set a new numberOfYears */
    public void setNumberOfYears(int numberOfYears) {
        if (numberOfYears <= 0) {
            throw new IllegalArgumentException("Illegal number of year -> " + numberOfYears);
        }
        this.numberOfYears = numberOfYears;
    }

    /** Return loanAmount */
    public double getLoanAmount() {
        return this.loanAmount;
    }

    /** Set a new loanAmount */
    public void setLoanAmount(double loanAmount) throws IllegalArgumentException{
        if (loanAmount <= 0) {
            throw new IllegalArgumentException("Illegal loan amount -> " + loanAmount);
        }
        this.loanAmount = loanAmount;
    }

    /** Find monthly payment */
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }
    public static int getNumberOfLoanObject() {
        return numberOfLoanObject;
    }

    /** Find total payment */
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }
    /** Return loan date */
    public java.util.Date getLoanDate() {
        return loanDate;
    }

    @Override
    public String toString() {
        String s = String.format("Loan Amount : %.2f\nTotal Amount %.2f", this.loanAmount, this.getTotalPayment());
        return s;
    }
}

