import java.util.Arrays;
import java.util.Scanner;
public class problem2_Sorting{
    public static void CheckAndSort(int[] arr){
        if(arr == null || arr.length<=1){
            System.out.println("Array is already sorted!");
            return;
        }
        boolean isSorted = true;
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("\nResult: The array is already sorted!");
        }
        else{
            System.out.println("\nResult: The array was not sorted. Sorting now...");
            Arrays.sort(arr);
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " +n+ " elements");
        for(int i = 0; i<a.length; i++){
            System.out.print("Enter at index " +i+ " :");
            a[i] = sc.nextInt();
        }
        CheckAndSort(a);
        System.out.println("\nSorted array" +Arrays.toString(a));
    }
}