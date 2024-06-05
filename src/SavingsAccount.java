import java.time.LocalDate;

/**
 * Represents a savings account that extends the BankAccount class.
 */
public class SavingsAccount extends BankAccount {
    private double interestRate;
    private LocalDate depositDate;
    private LocalDate lastInterestLastCalculated;
        
    /**
     * Constructs a SavingsAccount object with the specified account holder, balance, and interest rate.
     * 
     * @param accountHolder the account holder associated with the savings account
     * @param balance the initial balance of the savings account
     * @param interestRate the interest rate of the savings account
     */
    public SavingsAccount(AccountHolder accountHolder, double balance, double interestRate) {
        super(accountHolder, LocalDate.now(), balance);
        this.interestRate = interestRate;
        setDepositDate(LocalDate.now());
        lastInterestLastCalculated = LocalDate.now();
    }

    /**
     * Calculates the balance of the savings account after a specified number of years.
     * 
     * @param numYears the number of years to calculate the balance for
     * @return the balance of the savings account after the specified number of years
     */
    public double checkBalance(int numYears) {
        return balance * Math.pow(interestRate, numYears);
    }

    /**
     * COMPLETE THIS METHOD - Interest is calculated annually
     * Calculates the interest earned by the savings account up to the specified date.
     * 
     * @param currentDate the date up to which the interest should be calculated
     * @return the interest earned by the savings account up to the specified date
     */
    public double calculateInterest(LocalDate currentDate) {
        //Implement your code here      
        return balance;        
    }

    /**
     * Sets the deposit date of the savings account.
     * 
     * @param depositDate the deposit date to set
     */
    public void setDepositDate(LocalDate depositDate) {
        this.depositDate = depositDate;
    }

    /**
     * COMPLETE THIS METHOD. Interest is calculated on the princpal amount before the new balance is added
     * Interest is calculated annually
     * Deposits the specified amount into the savings account and calculates the interest.
     * 
     * @param amount the amount to deposit
     * @return the new balance of the savings account
     */
    public double deposit(double amount) {
        //Implement your code here      
        return balance;
    }
            
    /**
     * Withdraws the specified amount from the savings account, if sufficient funds are available.
     * 
     * @param amount the amount to withdraw
     * @return the new balance of the savings account
     */
    public double withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
        return balance;    
    }
}
