package gslc;

abstract class Account {
    protected String accountNumber;
    protected double debt;
  
    public Account(String accountNumber, double debt) {
        this.accountNumber = accountNumber;
        this.debt = debt;
    }
  
    public abstract void loan(double amount);
    public abstract void payback(double amount);
    public abstract void displayAccountInfo();
}
