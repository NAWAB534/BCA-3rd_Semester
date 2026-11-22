import java.util.Scanner;
public class problem6_Fibonacci_Recursion {
    public static int getFibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return getFibonacci(n - 1)+ getFibonacci(n - 2);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms to print: ");
        int term = sc.nextInt();
        if(term <= 0){
            System.out.println("Enter a positive number to get fibonacci series!");
        }
        else{
            System.out.println("Fibonacci series: ");
            for(int i = 0; i < term; i++){
                System.out.print(getFibonacci(i) + " ");
            }
            System.out.println();
        }
    }
}
