import java.util.Scanner;
public class problem3_Cube{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a Number: ");
        int a = sc.nextInt();
        int cube = a*a*a;
        System.out.println("Cube of "+a+ " is " +cube);
    }   
}