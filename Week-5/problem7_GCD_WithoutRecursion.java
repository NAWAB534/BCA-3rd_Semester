import java.util.Scanner;
public class problem7_GCD_WithoutRecursion {
    public static int GCD(int a, int b){
        while(b!=0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = GCD(a,b);
        System.out.println("GCD of " +a+ " and " +b+ " is: " +result);
    }
}
