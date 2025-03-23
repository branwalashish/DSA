import java.math.BigDecimal;

public class BankAccount {
    private String accountHolder;
    private BigDecimal balance;

    public BankAccount(String accountHolder, String initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = new BigDecimal(initialBalance);
    }

    // Deposit money
    public void deposit(String amount) {
        BigDecimal depositAmount = new BigDecimal(amount);
        balance = balance.add(depositAmount);
        System.out.println(accountHolder + " deposited: " + depositAmount);
    }

    // Withdraw money
    public void withdraw(String amount) {
        BigDecimal withdrawAmount = new BigDecimal(amount);
        if (withdrawAmount.compareTo(balance) <= 0) {
            balance = balance.subtract(withdrawAmount);
            System.out.println(accountHolder + " withdrew: " + withdrawAmount);
        } else {
            System.out.println("Insufficient balance for " + accountHolder);
        }
    }

    // Display balance
    public void displayBalance() {
        System.out.println("Current balance of " + accountHolder + ": " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ashish", "1000.50");

        account.displayBalance();
        account.deposit("500.75");
        account.withdraw("300.25");
        account.displayBalance();
        
        // Precision issue with double
        double a = 0.03;
        double b = 0.04;
        System.out.println("Using double: " + (b - a)); // 0.009999999999999998 (Precision Error)

        // Correct precision with BigDecimal
        BigDecimal bigA = new BigDecimal("0.03");
        BigDecimal bigB = new BigDecimal("0.04");
        System.out.println("Using BigDecimal: " + bigB.subtract(bigA)); // 0.01 (Accurate)
    }
}
