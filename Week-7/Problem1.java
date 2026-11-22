package week7;
import java.util.Scanner;

class Vehicle {
    double fare;

    public Vehicle(double fare) {
        this.fare = fare;
    }

    public void cost() {
        System.out.println("Ticket Cost: Rs. " + fare);
    }
}

class Bus extends Vehicle {
    public Bus(double fare) {
        super(fare);
    }

    public void display() {
        System.out.println("Vehicle Type: Bus");
    }
}

class Train extends Vehicle {
    public Train(double fare) {
        super(fare);
    }

    public void display() {
        System.out.println("Vehicle Type: Train");
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bus ticket cost: ");
        double busCost = sc.nextDouble();
        Bus myBus = new Bus(busCost);

        System.out.print("Enter Train ticket cost: ");
        double trainCost = sc.nextDouble();
        Train myTrain = new Train(trainCost);

        System.out.println("\n--- Output ---");
        myBus.display();
        myBus.cost();

        System.out.println("--------------");

        myTrain.display();
        myTrain.cost();

        sc.close();
    }
}

