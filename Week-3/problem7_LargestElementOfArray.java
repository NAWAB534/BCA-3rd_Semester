import java.util.Scanner;
public class problem7_LargestElementOfArray{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for(int i = 1; i<a.length; i++){
            max = Math.max(max, a[i]);
        }
        System.out.println("The largest element in the array is: "+max);
    }
}