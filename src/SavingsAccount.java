import java.time.LocalDate;

public class SavingsAccount extends BankAccount {
    private double interestRate;
    private LocalDate depositDate;
    private LocalDate lastInterestLastCalculated;
        
    public SavingsAccount(AccountHolder accountHolder, double balance, double interestRate) {
        super(accountHolder, LocalDate.now(), balance);
        this.interestRate = interestRate;
        setDepositDate(LocalDate.now());
        lastInterestLastCalculated = LocalDate.now();
        
    }

    public double checkBalance(int numYears) {
        return balance * Math.pow(interestRate, numYears);
    }

    public double calculateInterest(LocalDate currentDate) {
        int numYears = currentDate.getYear() - lastInterestLastCalculated.getYear();
        if (numYears >= 1) {
//            System.out.println("Years: " + numYears + ". Balance with interest " + balance + ". Interest rate: " + interestRate + "." );
            lastInterestLastCalculated = currentDate;
            return balance * Math.pow(interestRate, numYears);
        } else {
            return 0;
        }
    }

    public void setDepositDate(LocalDate depositDate) {
        this.depositDate = depositDate;
    }

    public double deposit(double amount) {
        double priorBalance = calculateInterest(depositDate);
//        System.out.printf("Interest: %.2f%n", priorBalance);
        balance += priorBalance + amount;        
        return balance;
    }
            
    public double withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
        return balance;    
    }
}
