package week8;
import java.util.Scanner;

public class problem3 {

    public static void minMaxAdd(int a, int b) {
        System.out.println("\n[Integers]");
        System.out.println("Minimum: " + Math.min(a, b));
        System.out.println("Maximum: " + Math.max(a, b));
        System.out.println("Addition: " + (a + b));
    }

    public static void minMaxAdd(double a, double b) {
        System.out.println("\n[Real Numbers]");
        System.out.println("Minimum: " + Math.min(a, b));
        System.out.println("Maximum: " + Math.max(a, b));
        System.out.println("Addition: " + (a + b));
    }

    public static void minMaxAdd(char a, char b) {
        System.out.println("\n[Characters]");
        System.out.println("Minimum: " + (char) Math.min(a, b));
        System.out.println("Maximum: " + (char) Math.max(a, b));
        System.out.println("Addition (ASCII sum): " + (a + b) + " (Concatenated: " + a + b + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();

        System.out.print("Enter two real numbers: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();

        System.out.print("Enter two characters: ");
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);

        minMaxAdd(i1, i2);
        minMaxAdd(d1, d2);
        minMaxAdd(c1, c2);

        sc.close();
    }
}