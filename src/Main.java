import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(1000);
        System.out.println(account1.toString());

        Account account2 = new Account(1000);
        System.out.println(account2.toString());

        System.out.println("\nDEPOSIT:");
        account1.deposit(100);

        System.out.println("\nWITHDRAW:");
        account2.withdraw(100);

        System.out.println("\nBALANCE:");
        System.out.println(account1.toString());
        System.out.println(account2.toString());

        System.out.println("\nTRANSFER:");
        boolean transferOK = Account.transfer(account1, account2, 100);
        if (transferOK) {
            System.out.println("Transfer successful. New balance:");
            System.out.println(account1.toString());
            System.out.println(account2.toString());
        } else {
            System.out.println("Transfer failed.");
        }
    }
}