import java.util.Scanner;
public class problem5_PrintPrime {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n (to print prime upto n): ");
        int n = sc.nextInt();
        System.out.println("Prime numbers between o to " +n+ " are");
        boolean first = true;
        for(int i = 2; i<=n; i++){
            boolean isPrime = true;
            for(int j = 2; j<=Math.sqrt(i); j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                if(!first){
                    System.out.print(", ");
                } 
                System.out.print(i);
                first = false;
            }
                    
        }
        System.out.println();
    }
}
