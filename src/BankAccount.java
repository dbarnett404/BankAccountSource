import java.time.LocalDate;
public abstract class BankAccount {
    private String accountNumber;
    private LocalDate openingDate;
    protected double balance;

    // Constructor
    public BankAccount(AccountHolder accountHolder, LocalDate openingDate, double balance) {
        this.accountNumber = generateAccountNumber(accountHolder);
        this.openingDate = openingDate;
        this.balance = balance;
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(LocalDate openingDate) {
        this.openingDate = openingDate;
    }

    public String generateAccountNumber(AccountHolder person) {        
        return person.getFirstName().substring(0, 2) + person.getLastName().substring(0, 2) + person.getDateOfBirth().substring(0, 2);
    }

    //abstract methods
    abstract double deposit(double amount);

    abstract double withdraw(double amount); 
}
