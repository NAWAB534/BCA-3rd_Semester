
//public class problem2_Largest {
  //  public static void main(String[]args){
    //    int a = 5;
      //  int b = 53;
        //int c = 52;
        //if(a>b && a>c)
            //System.out.println(a+" is largest");
        //else if (b>a && b>c)
  //          System.out.println(b+" is largest");
        //else 
          //  System.out.println(c+" is largest");
    //}
    
//}
import java.util.Scanner;
public class problem2_Largest{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double largest = Math.max(num1,Math.max(num2, num3));
        System.out.println(largest+" is largest");
    }
}