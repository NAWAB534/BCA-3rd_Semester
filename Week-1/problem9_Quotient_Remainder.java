import java.util.Scanner;
public class problem9_Quotient_Remainder{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers(dividend and divisor): ");
        double dividend = sc.nextDouble();
        double divisor = sc.nextDouble();
        double Q = dividend/divisor;
        double R = dividend%divisor;
        System.out.println("Quotient: "+Q);
        System.out.println("Remainder: "+R);        
    }
}