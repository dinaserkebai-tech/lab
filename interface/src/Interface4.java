import java.util.ArrayList;
import java.util.List;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    void viewBalance();
}

class SavingsAccount implements Account {
    double balance;
    double interestRate = 0.03;

    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public double calculateInterest() {
        return balance * interestRate;
    }
    public void viewBalance() {
        System.out.println("Savings Balance: " + balance);
    }
}

class CurrentAccount implements Account {
    double balance;

    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public double calculateInterest() {
        return 0; // current accounts no interest
    }
    public void viewBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class Bank {
    List<Account> accounts = new ArrayList<>();

    void addAccount(Account acc) {
        accounts.add(acc);
    }

    void showAccounts() {
        for (Account a : accounts) {
            a.viewBalance();
        }
    }
}

public class Interface4 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount sa = new SavingsAccount();
        sa.deposit(1000);
        sa.viewBalance();

        CurrentAccount ca = new CurrentAccount();
        ca.deposit(2000);
        ca.viewBalance();

        bank.addAccount(sa);
        bank.addAccount(ca);

        bank.showAccounts();
    }
}
