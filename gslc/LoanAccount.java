package gslc;

// this is the general account for debt for personal

class LoanAccount extends Account implements Interest
{
	
	 private double interestRate;
	 private double maxdebt;
	    public LoanAccount(String accountNumber, double debt, double interestRate, double maxdebt) {
	        super(accountNumber, debt);
	        this.interestRate = interestRate;
	        this.maxdebt = maxdebt;
}

	    public void loan(double amount) {
	    	if(debt+amount <= maxdebt)
	    		debt += amount;
	    	else
	    	System.out.println("you have reach the limit of what you can owe\n");
	    }

	    public void payback(double amount) {
	        if (amount <= debt) {
	            debt -= amount;
	        } else {
	            System.out.println("Your are either too kind or didn't realize you pay more than you owe\n");
	        }
	    }

	    public void displayAccountInfo() {
	        System.out.println("Loan account - Account Number: " + accountNumber);
	        System.out.println("Debt: " + debt + "\n");
	    }
	    
	    public double calculateInterest() {
	        return debt * interestRate;
	    }
}
