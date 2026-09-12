import java.util.Scanner;
public class problem4_Max_Min_InArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n(to insert n elements in array): ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("\nEnter "+n+" elements");
        for(int i = 0; i<a.length; i++){
            System.out.print("Enter at index " +i+ ": ");
            a[i] = sc.nextInt();
        }
        System.out.println("\nGiven Array");
        for(int i = 0; i<a.length; i++){
            if(i==a.length-1){
                System.out.println(a[i]);
            }
            else{
                System.out.print(a[i]+ ", ");
            }
        }
        int max = a[0];
        for(int i = 0; i<a.length; i++){
            max = Math.max(max, a[i]);
        }
        System.out.print("\nMaximum element of this array is: ");
        System.out.print(max);
        int min = a[0];
        for(int i = 0; i<a.length; i++){
            min = Math.min(min, a[i]);
        }
        System.out.print("\nMinimum element of this array is: ");
        System.out.print(min);
    }
}
