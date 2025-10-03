abstract class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited into Savings: " + amount);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn from Savings: " + amount);
        } else {
            System.out.println("Insufficient funds in Savings.");
        }
    }
}

class CurrentAccount extends BankAccount {
    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited into Current: " + amount);
    }

    @Override
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn from Current: " + amount);
    }
}

public class Main3 {
    public static void main(String[] args) {
        BankAccount sa = new SavingsAccount(1000);
        BankAccount ca = new CurrentAccount(2000);

        sa.deposit(500);
        sa.withdraw(200);

        ca.deposit(1000);
        ca.withdraw(500);
    }
}
