import java.util.Scanner;
public class problem5_DivideBy2Until10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number(for dividing it by 2): ");
        double number = sc.nextDouble();
        if(number>=10){
            number = number / 2;
            System.out.println("current value: "+number);
        }
        System.out.println("Finished! current value is less than 10: "+number);
    }
}
