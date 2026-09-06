import java.util.Scanner;
public class problem1_2_display_sum_of_array{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of element you want to insert in array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum = 0;
        System.out.println("Enter " +n+ " elements");
        for (int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Array elements are: ");
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println("Sum of all elemnts of array: "+sum);
    }
}