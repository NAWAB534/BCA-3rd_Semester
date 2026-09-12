import java.util.Scanner;
public class problem6_LinearSearch {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n(to insert n elements in array): ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("\nEnter " +n+ " elements");
        for(int i = 0; i<a.length;i++){
            System.out.print("Enter at index " +i+ ": ");
            a[i] = sc.nextInt();
        }
        System.out.println("\nGiven Array ");
        for(int i = 0; i<a.length;i++){
            if(i==a.length-1){
                System.out.println(a[i]);
            }
            else{
                System.out.print(a[i]+ ", ");
            }
        }
        System.out.println("\nEnter a target number to search in array: ");
        int target  = sc.nextInt();
        int index = -1;
        for(int i = 0; i<a.length; i++){
            if(a[i] == target){
                index = i;
                break;
            }
        }
        System.out.println("\n---Search Result---");
        if(index != -1){
            System.out.println("Element " +target+ " found at index " +index);
        }
        else{
            System.out.println("Element " +target+ " is not fouund in the array.");
        }
    }
}
