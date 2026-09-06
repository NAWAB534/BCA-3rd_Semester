import java.util.Scanner;
public class problem8_sumOfEvenNumbers{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number N (for Sum of even numbers from 1 to N) : ");
        double N = sc.nextDouble();
        double sum = 0;
        for(int i = 1 ; i <= N; i++){
            if(i%2==0){
                sum = sum + i;
            }
        }
        System.out.println("sum of even number from 1 to "+N+ " = " +sum);
    }
}