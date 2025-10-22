// Task 9:

class BankAccount9 {
    protected double balance;

    BankAccount9(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    void withdraw(double amount) {
        System.out.println("Withdraw method in base class");
    }

    void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }
}
class SavingsAccount9 extends BankAccount9 {
    private static final double WITHDRAW_LIMIT = 1000; // лимит на снятие

    SavingsAccount9(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount > WITHDRAW_LIMIT) {
            System.out.println("Withdrawal limit exceeded! Max allowed: $" + WITHDRAW_LIMIT);
        } else if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Savings Account");
        }
    }
}

class CheckingAccount9 extends BankAccount9 {
    private static final double TRANSACTION_FEE = 2.5; // комиссия за транзакцию

    CheckingAccount9(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        double total = amount + TRANSACTION_FEE;
        if (total > balance) {
            System.out.println("Insufficient funds (including fee)!");
        } else {
            balance -= total;
            System.out.println("Withdrew $" + amount + " with fee $" + TRANSACTION_FEE);
        }
    }
}
public class BankAccountTest9 {
    public static void main(String[] args) {
        BankAccount9 savings = new SavingsAccount9(1500);
        BankAccount9 checking = new CheckingAccount9(800);

        System.out.println("=== Savings Account ===");
        savings.deposit(200);
        savings.withdraw(1200);
        savings.displayBalance();

        System.out.println("\n=== Checking Account ===");
        checking.deposit(300);
        checking.withdraw(500);
        checking.displayBalance();
    }
}
