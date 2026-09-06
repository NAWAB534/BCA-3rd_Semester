
import java.util.Scanner;
public class problem6_Swap{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Numbers before Swapping: " + "a: " +a+ "b:" +b);
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Numbers After Swapping");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}