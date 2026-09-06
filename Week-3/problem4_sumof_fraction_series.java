import java.util.Scanner;
public class problem4_sumof_fraction_series{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter of element: ");
        double a = sc.nextDouble();
        double sum = 0;
        for(int i = 1; i<=a; i++){
            sum = sum + 1.0/i;
            System.out.println("sum is "  +sum);
        }
    }
}