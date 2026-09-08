import java.util.Scanner;
public class problem10_ReverseArrayElements {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements insert in array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " +n+ " elements");
        for(int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("original array is: ");
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
        for(int i = 0; i<a.length/2; i++){
            int temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }
        System.out.println("Reversed array: ");
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}