package week9;

import java.util.Scanner;

interface Bike {
    void offer();

    default void details() {
        System.out.println("Bike Details: 150cc Engine, 5-Speed Manual Gear, Disc Brakes.");
    }
}

interface Scooty {
    void offer();

    default void details() {
        System.out.println("Scooty Details: 110cc Engine, Gearless Automatic, Under-seat Storage.");
    }
}

class BuySomething implements Bike, Scooty {
    private String customerChoice;

    public BuySomething(String customerChoice) {
        this.customerChoice = customerChoice;
    }

    @Override
    public void offer() {
        System.out.println("Special Festival Offer on " + customerChoice + ": Flat Rs. 5,000 Cashback + Free Helmet!");
    }

    @Override
    public void details() {
        System.out.println("--- Comparing Two-Wheeler Specifications ---");
        Bike.super.details();
        Scooty.super.details();
    }
}

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Are you looking to buy a Bike or a Scooty? ");
        String choice = sc.nextLine();

        BuySomething buyer = new BuySomething(choice);
        System.out.println();
        buyer.offer();
        buyer.details();

        sc.close();
    }
}