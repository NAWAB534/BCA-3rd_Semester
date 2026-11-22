import java.util.Scanner;
public class problem5_Factorial_Recursion {
    public static long calculateFactorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n*calculateFactorial(n-1);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Factorial is not defined for negative numbers.");
        }
        else{
            long result = calculateFactorial(n);
            System.out.println("The factorial of " +n+ " is: " +result);
        }
    }
}
