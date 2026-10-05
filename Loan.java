import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan() {
        this(2.5, 1, 1000);
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double r = annualInterestRate / 1200;
        int n = numberOfYears * 12;
        return loanAmount * r / (1 - Math.pow(1 + r, -n));
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }

    public String toString() {
        return "Loan: " +
                "\n\tAnnual Interest Rate: " + annualInterestRate +
                "\n\tNumber of Years: " + numberOfYears +
                "\n\tLoan Amount: " + loanAmount +
                "\n\tLoan Date: " + loanDate +
                "\n";
    }

    public static void main(String[] args) {
        Loan l1 = new Loan();
        System.out.println(l1);

        Loan l2 = new Loan(2.5, 5, 10000);
        System.out.println(l2);
        System.out.println("monthly payment is: " + l2.getMonthlyPayment());
        System.out.println("total payment is: " + l2.getTotalPayment());

        l2.setAnnualInterestRate(4.5);
        l2.setNumberOfYears(10);
        l2.setLoanAmount(100000);
        System.out.println(l2);
    }
}