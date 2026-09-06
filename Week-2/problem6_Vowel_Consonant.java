import java.util.Scanner;
public class problem6_Vowel_Consonant {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char ch = sc.next().charAt(0);
        char lowerch = Character.toLowerCase(ch);
        if((lowerch >='a' && lowerch <='z')){
            if(lowerch =='a' || lowerch =='e' || lowerch =='i' || lowerch == 'o' || lowerch =='u'){
                System.out.println(ch+ " is vowel");
            }
            else{
                System.out.println(ch+ " is consonant");  
            }
        }
        else{
            System.out.println(ch+ " is not a valid character.");
        }
    }
}