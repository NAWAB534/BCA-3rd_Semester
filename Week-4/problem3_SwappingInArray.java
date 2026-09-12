import java.util.Scanner;
public class problem3_SwappingInArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n(for defining length of array): ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("\nEnter " +n+ " elements");
        for(int i = 0; i<a.length; i++){
            System.out.print("Enter at index " +i+ ": ");
            a[i] = sc.nextInt();
        }
        System.out.println("\nArray before Swapping");
        for(int i = 0; i<a.length; i++){
            if(i==a.length-1){
                System.out.println(a[i]);
            }
            else{
                System.out.print(a[i]+ ", ");
            }
        }
        int temp = a[0];
        a[0] = a[a.length-1];
        a[a.length-1] = temp;
        System.out.println("\nArray after Swapping first and last element");
        for(int i = 0; i<a.length; i++){
            if(i == a.length-1){
                System.out.print(a[i]);
            }
            else{
                System.out.print(a[i]+ ", ");
            }
        }
    }
}
