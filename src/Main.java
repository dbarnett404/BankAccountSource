import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AccountHolder accountHolder = new AccountHolder("John", "Doe", "01/01/2000");
        SavingsAccount savingsAccount = new SavingsAccount(accountHolder, 1000, 0.05);
        System.out.println("Initial balance: " + savingsAccount.balance);
        LocalDate currentDate = savingsAccount.getOpeningDate();
        for (int i = 1; i <= 10; i++) {
            currentDate = currentDate.plusYears(1); // Update currentDate by assigning the result of plusYears back to currentDate
            savingsAccount.setDepositDate(currentDate);
            savingsAccount.deposit(1000);
            System.out.printf("Balance after year %d: %.2f%n", i, savingsAccount.balance);
        }
        
    }
}
