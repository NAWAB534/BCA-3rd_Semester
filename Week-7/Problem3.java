package week7;
import java.util.Scanner;

class Account {
    int id;
    String accountHolderName;
    String address;
    double balance;

    public Account(int id, String accountHolderName, String address, double balance) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100.0;
    }

    public static double calculateCompoundInterest(double principal, double rate, double time) {
        double amount = principal * Math.pow((1 + rate / 100.0), time);
        return amount - principal;
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        Account acc = new Account(id, name, address, balance);

        System.out.print("Enter amount to deposit: ");
        acc.deposit(sc.nextDouble());

        System.out.print("Enter amount to withdraw: ");
        acc.withdraw(sc.nextDouble());

        System.out.println("\n--- Interest Calculation ---");
        System.out.print("Enter Principal Amount: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate of Interest (%): ");
        double r = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double t = sc.nextDouble();

        double si = Account.calculateSimpleInterest(p, r, t);
        double ci = Account.calculateCompoundInterest(p, r, t);

        System.out.printf("Simple Interest: %.2f\n", si);
        System.out.printf("Compound Interest: %.2f\n", ci);

        sc.close();
    }
}
