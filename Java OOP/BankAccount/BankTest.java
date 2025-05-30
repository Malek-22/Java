public class BankTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();
        
        System.out.println("Account 1 Number: " + account1.getAccountNumber());
        System.out.println("Account 2 Number: " + account2.getAccountNumber());
        System.out.println("Account 3 Number: " + account3.getAccountNumber());
        
        System.out.println("\n---- Deposit Test ----");
        account1.deposit("checking", 1000);
        account1.deposit("savings", 500);
        System.out.println("Account 1 Total Balance: $" + account1.getTotalBalance());
        
        account2.deposit("checking", 2000);
        account2.deposit("savings", 1500);
        System.out.println("Account 2 Total Balance: $" + account2.getTotalBalance());
        
        account3.deposit("checking", 500);
        account3.deposit("savings", 2500);
        System.out.println("Account 3 Total Balance: $" + account3.getTotalBalance());
        
        System.out.println("\n---- Withdrawal Test ----");
        account1.withdraw("checking", 200);
        account2.withdraw("savings", 3000);
        account3.withdraw("savings", 500);
        
        System.out.println("Account 1 Balance after withdrawal: $" + account1.getTotalBalance());
        System.out.println("Account 2 Balance after withdrawal: $" + account2.getTotalBalance());
        System.out.println("Account 3 Balance after withdrawal: $" + account3.getTotalBalance());
        
        System.out.println("\n---- Static Test ----");
        System.out.println("Total Number of Bank Accounts: " + BankAccount.getNumOfAccounts());
        System.out.println("Total Money across all accounts: $" + BankAccount.getTotalMoney());
    }
}