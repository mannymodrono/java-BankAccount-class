public class BankAccount {
    //instance vars
    private double balance;

    //constructors
    public BankAccount() { }

    public BankAccount(double pBalance){
        this.balance = pBalance;
    }

    //methods
    public void setBalance(double pBalance) {
        this.balance = pBalance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double money) {
        this.balance += money;
    }

    public void withdraw(double money) {
        this.balance -= money;
    }

    public double calcInterest(double interestRate){
        double interest = this.balance * interestRate;
        return this.balance + interest;
    }
}