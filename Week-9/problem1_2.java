package week9;

import java.util.Scanner;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);

    static void aboutBank() {
        System.out.println("=== Welcome to State National Bank ===");
    }

    default void takeLoan(double loanAmount) {
        System.out.println("Loan facility is not available for this account type.");
    }
}

class Saving implements Account {
    private double balance;

    public Saving(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("[Saving] Deposited: Rs. " + amount + " | Current Balance: Rs. " + balance);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("[Saving] Withdrawn: Rs. " + amount + " | Remaining Balance: Rs. " + balance);
        } else {
            System.out.println("[Saving] Insufficient balance.");
        }
    }

    @Override
    public void takeLoan(double loanAmount) {
        System.out.println("[Saving] Loan of Rs. " + loanAmount + " approved at 8.5% interest!");
    }
}

class Current implements Account {
    private double balance;

    public Current(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("[Current] Deposited: Rs. " + amount + " | Current Balance: Rs. " + balance);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("[Current] Withdrawn: Rs. " + amount + " | Remaining Balance: Rs. " + balance);
        } else {
            System.out.println("[Current] Insufficient balance.");
        }
    }
}

public class problem1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account.aboutBank();

        System.out.print("\nEnter initial balance for Saving Account: ");
        Saving sav = new Saving(sc.nextDouble());
        System.out.print("Enter deposit amount for Saving: ");
        sav.deposit(sc.nextDouble());
        System.out.print("Enter withdrawal amount for Saving: ");
        sav.withdraw(sc.nextDouble());
        System.out.print("Enter loan amount requested for Saving: ");
        sav.takeLoan(sc.nextDouble());

        System.out.print("\nEnter initial balance for Current Account: ");
        Current curr = new Current(sc.nextDouble());
        System.out.print("Enter deposit amount for Current: ");
        curr.deposit(sc.nextDouble());
        System.out.print("Enter withdrawal amount for Current: ");
        curr.withdraw(sc.nextDouble());

        sc.close();
    }
}