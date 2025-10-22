
import java.util.ArrayList;
import java.util.List;

// Интерфейс Account
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    void calculateInterest();
    void viewBalance();
}

class SavingsAccount implements Account {
    private String owner;
    private double balance;
    private double interestRate = 0.05; // 5%

    public SavingsAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(owner + " deposited " + amount + " into SavingsAccount.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(owner + " withdrew " + amount + " from SavingsAccount.");
        } else {
            System.out.println("Insufficient funds in SavingsAccount.");
        }
    }

    public void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    public void viewBalance() {
        System.out.println("SavingsAccount balance for " + owner + ": " + balance);
    }

    public void savingsBonus() {
        System.out.println(owner + " received a savings bonus!");
    }
}
class CurrentAccount implements Account {
    private String owner;
    private double balance;
    private double overdraftLimit = 5000;

    public CurrentAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(owner + " deposited " + amount + " into CurrentAccount.");
    }

    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println(owner + " withdrew " + amount + " from CurrentAccount.");
        } else {
            System.out.println("Overdraft limit exceeded in CurrentAccount.");
        }
    }

    public void calculateInterest() {
        System.out.println("Current accounts do not earn interest.");
    }

    public void viewBalance() {
        System.out.println("CurrentAccount balance for " + owner + ": " + balance);
    }
    public void useOverdraft() {
        System.out.println(owner + " is using overdraft protection.");
    }
}
class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added to bank.");
    }

    public void showAllAccounts() {
        System.out.println("\n--- Bank Accounts Overview ---");
        for (Account acc : accounts) {
            acc.viewBalance();
        }
    }
}
public class Interface4 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount sa = new SavingsAccount("Dina", 10000);
        CurrentAccount ca = new CurrentAccount("Aset", 5000);

        bank.addAccount(sa);
        bank.addAccount(ca);

        sa.deposit(2000);
        sa.calculateInterest();
        sa.viewBalance();
        sa.savingsBonus();

        ca.withdraw(6000);
        ca.useOverdraft();
        ca.viewBalance();

        bank.showAllAccounts();
    }
}
