import java.util.Scanner;
public class problem6_Fibonacci_Without_Recursion {
    public static void printFibonacci(int count){
        int first = 0;
        int second = 1;
        System.out.print("Fibonacci Series: ");
        for(int i = 1; i <= count; i++){
            System.out.print(first+ " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms to print:");
        int term = sc.nextInt();
        if(term <= 0){
            System.out.println("Enter a positive number!");
        }
        else{
            printFibonacci(term);
        }
    }    
}