import java.util.Scanner;
public class problem7_Area_Of_Rectangle{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth of rectangle: ");
        double L = sc.nextDouble();
        double B = sc.nextDouble();
        double Area = L*B;
        System.out.println("Area of rectangle: " +Area+ " sq. unit");
    }
}