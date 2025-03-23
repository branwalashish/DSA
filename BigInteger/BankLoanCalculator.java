import java.math.BigInteger;

public class BankLoanCalculator {
    private String borrowerName;
    private BigInteger loanAmount;
    private BigInteger interestRate; // Assume interest rate is stored as percentage * 100 (e.g., 7.5% → 750)
    private int tenureYears;

    public BankLoanCalculator(String borrowerName, String loanAmount, String interestRate, int tenureYears) {
        this.borrowerName = borrowerName;
        this.loanAmount = new BigInteger(loanAmount);
        this.interestRate = new BigInteger(interestRate);
        this.tenureYears = tenureYears;
    }

    // Calculate simple interest: (P × R × T) / 100
    public void calculateSimpleInterest() {
        BigInteger interest = loanAmount.multiply(interestRate).multiply(BigInteger.valueOf(tenureYears)).divide(BigInteger.valueOf(10000));
        BigInteger totalAmount = loanAmount.add(interest);

        System.out.println("Borrower: " + borrowerName);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Total Interest: " + interest);
        System.out.println("Total Amount to be Paid: " + totalAmount);
    }

    public static void main(String[] args) {
        // Example: Loan of 5 trillion (5000000000000) at 7.5% interest for 10 years
        BankLoanCalculator loan = new BankLoanCalculator("Ashish", "5000000000000", "750", 10);
        loan.calculateSimpleInterest();

        // Comparing large numbers
        BigInteger num1 = new BigInteger("99999999999999999999999");
        BigInteger num2 = new BigInteger("88888888888888888888888");
        System.out.println("Maximum: " + num1.max(num2));  // Finds the larger value

        // Factorial of 100 (Demonstrating power of BigInteger)
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= 100; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of 100: " + fact);
    }
}
