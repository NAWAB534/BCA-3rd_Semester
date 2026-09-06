import java.util.Scanner;
public class problem1_Even_Odd {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println(a+ " is Even");
        }
        else{
            System.out.println(a+ " is Odd");
        }
    }
}


//import java.util.Scanner;
//public class problem1_Even_Odd{
    //public static void main(String[]args){
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter a number: ");
        //int a = sc.nextInt();
        //boolean isEven = true;
        //if(a%2 != 0)
            //isEven = false;
        //if(isEven)
            //System.out.println(a+" is even");
        //else
            //System.out.println(a+" is odd");
    //}
//}