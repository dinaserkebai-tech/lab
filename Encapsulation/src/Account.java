//12 exp


public class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public static void main(String[] args) {
        Account myAccount = new Account("ACC12345", "John Doe", 1000.0);

        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Account Holder: " + myAccount.getAccountHolder());
        System.out.println("Balance: $" + myAccount.getBalance());
        myAccount.deposit(500.0);
        System.out.println("Updated Balance: $" + myAccount.getBalance());

        myAccount.withdraw(300.0);
        System.out.println("Updated Balance: $" + myAccount.getBalance());

        myAccount.withdraw(1500.0); // Invalid withdrawal
    }
}