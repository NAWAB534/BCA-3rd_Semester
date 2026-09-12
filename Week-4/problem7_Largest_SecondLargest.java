import java.util.Scanner;
public class problem7_Largest_SecondLargest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to determine the size of an Array: ");
        int n = sc.nextInt();
        if(n<2){
            System.out.println("Array must contain at least two elements.");
            return;
        }
        int a[] = new int[n];
        System.out.println("Enter " +n+ " elements");
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
        int largest = a[0];
        int secondLargest = a[0];
        for(int i = 0; i<a.length; i++){
            if(a[i]>largest){
                secondLargest = largest;
                largest = a[i];
            }
            else if(a[i]<largest && (a[i]>secondLargest || secondLargest == largest)){
                secondLargest = a[i];
            }
        }
        if(largest==secondLargest){
            System.out.println("\nBoth largest and second largest are same: "+largest+secondLargest);
        }
        else{
            System.out.println("\nLargest element of this Array: "+largest);
            System.out.println("Second Largest element of this Array: "+secondLargest);
        }
    }
}
