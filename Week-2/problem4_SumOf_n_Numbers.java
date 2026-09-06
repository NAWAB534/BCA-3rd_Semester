import java.util.Scanner;
public class problem4_SumOf_n_Numbers{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number N(for sum from 1 to N) : ");
        int N = sc.nextInt();
        int sum = 0; 
        for(int i = 1; i<=N; i++){
            sum = sum + i;
        }    
        System.out.println("Sum of "+N+ " numbers = " +sum);
    }
}