import java.util.Scanner;
public class problem2_Prime {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number(for checking prime or not): ");
        int n = sc.nextInt();
        for(int i = 2; i<=n/2; i++){
            if(n%i==0){
                System.out.println(n+ " is not prime");
                return;
            }
        }
        System.out.println(n+ " is prime");
    }
}
