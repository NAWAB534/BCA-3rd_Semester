import java.util.Scanner;
public class problem1_oddNumbers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n(print odd numbers upto n): ");
        int n = sc.nextInt();
        int count = 0;
        System.out.println("\nOdd numbers upto " +n+ " are: ");
        for(int i = 1; i<=n; i++){
            if(i%2!=0){
                if(i==n)
                System.out.println(i);
                else
                    System.out.print(i+", ");
                count++;
            }    
        } 
        System.out.println("\nThere are "+count+ " odd numbers between 1 to " +n);
    }
}
