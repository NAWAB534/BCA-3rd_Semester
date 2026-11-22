import java.util.Scanner;
public class problem7_GCD_WithRecursion {
    public static int GCD(int a, int b){
        if(b == 0){
            return a;
        }
        return GCD(b, a%b);
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
