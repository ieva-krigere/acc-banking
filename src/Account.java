public class Account {
    private static int accountCount;
    private final String accountID;
    private double balance;
    // other fields to include: balanceLimit, transferLimit, currency, isActive, accounts(collection of all accounts)

    public Account() {
        accountCount++;
        this.accountID = "A" + String.format("%03d", accountCount);
        System.out.println("A new account was created");
    }
    public Account(double initialBalance) {
        accountCount++;
        this.accountID = "A" + String.format("%03d", accountCount);
        this.balance = initialBalance;
        System.out.println("A new account was created");
    }

    public String toString() {
        return accountID + "    ( " + balance + " )";
    }

    public double getBalance() {
        return balance;
    }
    public String getAccountID() {
        return accountID;
    }
    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount " + amount + " was deposited to account No. " + getAccountID());
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Amount " + amount + " was withdrawn from account No. " + getAccountID());
    }

    public static boolean transfer(Account sourceAccount, Account targetAccount, double amount) {
        if (sourceAccount.balance >= amount) {
            sourceAccount.balance -= amount;
            targetAccount.balance += amount;
            return true;
        } else {
            return false;
        }
    }
}
