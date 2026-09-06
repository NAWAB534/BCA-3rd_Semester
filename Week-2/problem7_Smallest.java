import java.util.Scanner;
public class problem7_Smallest{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();
        double smallest = Math.min(num4,Math.min(num3,Math.min(num2, num1)));
        System.out.println(smallest+ " is smallest");
    }
}