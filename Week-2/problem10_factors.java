import java.util.Scanner;
public class problem10_factors{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if(a<=0){
            System.out.println("Invalid! Enter a positive number.");
        }
        else{
            System.out.print("Facors of "+a+" are: ");
            for(int i = 1; i<=a; i++){
                if(a%i==0){
                    if(i==a){
                        System.out.println(i);
                    }
                    else{
                        System.out.print(i+", ");
                    }
                }
            }
        }
    }
}