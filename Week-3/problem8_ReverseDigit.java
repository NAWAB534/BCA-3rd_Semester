import java.util.Scanner;
public class problem8_ReverseDigit{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an intger: ");
        int n = sc.nextInt();
        int rev = 0;
        while(n!=0){
            int digit = n %10;
            rev = rev * 10 + digit;
            n = n/10;
        }
        System.out.print("Original number: " +n);
        System.out.println("reversed number: " +rev);
    }
}