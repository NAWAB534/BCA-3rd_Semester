package week7;
import java.util.Scanner;

abstract class AbstractAccount {
    int id;
    String accountHolderName;
    String address;
    protected double balance;

    public AbstractAccount(int id, String accountHolderName, String address, double initialBalance) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.balance = initialBalance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

class Saving extends AbstractAccount {
    double minBalance;

    public Saving(int id, String accountHolderName, String address, double initialBalance, double minBalance) {
        super(id, accountHolderName, address, initialBalance);
        this.minBalance = minBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("[Saving] Deposited: " + amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= minBalance) {
            balance -= amount;
            System.out.println("[Saving] Withdrawn: " + amount);
        } else {
            System.out.println("[Saving] Withdrawal denied! Minimum balance of " + minBalance + " must be maintained.");
        }
    }

    public void display() {
        System.out.println("\n--- Saving Account Details ---");
        System.out.println("ID: " + id + " | Name: " + accountHolderName + " | Address: " + address);
        System.out.println("Current Balance: " + balance + " | Minimum Balance: " + minBalance);
    }
}

class Current extends AbstractAccount {
    double maxWithdrawalLimit;

    public Current(int id, String accountHolderName, String address, double initialBalance, double maxWithdrawalLimit) {
        super(id, accountHolderName, address, initialBalance);
        this.maxWithdrawalLimit = maxWithdrawalLimit;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("[Current] Deposited: " + amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > maxWithdrawalLimit) {
            System.out.println("[Current] Withdrawal denied! Exceeds max limit of " + maxWithdrawalLimit);
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("[Current] Withdrawn: " + amount);
        } else {
            System.out.println("[Current] Insufficient funds.");
        }
    }

    public void display() {
        System.out.println("\n--- Current Account Details ---");
        System.out.println("ID: " + id + " | Name: " + accountHolderName + " | Address: " + address);
        System.out.println("Current Balance: " + balance + " | Max Withdrawal Limit: " + maxWithdrawalLimit);
    }
}

public class Problem4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Enter Saving Account Details ===");
        System.out.print("ID: ");
        int sId = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder Name: ");
        String sName = sc.nextLine();
        System.out.print("Address: ");
        String sAddr = sc.nextLine();
        System.out.print("Initial Balance: ");
        double sBal = sc.nextDouble();
        System.out.print("Minimum Balance Required: ");
        double minBal = sc.nextDouble();

        Saving savAcc = new Saving(sId, sName, sAddr, sBal, minBal);
        System.out.print("Enter deposit amount for Saving: ");
        savAcc.deposit(sc.nextDouble());
        System.out.print("Enter withdrawal amount for Saving: ");
        savAcc.withdraw(sc.nextDouble());
        savAcc.display();

        System.out.println("\n=== Enter Current Account Details ===");
        System.out.print("ID: ");
        int cId = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder Name: ");
        String cName = sc.nextLine();
        System.out.print("Address: ");
        String cAddr = sc.nextLine();
        System.out.print("Initial Balance: ");
        double cBal = sc.nextDouble();
        System.out.print("Max Withdrawal Limit: ");
        double maxLimit = sc.nextDouble();

        Current currAcc = new Current(cId, cName, cAddr, cBal, maxLimit);
        System.out.print("Enter deposit amount for Current: ");
        currAcc.deposit(sc.nextDouble());
        System.out.print("Enter withdrawal amount for Current: ");
        currAcc.withdraw(sc.nextDouble());
        currAcc.display();

        sc.close();
    }
}
