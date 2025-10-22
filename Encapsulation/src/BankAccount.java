//2 exp
public class BankAccount {
    private String accountNumber;
    private double balance;
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("KZ123456789");
        account.setBalance(2500.75);
        account.displayInfo();
    }
}
