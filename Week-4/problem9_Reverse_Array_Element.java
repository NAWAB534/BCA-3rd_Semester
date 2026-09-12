import java.util.Scanner;
public class problem9_Reverse_Array_Element {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to determine the size of an array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("\nEnter " +n+ " elements");
        for(int i = 0; i<a.length; i++){
            System.out.print("Enter at index "+i+ ": ");
            a[i] = sc.nextInt();
        }
        System.out.println("\nArray before reversing its elements");
        for(int i = 0; i<a.length; i++){
            if(i == a.length-1){
                System.out.println(a[i]);
            }
            else{
                System.out.print(a[i]+", ");
            }
        }
        for(int i = 0; i<n/2; i++){
            int temp = a[i];
            a[i] = a[n-1-i];
            a[n-1-i] = temp;
        }
        System.out.println("\nArray after reversing its elements");
        for(int i = 0; i<a.length; i++){
            if(i == a.length-1){
                System.out.println(a[i]);
            }
            else{
                System.out.print(a[i]+", ");
            }
        }
    }
}
