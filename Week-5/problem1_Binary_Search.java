import java.util.Arrays;
import java.util.Scanner;
public class problem1_Binary_Search{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("\nEnter " +n+ " elements");
        for(int i = 0; i<a.length; i++){
            System.out.print("Enter at index " +i+ ": ");
            a[i] = sc.nextInt();
        }
        System.out.println("\nGiven array: ");
        for(int i = 0; i<a.length; i++){
            if(i == a.length-1){
                System.out.println(a[i]);
            }
            else{
                System.out.print(a[i]+ ", ");
            }
        }
        boolean isSorted = true;
        for(int i = 0; i<a.length; i++){
            if(i>0){
                if(a[i-1]>a[i]){
                    isSorted = false;
                    break;
                }
            }
        }
        if(!isSorted){
            System.out.println("\nArray is not sorted. Sorting it now...");
            for(int i = 0; i<a.length; i++){
                for(int j = 0; j<a.length-1; j++){
                    if(a[j]>a[j+1]){
                        int temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                    }
                }
            }
            System.out.println("\nSorted Array: " +Arrays.toString(a));
        }
        else{
            System.out.println("Array is already sorted!");
        }
        int end = a.length-1;
        int start = 0;
        int middle;
        System.out.print("\nEnter a number you want to search for: ");
        int search = sc.nextInt();
        while(start <= end){
            middle = (start + end)/2;
            if(search == a[middle]){
                System.out.println("\nNumber found at index: " +middle);
                break;
            }
            else if(search > a[middle]){
                start = middle + 1;
            }
            else{
                end = middle - 1;
            }
        }
        if(start > end){
            System.out.println("Number does not found in this array!");
        }
    }
}