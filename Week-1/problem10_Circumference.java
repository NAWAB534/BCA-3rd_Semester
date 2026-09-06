import java.util.Scanner;
public class problem10_Circumference{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        double radius = sc.nextDouble();
        double Circumference = 2*Math.PI*radius;
        System.out.println("Circumference: "+Circumference);
    }
}