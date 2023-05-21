package gslc;

class BusinessAccount extends Account {
    private double interestRate;

    public BusinessAccount(String accountNumber, double debt, double interestRate) {
        super(accountNumber, debt);
        this.interestRate = interestRate;
    }

    public void loan(double amount) {
        debt += amount;
    }

    public void payback (double amount) {
        if (amount <= debt) {
            debt -= amount;
        } else {
            System.out.println("You pay too much bro");
        }
    }
    
    public double calculateInterest() {
        return debt * interestRate;
    }

    public void displayAccountInfo() {
        System.out.println("Business account - Account Number: " + accountNumber);
        System.out.println("Debt: " + debt);
    }
}