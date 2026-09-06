//public class problem3_Mutiplication_Table{
  //  public static void main(String[]args){
    //    int i = 5;
      //  for(int n=1; n<=10; n++ ){
        //    int result=i*n;
          //  System.out.println(i+ "X" +n+ "=" +result);
            
       // }
   // }
// }
import java.util.Scanner;
public class problem3_Mutiplication_Table{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Table of " +a);
        for(int i = 1; i<=10; i++){
            int result = a*i;
            System.out.println(a+ "X" +i+ "=" +result);
        }
    }
}