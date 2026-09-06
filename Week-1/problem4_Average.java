 
import java.util.Scanner;
public class problem4_Average{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double average =  (a+b+c)/3;
        System.out.println("Average is: "+average);
    }
}