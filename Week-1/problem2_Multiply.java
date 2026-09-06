import java.util.Scanner;
public class problem2_Multiply{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a*b;
        System.out.println("The product of two number is: " +product);        
    }
}
