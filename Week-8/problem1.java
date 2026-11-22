package week8;

import java.util.Scanner;

class Person {
    String name;
    String phone;
    Address addr;
    DateOfBirth dob;

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    class Address {
        String House_No, Street, City, State;

        public Address(String House_No, String Street, String City, String State) {
            this.House_No = House_No;
            this.Street = Street;
            this.City = City;
            this.State = State;
        }

        public void displayAddr() {
            System.out.println("Address: " + House_No + ", " + Street + ", " + City + ", " + State);
        }
    }

    class DateOfBirth {
        int Day, Month, Year;

        public DateOfBirth(int Day, int Month, int Year) {
            this.Day = Day;
            this.Month = Month;
            this.Year = Year;
        }

        public void displayDOB() {
            System.out.println("Date of Birth: " + Day + "/" + Month + "/" + Year);
        }
    }

    public void Display() {
        System.out.println("\n--- Person Details ---");
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        if (addr != null) addr.displayAddr();
        if (dob != null) dob.displayDOB();
    }
}

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();

        Person p = new Person(name, phone);

        System.out.print("Enter House No: ");
        String hNo = sc.nextLine();
        System.out.print("Enter Street: ");
        String street = sc.nextLine();
        System.out.print("Enter City: ");
        String city = sc.nextLine();
        System.out.print("Enter State: ");
        String state = sc.nextLine();

        p.addr = p.new Address(hNo, street, city, state);

        System.out.print("Enter Birth Day: ");
        int day = sc.nextInt();
        System.out.print("Enter Birth Month: ");
        int month = sc.nextInt();
        System.out.print("Enter Birth Year: ");
        int year = sc.nextInt();

        p.dob = p.new DateOfBirth(day, month, year);

        p.Display();
        sc.close();
    }
}