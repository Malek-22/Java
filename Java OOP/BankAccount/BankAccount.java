public class BankAccount {
    
    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber; 

    private static int accounts = 0;
    private static double totalMoney = 0; 

    // Contructor:

    public BankAccount(){
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        this.accountNumber = generateAccountNumber();

        accounts++;
    }

    // Private method to generate a random ten-digit account number:
    public String generateAccountNumber(){
        long account = (long) (Math.random() * 10000000000L);
        return String.format("%010d", account);
    }

    // Getter:

    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }

    public double getTotalBalance(){
        return checkingBalance + savingsBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    
    public static int getNumOfAccounts() {
        return accounts;
    }
    
    public static double getTotalMoney() {
        return totalMoney;
    }

    // METHODS:
    
    // deposit:
    // Users should be able to deposit money into their checking or savings account:
    public void deposit(String account, double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        
        if (account.equalsIgnoreCase("checking")) {
            checkingBalance += amount;
            totalMoney += amount;
            System.out.println("Deposited $" + amount + " into checking account.");
        } else if (account.equalsIgnoreCase("savings")) {
            savingsBalance += amount;
            totalMoney += amount;
            System.out.println("Deposited $" + amount + " into savings account.");
        } else {
            System.out.println("Invalid account type. Please choose either 'checking' or 'savings'.");
        }
    }

    // withdraw:
    // Users should be able to withdraw money if funds allow it. Do not allow withdrawal if insufficient funds:
    public void withdraw(String account, double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        
        if (account.equalsIgnoreCase("checking")) {
            if (checkingBalance < amount) {
                System.out.println("Insufficient funds in checking account.");
            } else {
                checkingBalance -= amount;
                totalMoney -= amount;
                System.out.println("Withdrew $" + amount + " from checking account.");
            }
        } else if(account.equalsIgnoreCase("savings")) {
            if (savingsBalance < amount) {
                System.out.println("Insufficient funds in savings account.");
            } else {
                savingsBalance -= amount;
                totalMoney -= amount;
                System.out.println("Withdrew $" + amount + " from savings account.");
            }
        } else {
            System.out.println("Invalid account type. Please choose either 'checking' or 'savings'.");
        }
    }
}