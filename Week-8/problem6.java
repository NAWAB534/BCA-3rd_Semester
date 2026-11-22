package week8;

import java.util.Scanner;

class University {
    String name;
    int ranking;

    public University(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }
}

class Faculty extends University {
    String name;

    public Faculty(String uniName, int ranking, String facultyName) {
        super(uniName, ranking);
        this.name = facultyName;
    }

    public void Details() {
        System.out.println("University Name: " + super.name);
        System.out.println("Faculty Name: " + this.name);
    }
}

class Department extends Faculty {
    String name;
    String chairman;

    public Department(String uniName, int ranking, String facultyName, String deptName, String chairman) {
        super(uniName, ranking, facultyName);
        this.name = deptName;
        this.chairman = chairman;
    }

    @Override
    public void Details() {
        System.out.println("Department Name: " + this.name);
        System.out.println("Chairman: " + this.chairman);
    }

    public void Display() {
        super.Details(); // Calls Faculty's Details()
        this.Details();  // Calls Department's Details()
    }
}

public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter University Name: ");
        String uniName = sc.nextLine();

        System.out.print("Enter University Ranking: ");
        int ranking = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Faculty Name: ");
        String facultyName = sc.nextLine();

        System.out.print("Enter Department Name: ");
        String deptName = sc.nextLine();

        System.out.print("Enter Chairman Name: ");
        String chairman = sc.nextLine();

        Department dept = new Department(uniName, ranking, facultyName, deptName, chairman);

        System.out.println("\n--- Department & University Info ---");
        dept.Display();
        System.out.println("University Ranking: " + dept.ranking);

        sc.close();
    }
}