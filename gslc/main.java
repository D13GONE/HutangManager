package gslc;

public class main {
    public static void main(String[] args) {
        // Create loan customer account
        LoanAccount loanAccount = new LoanAccount("SA001", 5000, 0.05, 10000);
        loanAccount.displayAccountInfo();
        loanAccount.loan(6000); // debt will not be added since it more than the limit
        loanAccount.loan(100); // add debt to account
        loanAccount.displayAccountInfo();
        loanAccount.payback(10000); // pay to much for the debt
        loanAccount.payback(500); // pay for debt
        loanAccount.displayAccountInfo(); // show the account debt 
        System.out.println("Interest: " + loanAccount.calculateInterest() + "\n");
        
       
        
        // create loan for business account account
      BusinessAccount businessAccount = new BusinessAccount("SA002", 5000, 0.1);
        businessAccount.displayAccountInfo();
        System.out.println("Interest: " + businessAccount.calculateInterest()+ "\n");
    }
}